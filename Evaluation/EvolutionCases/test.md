# Evaluation {#sec:evaluation}

By our evaluation, we want to identify the automation potential of using
a model-driven framework for developing and maintaining Digital Twins.
We aim to demonstrate that $(i)$ we can create a model that can serve as
input to the AML2DT framework with reasonable effort, and $(ii)$ the
AML2DT framework can automatically provide required DT functionality
using this model.

For this purpose we compare the effort required for developing and
maintaining Digital Twins using AML2DT against a traditional approach
not leveraging model-driven techniques.

Based on this overall goal, research questions and metrics are derived
using the Goal Question Metric (GQM) approach [@caldiera1994goal]. To
perform this evaluation, we conducted a case study following the
guidelines by Runeson & Höst [@DBLP:journals/ese/RunesonH09].

## Research Questions

With our evaluation, we aimed to answer the following research questions
(RQs). **RQ1 (Feasibility):** Is it possible to describe a Digital Twin
use case using AML, and derive the virtual elements using AML2DT,
involving reasonable adaptation effort to the initial AML model?

**RQ2 (Effort of Initial Setup):** What is the effort of setting up the
Digital Twin infrastructure using AML2DT, compared to a traditional
setup without our framework.

**RQ3 (Effort of System Evolution):** What is the effort of maintaining
the system during evolution using AML2DT, compared to a traditional
maintenance without AML2DT.

**Metrics:** To answer the research questions, the following metrics
were derived. *RQ1:* To answer this research question, two metrics are
used. The *required changes* represent the effort that must be taken to
adapt an existing AML model in order to use it as input to the AML2DT
framework. The *supported DT capabilities* represent the functionality
that is expected from a DT that can be achieved using the AML2DT
framework. *RQ2/3:* To answer research questions 2 and 3, the number of
required changes to certain artifacts is used as metric representing the
effort of performing particular actions.

**Requirements on Cases:** Notes: - Auf welchen Bereich gehen wir in der
Intro ein (CPPS?) - Hardware, die regelmäßig Telemetriedaten schickt -
Need für DT muss gegeben sein (also man will Erkenntnisse darüber
gewinnen, was zur Laufzeit abgeht)

## Case Study Setup {#sec:eval_setting}

We use the following two use cases in our case study:

**Use Case 1:** The first case builds on, and extends the motivating
example described in . In this scenario, sensors are connected to
controllers that report CO2 values for a particular room in a building.
In the initial setting used for our case study, there are three rooms
*Lobby100*, *Room101* and *Room102* respectively. Each room is equipped
with a Raspberry Pi that acts as controller. Each Raspberry Pi is
connected to a CCS811 CO2 sensor, periodically collecting CO2 values of
the respective room. This data is then sent to a cloud server that
implements a DT-platform using Microsoft Azure. As a result, both the
current state of the system and the historical trend of CO2-values can
be analyzed and visualized. For the current state, Microsoft's
*ADT-Explorer* and the visualization feature of the TSI-service is used.

**Use Case 2:** The second case involves computer-controlled
transportation vehicles that, for example, move items from one place to
another within a production process. The created AML model for these
cars is based on previous work [@DBLP:conf/etfa/WolnyMW19]. In our use
case, two cars (*Car1* and *Car2*) are used where Car1 is connected to
Car2 and can thereby adjust its speed and direction.

A more detailed description of the cases, as well as example
implementations that can be used to reproduce the results of this case
study, can be found in our GitHub repository [^1].

### Evaluation Method

To answer RQ 1, an existing AML model was used for both cases. This
model was $(i)$ imported into the template including the CAEX
extensions, which is available on github, and $(ii)$ adapted to suit as
input to the AML2DT framework.

To evaluate the effort of our approach, the setup of the first use case
was performed and compared in two settings (RQ2). Additionally, we
evaluated four evolution cases on this use case to compare the effort of
maintaining a system over time (RQ3). In both settings, a Python script
was deployed on each Raspberry Pi that periodically sent measured
CO2-values to the DT-Platform that was set up using Microsoft Azure.

