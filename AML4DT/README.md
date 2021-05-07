In this folder, the prototypical implementation of the AML4DT framework is described, and the implemented artifacts are presented.

# AML Template
To add annotations to existing AML models that are required to make them suitable for the AML4DT framework as an input, templates that contain the required extensions to the CAEX metamodel are provided in Folder [Templates](./Templates). These templates can also be used to create new models using these annotations.
- The file template.xmi can be directly used in the [CAEX-Workbench](https://github.com/amlModeling/caex-workbench) (tested with version from 7. Mai 2021).
- The file template.aml can be used in the [AutomationML Editor](https://www.automationml.org/o.red.c/dateien.html?cat=1) (tested with version 5.3.3)
To create or adapt models based on this template, just open the respective file in the corresponding editor.


# MDE Part
The MDE part is implemented using the [Eclipse Modeling Framework EMF](https://www.eclipse.org/modeling/emf/). More specifically, the following artifacts are implemented:

**Metamodels:** We also provide an EMF implementation of our proposed DT-M, which is abstracted from definitions of common providers of digital twin platforms. Additionally, we provide an implementation of the proprietary DTML metamodel that is used by the [Azure Digital Twin platform](https://azure.microsoft.com/services/digital-twins/) offered by Microsoft (this platform is further used for our prototypical implementation).

**Transformation:** To automatically create DTDL-Models from AML models, we implemented an Out-Place Transformation using the Atlas Transformation Language (ATL)\footnote{\url{https://wiki.eclipse.org/ATL/User_Guide_-_Overview_of_the_ATL_Language}}. This language was chosen due to its wide range of functionality and acceptance in the scientific community.

**Code-Generation:** In order to automatically derive the json-files that are required as input for the Azure Digital Twin platform (and the simulators used in our evaluation), we provide a XTEND code generation project that generates the required format from DTDL-models.

# Cloud Part (Digital Twin Platform)
The Digital Twin platform is implemented using the [Azure platform](https://azure.microsoft.com/).
More specifically, the following services are used:
- The [Azure Digital Twin (ADT) service](https://azure.microsoft.com/services/digital-twins/) to manage the Digital Twins, analyze and visualize data. The setup of the DTs is based on the information in our model and performed automatically by sending json files that correspond to the [Digital Twin Definition Language (DTDL) defined by Microsoft](https://github.com/Azure/opendigitaltwins-dtdl/blob/master/DTDL/v2/dtdlv2.md). In the cases used for evaluation, the generated json files for the DT\_Types are sent to the REST endpoint offered by the adt service using a python script. The generated json files for the DT\_Instances are deployed to a folder on the controller. Applications that run on this controller can use these files to retrieve information about the corresponding twins, e.g. to automatically register the respective DT\_Instances in the DT platform on startup.
- The [Time Series Insights (TSI) service](https://azure.microsoft.com/services/time-series-insights/) is used storing and visualizing historical values of properties. Data is sent by the devices to the ADT-service, and then forwarded to the TSI service using the azure functions described in the next step. In order to process and visualize this data correctly, the corresponding meta-information must be set up in TSI beforehand (based on the information in ADT). This meta-information consists of types and instances that can be derived from the DT\_Types and DT\_Instances stored in the adt service. More specifically, types are created based on the json-files for the DT\_Types that correspond to the DTDL, using the same pyhton script as for the ADT service. The instances are synchronized with the information in adt via an application that is deployed in azure. This application is triggered every time that a DT\_Instance is created, updated or deleted in adt and adapts the corresponding instances in tsi accordingly.
- [Azure Functions](https://azure.microsoft.com/services/functions/) to process data and structural updates from the ADT service to the TSI service. Triggering of the functions and processing of returned values is managed using [Azure Event Hubs](https://azure.microsoft.com/de-de/services/event-hubs/). The c# code for the functions is available in the [Azure](./Azure) folder.

Using this setup, the case study described in the [Evaluation](/Evaluation) folder can be performed.