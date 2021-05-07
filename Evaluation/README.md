To evaluate the proposed AML2DT framework, a case study was performed.

In this case study, two cases were used, that are described in more detail in the folders [Case1](./Case1) and [Case2](./Case2) respectively.

In the case study, three research questions were posed.
- The data and results for the first research question are available in the folders [Case1](./Case1) and [Case2](./Case2) respectively.
- The data and results for the second research question are available in the folders [Setup](./Setup).
- The data and results for the thirs research question are available in the folders [EvolutionCases](./EvolutionCases).

For research question 1 and 2, the corresponding steps are performed in the following 2 settings:

In the **AML2DT setting**, all artifacts of the prototypical implementation of the proposed AML2DT framework (available in Folder [AML2DT](/AML2DT)) as well as the AML2DT mode of Case 1 described in folder [Case1](./Case1) is used. In short, this means that setup and adaptations are solely based on the AML models.

In the **traditional setting**, there is no dedicated automation support besides the tools offerec by the microsoft platform. More specifically, the azure function provided in folder [Azure](/AML2DT/Azure) is set up, and the traditional mode of Case 1 described in folder [Case1](./Case1) is used. In short, this means that consistency between the azure dt service, the azure time series insights, and the controller code must be ensured manually while setting up or adapting the system.