In the *AML2DT setting*, the prototypical implementation of the
AML2DT-framework described in was used, alongside with the AML model. In
this setting, the Python script that sent the CO2 values to the cloud
uses information from the AML model which was serialized as a JSON file
and deployed on the Raspberry Pi to retrieve the correct name of the
sensor.

In the *traditional setting*, no additional support besides the tools
and services provided by Microsoft Azure were used. Additionally, there
were two internal variables used in the Python script containing name of
the AirQualityController that had to be used when sending data in order
to correctly map the data in the DT-platform. This means that in this
setting, the consistency between the adt-service, the tsi-service and
the controller code had to be ensured manually. Adaptations to the
respective elements were therefore performed using the graphical
interfaces for the adt-service and the tsi-service. To adapt the value
of the variable in the code deployed on each Raspberry Pi, the Python
script had to be adapted manually by accessing the code via an
ssh-connection, and restarted using this same connection.

## Study Execution

For the demonstration of the feasibility (RQ1), the data for the two
proposed metrics is performed in the following way. The required changes
are calculated by counting the number of adaptations (i.e., tagging of
existing elements with properties from the template) that had to be
performed to fit the existing model into the AML2DT framework. For the
supported Digital Twin capabilities, the following functionality is
analyzed. (1) The twins were queried using the adt service. (2) Example
data was sent from the physical device to the respective Digital
Twin(s). (3) Historical data was queried using the tsi service. For each
of these functionalities that was actually available after executing the
AML2DT framework, the value of the supported DT capabilities metrics was
increased by 1.

For the effort analysis (RQ2/3), the effort of the two used settings for
the performed steps (i.e., setup and evolution cases) was calculated in
the following way. Each step was performed in both settings, and the
number of required changes to perform each setting was counted. In the
AML2DT setting, changes had to be performed only on the AML model.
Therefore, each change to this model was counted. In the traditional
setting, changes were performed on the adt service and tsi service. Each
change in each of these services was counted and aggregated.
Additionally, code that had to be changed or created, either (i) in the
code deployed to the controller, or (ii) in the description of the
instance in the tsi-service, to extract data values from incoming
messages, or (iii) in the JSON files that must be used to create types
in the adt-service, was counted and aggregated. For json files, each
property that had to be created or updated was counted as one change.
summarizes these results.

## Results {#sec:eval_results}

In the following, the results of executing the case study as described
above are presented.

**RQ1:** For each case, an AML model was created using the AutomationML
editor[^2] and the template from our GitHub repository containing the
required extensions to the CAEX-metamodel. Based on this model, the
required elements in the DT-platform were set up automatically using the
prototypical implementation of the AML2DT framework described in .

*Use Case 1:* For this use case, the created SystemUnitClassLib is shown
in . Based on this SystemUnitClassLib, the respective InstanceHierarchy
(cf. ) was created by instantiating the created SystemUnitClasses. This
AML model was then used as input to the AML2DT framework to
automatically generate a DT-model that conforms to the proposed
metamodel. This DT-M consists of three DT_Types (Room,
AirQualityController, Sensor) and nine DT_Instances (Lobby100, Room101,
Room102. Raspberry1, Raspberry1.Sensor, Raspberry2, Raspberry2.Sensor,
Raspberry3, Raspberry3.Sensor). For each type, a JSON file was then
automatically generated and uploaded to the adt service. Additionally,
for each type that contains at least one history property (i.e.,
Sensor), a Type was automatically added to the tsi service. Based on
these types, the DT_Instances were added to both services using the
information from the AML Model. Based on this setup, the three Raspberry
Pis were able to send updates of CO2 values to the DT-platform that was
then automatically added to the respective instance and visualized in
TSI as time-series data.

**Use Case 2:** In this use case, there is one main SystemUnitClass
(Car) that consists of several inner SystemUnitClasses that represent
the components of a car. More specifically, a car consists of
DistanceSensors, a MotorControl, and a ServoControl. The DistanceSensors
SystemUnitClass further consists of four history properties that measure
the distance to the next obstacle for the front, rear, left and right
side of the car. The MotorControl consists of three properties. The
currentSpeed measures the current speed of the car, which converges to
the value of the desiredSpeed property. Additionally, there is a
non-history, non-writable property that indicates the pin on the car
that must be used to adapt the desiredSpeed property. Similar
functionality is available for the current angle of the car via the
currentPos, desiredPos and pin properties of the ServoControl
SystemUnitClass. In the demonstration case, several cars can be related
to each other. A relationship from car1 to car2 means that car1 can
access current data from car2. This is modeled using two
ExternalInterfaces in the Car SystemUnitClass, and an InternalLink
connecting the two. Based on these SystemUnitClasses, two cars were
created in our demonstration case (Car1 and Car2). Additionally, Car1 is
linked to Car2 via an InternalLink.

