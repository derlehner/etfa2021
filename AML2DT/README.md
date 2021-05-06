In this folder, the prototypical implementation of the AML2DT framework is described, and the implemented artifacts are presented.

# Modeling Part
The modeling part is implemented using the [Eclipse Modeling Framework EMF](https://www.eclipse.org/modeling/emf/). More specifically, the following artifacts are implemented:

**Metamodels:** We also provide an EMF implementation of our proposed DT-M, which is abstracted from definitions of common providers of digital twin platforms. Additionally, we provide an implementation of the proprietary DTML metamodel that is used by the [Azure Digital Twin platform](https://azure.microsoft.com/services/digital-twins/) offered by Microsoft (this platform is further used for our prototypical implementation).

**Transformation:** To automatically create DTDL-Models from AML models, we implemented an Out-Place Transformation using the Atlas Transformation Language (ATL)\footnote{\url{https://wiki.eclipse.org/ATL/User_Guide_-_Overview_of_the_ATL_Language}}. This language was chosen due to its wide range of functionality and acceptance in the scientific community.

**Code-Generation:** In order to automatically derive the json-files that are required as input for the Azure Digital Twin platform (and the simulators used in our evaluation), we provide a XTEND code generation project that generates the required format from DTDL-models.

# Cloud Part (Digital Twin Platform)

The Digital Twin platform is implemented using the [Azure platform](https://azure.microsoft.com/).
More specifically, the following services are used:
- The [Azure Digital Twin (ADT) service](https://azure.microsoft.com/services/digital-twins/) to manage the Digital Twins, analyze and visualize data. 
%The setup of the DTs is based on the information in our model and performed automatically by sending json files that correspond to the \textit{Digital Twin Definition Language (DTDL)} defined by Microsoft\footnote{\url{https://github.com/Azure/opendigitaltwins-dtdl/blob/master/DTDL/v2/dtdlv2.md}}. These json files are automatically generated from DT-M models using Eclipse XTEND\footnote{\url{https://www.eclipse.org/xtend/}} code generation framework. The generated json files for the DT\_Types are sent to the REST endpoint offered by the adt service using a python script. The generated json files for the DT\_Instances are deployed to a folder on the controller\daniel{how is the correct controller identified?}. Applications that run on this controller can use these files to retrieve information about the corresponding twins, e.g. to automatically register the respective DT\_Instances in the DT platform on startup.
- The [Time Series Insights (TSI) service](https://azure.microsoft.com/services/time-series-insights/) For storing and visualizing historical values of properties, we use the Azure Time Series Insights (TSI)\footnote{\url{https://azure.microsoft.com/de-de/services/time-series-insights/}} database.
%To send data to TSI, a python script is deployed on the controller.
%In order to process and visualize this data correctly, the corresponding meta-information must be set up beforehand. This meta-information consists of types and instances that can be derived from the DT\_Types and DT\_Instances stored in the adt service. %More specifically, types are created based on the json-files for the DT\_Types that correspond to the DTDL.
%The instances are synchronized with the information in adt via an application that is deployed in azure. This application is triggered every time that a DT\_Instance is created, updated or deleted in adt and adapts the corresponding instances in tsi accordingly.
- [Azure Function](https://azure.microsoft.com/services/functions/)
https://azure.microsoft.com/de-de/services/functions/


%The \emph{Digital Twin Infrastructure} is set up using Microsoft's Azure platform\footnote{\url{https://azure.microsoft.com/}}.
%More specifically, the Azure Digital Twins service\footnote{https://azure.microsoft.com/en-us/services/digital-twins/} is used 

%


%based on digital twins required for storing data is therefore derived from the Azure Digital Twin service via a dedicated Azure Function. Another Azure Function is used to persist telemetry data from the devices into the created instance of the TSI service.

%\subsubsection{Digital Twin Evolution Support}
%After the initial setup of the Digital Twin Infrastructure, which is based on the AML model, further adaptations  might be necessary due to the evolution of the system.
%To reduce the effort of maintaining the Digital Twins, and more importantly, to keep the DTs consistent with the actual physical system,  these changes, and each evolution of the system should be automatically propagated to and incorporated in the Digital Twins from the AML model. 
%More specifically, we support $(i)$~adding new devices, links and components to the system, $(ii)$~updating non-history properties or names of devices $(iii)$ deleting devices, links and components from the system (i.e. taking them offline). If such a change is performed, the DT-Platform must be synchronized accordingly (both the adt and the tsi service).
%Therefore, these changes are translated to create, update or delete operations for DT\_Instances, their properties and their links. This translation is performed using the python script on the controller that registers the corresponding DT\_Instances based on their json-files on startup. By sending information to the REST endpoint offered by adt, the adt service automatically detects whether a new instance must be created, or an existing instance must be updated.
%\daniel{how is delete detected? on shutdown of device?}
%Synchronization with the tsi service is automated via an azure function that propagates changes in adt to the corresponding instances in tsi.