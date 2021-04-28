using Microsoft.Azure.EventHubs;
using Microsoft.Azure.WebJobs;
using Microsoft.Extensions.Logging;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;
using System.Threading.Tasks;
using System.Text;
using System.Collections.Generic;
using System;
using AirQualityDataProcessing.Model;
using System.Linq;
using AirQualityDataProcessing.Services;

namespace UpdateTSI
{
    public static class ProcessDTStructureUpdatetoTSI
    {
        // primaryconnectionstring for pushdtupdatetotsi: Endpoint=sb://airqualitydatabus.servicebus.windows.net/;SharedAccessKeyName=automation;SharedAccessKey=Ayfn2C4d1sqF1RgZ0Vl488Ams2cH+K2Z8okQ/rsc8tI=;EntityPath=pushdtupdatetotsi
        // primaryconnectionstring for pulldtstructureupdates: Endpoint=sb://airqualitydatabus.servicebus.windows.net/;SharedAccessKeyName=automation;SharedAccessKey=R+uyKaMQXS9FYjCUW1LVwk6IeFRNoEKgsqJLWnPXgJ0=;EntityPath=pulldtstructureupdates
        [FunctionName("UpdateTSIModel")]
        public static async Task Run(
            [EventHubTrigger("pushdtupdatetotsi", Connection = "EventHubAppSetting-Twins-Structure")] EventData myEventHubMessage,
            [EventHub("pulldtstructureupdates", Connection = "EventHubAppSetting-TSI-Structure")] IAsyncCollector<string> outputEvents,
            ILogger log)
        {
            string triggerBody = Encoding.UTF8.GetString(myEventHubMessage.Body);
            JObject message = (JObject)JsonConvert.DeserializeObject(triggerBody);
            log.LogInformation("Reading event:" + message.ToString());
            
            String type = myEventHubMessage.Properties["cloudEvents:type"].ToString();
            String subject = myEventHubMessage.Properties["cloudEvents:subject"].ToString();
            Dictionary<string, object> tsiUpdate = new Dictionary<string, object>();
            processEvent(tsiUpdate, message, type, subject);
            //tsiUpdate.Add("typeId", message["$metadata"]["$model"].ToString());
            tsiUpdate.Add("$dtId", subject);
            tsiUpdate.Add("test", "tt");
            string json = JsonConvert.SerializeObject(tsiUpdate);
            log.LogInformation("Writing events for subject" + subject + ": " + json);
            await outputEvents.AddAsync(json);
            // Send an update if updates exist
            if (tsiUpdate.Count > 0)
            {
               
            }

        }

        private static Dictionary<string, object> processEvent(Dictionary<string, object> outputEvents, JObject inputEvent, String type, String subject)
        {
            if (type.Equals("Microsoft.DigitalTwins.Twin.Create"))
            {
                String typeId = inputEvent["$metadata"]["$model"].ToString();
                Dictionary<String, String> components = ADTService.getComponents(typeId);
               // add instance if current twin contains telemetry
                processAddTwin(inputEvent, subject, typeId);
                // add instance for each component that contains telemetry
                foreach (String compName in components.Keys)
                {
                    String compTypeId = components[compName];
                    processAddTwin(inputEvent, subject + "/" + compName, compTypeId);
                }
            }

            if (type.Equals("Microsoft.DigitalTwins.Twin.Update"))
            {
                String typeId = inputEvent["modelId"].ToString();
                Dictionary<String, String> components = ADTService.getComponents(typeId);
                foreach (String compName in components.Keys)
                {
                    String compTypeId = components[compName];
                    processAddTwin(inputEvent, compName, typeId + "/" + compTypeId);
                }
                if (inputEvent.ContainsKey("op"))
                {
                    if (inputEvent["op"].Equals("add") || inputEvent["op"].Equals("replace"))
                    {
                        processAddTwin(inputEvent, subject, typeId);
                    }
                }
                else
                {
                    if(inputEvent["patch"].First.Last.Equals("{\"op\": \"replace\"}")){
                        processAddTwin(inputEvent, subject, typeId);
                    }
                    if (inputEvent["patch"].First.Last["op"].Equals("add") || inputEvent["patch"]["op"].Equals("replace"))
                    {
                        processAddTwin(inputEvent, subject, typeId);
                    }
                    if (inputEvent["patch"].First.Last["op"].Equals("add") || inputEvent["patch"]["op"].Equals("replace"))
                    {
                        processAddTwin(inputEvent, subject, typeId);
                    }
                    if (inputEvent["patch"]["op"].Equals("add") || inputEvent["patch"]["op"].Equals("replace"))
                    {
                        processAddTwin(inputEvent, subject, typeId);
                    }
                }
                

            }

            if (type.Equals("Microsoft.DigitalTwins.Twin.Update"))
            {

            }
            return outputEvents;
            
        }

        #region Setup

        /**
        * Postconditions:
        * - Telemetry data can be sent for the corresponding twin (for all available telemetry properties)
        * - Model updates can be sent for the corresponding twin
        * - current value is visible in TSI-Explorer for all Property elements
        * - values can be changed for all available properties
        * - hierarchy is set in TSI-Explorer
        * - components are added in TSI-Explorer
        **/
        private static void processAddTwin(JObject inputEvent, String dtid, String typeId)
        {
            if (!ADTService.getTelemetries(typeId))
            {
                return;
            }
            
            // add an instance of appropriate type to TSI
            var timeSeriesId = new List<String>();
            timeSeriesId.Add(dtid);
            var hierarchyIds = new List<String>();
            var instanceFields = new Dictionary<String, String>();

            var instance = new Instance
            {
                typeId = typeId,
                name = dtid,
                timeSeriesId = timeSeriesId,
               // hierarchyIds = hierarchyIds,
               // instanceFields = instanceFields

            };
            var request = new UpdateInstanceRequest();
            request.putInstance(instance);
            
            TSIModelService.addInstance(request);
            // if twin contains > 1 telemetries:
            // create new instance
            // tsid = $dtid
            // type = type of twin (reference to interface)
            // (later) create instancefield for each property
            // name = dtid
            // for each component that has >1 telemetries:
            // create new instance
            // set hierarchy based on containing twin (how to get name of hierarchy?)
            // (later) create instancefield for each property
            // tsid = $dtid/componentName
            // type = type of component

        }

        /**
        * Postconditions:
        * - No more Telemetry data can be sent for the corresponding twin (for all available telemetry properties)
        * - No more Model updates can be sent for the corresponding twin
        * - values cannot be changed any more for all available properties
        * - historical telemetry data is still available in TSI-Explorer
        **/
        private static void processTwinDelete()
        {
            // delete corresponding instance from TSI
        }

        private static void processTwinRename()
        {
            // handle renaming of twin ($dtid)
            // handle renaming of component (is this possible?)
        }

        #endregion

        #region Migration
        private static void processTwinNewSchema()
        {
            // handle renaming of 
        }
        private static void processUpdateInterface()
        {
            // update type of old interface in TSI

            // handling renaming of property in an existing schema
            // handling 
        }

        private static void handleRelationshipChange()
        {

        }

        private static void handleComponentChange()
        {

        }

        #endregion

        #region Versioning
        private static void processTwinNewSchemaVersion()
        {
            // todo: what to do here?
        }

        private static void processNewInterfaceVersion()
        {
            // TODO: what to happen here?
        }
        #endregion
    }
}