**RQ2:** In the following, the results for analyzing the effort of the
setup procedure and four evolution cases are described. For calculating
the effort of the setup procedure, the overall process can be divided
into two main parts. First, the types had to be added. Based on these
type descriptions, specific instances were created.

In the *AML2DT setting*, the following steps were therefore required. To
setup the types, two SystemUnitClasses (Room and AirQualityController)
as well as one inner SystemUnitClass (Sensor) had to be added. This
aggregated to 6 changes in the model for adding and renaming those
SystemUnitClasses. To establish the relationship between Room and
AirQualityController, 2 ExternalInterfaces and an InternalLink between
those ExternalInterfaces had to be added (3 changes). Additonally, the
ExternalInterfaces should be renamed, and an InterfaceClassLib
relationship had to be added to one ExternalInterface in order to define
the multiplicity and the writable-property of the relationship (2
changes). To create the type and the co2value properties for Sensor, 7
more model changes were required to add the respective attributes to the
SystemUnitClass, add the *Telemetry*-annotation to the co2value
property, and define the data type for each property. To create
instances for those types, the respective InternalElements can be
created by dragging the SystemUnitClasses to the respective
InstanceHierarchy. Thereby, InternalElements, inner InternalElements,
Attributes and ExternalInterfaces were automatically created using the
same names and configurations that the base SystemUnitClass. This means
that the name of each Room and Raspberry still had to be adapted.
Additionally, the InternalLinks between the ExternalInterfaces of Rooms
and Controllers had to be added, and the value of the type property was
set for each Sensor. For our demonstration case, this aggregated to 16
changes in the AML model (cf. ).

In the *traditional (i.e., non-automated)* setting, the setup of types
in the DT-platform required the following steps. In the adt service, a
json-file was uploaded for each DT_Type, namely Room,
AirQualityController and Sensor (3 changes). To create these json-files,
16 properties had to be defined for Room, 11 properties for
AirQualityController, and 15 properties for Sensor. In the tsi service,
a type was added for Sensor, because it contained a history property
(co2value). 2 changes were required to add this type and change its
name. Additionally, during type creation, a variable was added for
co2value. To add this property, change its name and define its mapping
for incoming events, 2 changes and 1 line of code were executed. To
setup instances based on these types, the following steps were
necessary. In the adt-service, 12 changes were performed to change
create 3 Rooms and 3 AirQualityControllers and rename each of them.
Additionally, 3 changes were performed to create the links between rooms
and controllers, and 3 changes were performed to set a value for the
type property of each Sensor. In TSI, an instance for each Sensor was
created. Therefore, 9 changes were performed to add these types and add
a name and reference to a Type for each of these instances.
Additionally, the name of each AirQualityController was also added to
the code deployed on the Raspberry Pi, which aggregated to 3 changes on
the code.

**RQ 3:** While setting up the DT-platform based on the initial setting
of the physical system is an important initial task, maintaining
consistency between the physical system and its virtual representation
is an equally important task. As systems are prone to changes over time,
to address new requirements or accommodate additional features, these
changes must be reflected in the DT-platform as well. We simulated this
need for co-evolution with the following four evolution cases.

*Evolution Case 1 (EC1): Add a new Raspberry*. In the first case, a new
Raspberry Pi (Raspberry4) is added to the system, together with a
corresponding CO2 sensor. In a first step, the Raspberry Pi is used for
initial testing of new features and hence not assigned to a particular
room, while data still has to be sent to the Digital Twin. Therefore,
the corresponding DT_Instance for this AirQualityController must be
created in the dt-platform. In the AML2DT-supported approach, this can
be achieved by adding a new InternalElement of type
AirQualityController, and adapting its name accordingly (2 changes). In
the traditional approach, the add and rename changes must be performed
in the adt service for the AirqualityController, and in the tsi service
for the Sensor. Additionally, the name of the DigitalTwin must be set in
the Raspberry code.

