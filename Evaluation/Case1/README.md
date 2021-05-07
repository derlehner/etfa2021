# Description
Consider a system set up to collect CO2 measurements
using sensors locating in rooms within several buildings. The
system is designed to provide users with recommendations
on when to ventilate, e.g., by opening windows or adjusting air conditioning to reduce CO2 concentration. Reduced
CO2 levels can increase work performance and comfort and
significantly decrease virus infection rates. In order to equip
it’s buildings with such sensors, the customer buys hardware,
more specifically, CO2 sensors and controllers that retrieve
and process the CO2 measurements from the sensors.

In order to perform recommendations and gain insights into
the overall CO2 concentration of the entire office building,
the customer wants to establish a platform that provides
information about the status of the rooms regarding their
CO2 levels. Thus, a Digital Twin representation of the
building, its rooms, and its sensors is needed. This platform
is the used to collect data, show CO2 measurements, and
perform analyses (cf. Fig. 1). Establishing such an infrastructure, however, requires additional effort beyond buying the
necessary hardware. The customer has to setup and maintain
the heterogeneous hardware, the digital twin,
and the synchronization of both in order to establish the
wanted platform. This manual effort often requires knowledge
and time, which the customer might not have. To overcome
this issue in a first step, the customer can use models such as
AML models in order to describe structures and geometries,
since they enable the transfer in heterogeneous engineering
tool landscapes.

# Contents
To get an overview of the structure of this use case, airquality.aml is an automationML model showing an example type and instance level (i.e. the initial setting used in the paper).
In order to replicate this use case, the folder RaspberryCode contains all the needed files that must run on the Raspberry Pi.
The demonstration case can be performed in two modes.
To use the code in the traditional mode without automation support, run file main_traditional.py.
To use the code in the AML2DT-supported mode, run file main_automated.py. Before starting this file, the json-files
Additionally, the folder xx contains a simulation model to setup the raspberry in the azure platform.
## required adaptations
In both the simulation and the raspberry code, the base url and bearer token must be adapted to allow interactions with the REST apis of azure services in the file digita_twin_api.py.