*Evolution Case 2 (EC2): *Add raspberry to room**. After the setup of
the individual device was completed (cf. EC1), it was assigned to a
particular room (Room201) to report values for this specific room. In
the DT-platforms this requires the following changes. (1) A new
DT_Instance had to be created, and (2) the name of this instance was
changed to Room201. (3) A link between Room201 and Raspberry4 must be
established. These three changed had to be performed in the AML model
for the AML2DT setting, and in the adt service for the traditional
setting.

*Evolution Case 3 (EC3): *Change name of Raspberry**. DT evolution does
not only include creating new elements, but could also require existing
elements to be updated and modified. As a representative case of
upating, the name of each room is changed. Therefore, in the AML model,
the name of the corresponding InternalElement must be adapted (1
change). In the traditional setting, this name must be adapted for the
corresponding instance of the Raspberry in the adt service (1 change),
and the name of Sensor-instance in tsi which also consists of the
corresponding Raspberry name to be uniquely identifiable (1 change).
Additionally, the controller code must be adapted (1 code change)

*Evolution Case 4 (EC4): *Delete Room**. Besides creating and updating
elements, they can also be deleted after time. As an example from our
demonstration case, we therefore deleted a room from our system. In
AML2DT, this yielded 2 changes. In the AML model, both the Room and the
corresponding AirQualityController had to be deleted (InternalLink and
Sensor were deleted automatically). In the traditional setting without
the AML2DT support, there were three changes required in the adt
service. Before deleting the Room and the AirQualityController, the link
between the two had to be deleted. Additionally, the instance for the
Sensor must be deleted in the tsi service.

## Discussion

To answer RQ1, we have shown that a DT scenario can be described using
AML, and that the required infrastructure (i.e., the DT-platform) can be
automatically created by our framework.

In terms of the required effort (RQ2) we can conclude that our approach
did reduce the effort required to create and set up the DT. In the
AML2DT setting, 36 changes had to be performed on the AML model in order
to setup types and instances in the dt-platform. In the traditional
setting, 80 changes must be performed. Besides this 120 % increase in
changes, there's also the challenge that they have to be consistent at
three different places, in the adt service, the tsi service, and the
controller code. Additionally, the 46 code changes might provide a
challenge for users not familiar with the system. This effort was
significantly reduced in the AML2DT setting, where all the changes were
performed at a single point of the framework, on the model level.
Additionally, the this model might already be provided, , further
reducing the required effort.

Regarding the evolution cases (RQ3), using AML2DT yields a 25 % decrease
in changes compared to the traditional setting. While the reducing of
required changes was not as significant in EC2 in which a relationship
was added in EC3 in which the name of the Raspberry was changed a (67 %
reduction could be achieved. In none of the cases, the traditional
approach required fewer changes than the AML2DT-based approach. In two
cases, additional changes to the Raspberry code were also required.

## Threats to Validity

Our work is subject to several threats to validity. While we have shown
that our AML2DT framework is applicable to a real-world system, with
real hardware and software, we have only used a limit number of devices
and evolution scenarios un our case study. We therefore cannot claim
generalizability. We will conduction additional evaluations to ensure
that our framework is applicable to a wider range of systems and
hardware components. We demonstrated our approach using the Microsoft
Azure Digital Twin Platform. While this is a well-established platform,
in order to demonstrate the applicability to a broader range of
technologies, we plan on extending our approach to support as part of
our ongoing and future work.

Regarding internal validity of the analysis and comparison of evolution
tasks, we followed the recommended guidelines and official documentation
on how to add new instances and update elements in the Microsoft Azure
Digital Twin Platform.

Only covered structural changes for evolution, but e.g. not what happens
with data (future work). Only Digital Shadow, no communication from
digital to physical twin.

[^1]: <https://github.com/derlehner/etfa2021>

[^2]: <https://www.automationml.org/o.red.c/dateien.html?cat=1>
