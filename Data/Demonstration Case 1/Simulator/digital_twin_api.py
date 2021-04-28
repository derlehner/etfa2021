import requests
import json
import os
import codecs

base_url = "https://aiquality-usecase.api.wcus.digitaltwins.azure.net/" # url of dt service
auth_token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Im5PbzNaRHJPRFhFSzFqS1doWHNsSFJfS1hFZyIsImtpZCI6Im5PbzNaRHJPRFhFSzFqS1doWHNsSFJfS1hFZyJ9.eyJhdWQiOiIwYjA3ZjQyOS05ZjRiLTQ3MTQtOTM5Mi1jYzVlOGU4MGM4YjAiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC9iY2M3NmFhNy1iYmI1LTQxZjQtYmY1Ny0zMTIwNDJlMzE2ZTUvIiwiaWF0IjoxNjE3OTcxNTA3LCJuYmYiOjE2MTc5NzE1MDcsImV4cCI6MTYxNzk3NTQwNywiYWNyIjoiMSIsImFpbyI6IkFVUUF1LzhUQUFBQTc0YWdXNGlKQ21Ha2dOckJOcXlVQXFrZHVPMW01dStacEVaRFk1QzN0YU9UM1A3bnUvazlxejlGVHpxNUlWdFRvZDA0NWpzeDlXR29FeE0rYkswNjB3PT0iLCJhbHRzZWNpZCI6IjE6bGl2ZS5jb206MDAwM0JGRkRBREE3NzBCNSIsImFtciI6WyJwd2QiXSwiYXBwaWQiOiIwNGIwNzc5NS04ZGRiLTQ2MWEtYmJlZS0wMmY5ZTFiZjdiNDYiLCJhcHBpZGFjciI6IjAiLCJlbWFpbCI6ImRhbmllbGdvdHRAbGl2ZS5hdCIsImZhbWlseV9uYW1lIjoiTGVobmVyIiwiZ2l2ZW5fbmFtZSI6IkRhbmllbCIsImlkcCI6ImxpdmUuY29tIiwiaXBhZGRyIjoiOTEuMTE1LjEwOC41IiwibmFtZSI6IkRhbmllbCBMZWhuZXIiLCJvaWQiOiIyZTJiNzYyZi01ZDJkLTQwZDgtYWI4NC05NWVhNTY3NTFlYjUiLCJwdWlkIjoiMTAwMzdGRkU5MzVFMDZCMSIsInJoIjoiMC5BUkVBcDJySHZMVzc5RUdfVnpFZ1F1TVc1WlYzc0FUYmpScEd1LTRDLWVHX2UwWVJBUEUuIiwic2NwIjoidXNlcl9pbXBlcnNvbmF0aW9uIiwic3ViIjoiUnBnZVVFZTBTc2I3aVFDTEFIZHAxU0laVV9TZGtWQThiaDNnNDFWZHNVdyIsInRpZCI6ImJjYzc2YWE3LWJiYjUtNDFmNC1iZjU3LTMxMjA0MmUzMTZlNSIsInVuaXF1ZV9uYW1lIjoibGl2ZS5jb20jZGFuaWVsZ290dEBsaXZlLmF0IiwidXRpIjoieVptOGlkc0xRa2FlV2w1TmM3eGRBQSIsInZlciI6IjEuMCJ9.BmQ0qSzrf2T7xlKlx6oSWeizRxfKEmS3SPey_x0zHIQ_yPRmbUnfBrfK9wA1wLHuUofAwt-P5vUsjKdx3f-cXjYk4K-9McXDkkfXdG18dJuZS7Dh6RfCK3CTnvGNEND2XqszFm0zI1ghy3QKMYhos3shEZLa_iPZ_FW6HouL5fPO9aurahIQQUG6vRwUDR62h2uy3diPJ-eJ5cMFXOXzaQ1ipsOf0sQhNxLKt3dTjCDrwuU4NJXnUDriikxA_7bpst2g-XgEhneUwHC38uxSg0ccVFRmGYs8krcVOKYStuRgWu0GgvSu0WuXlwTFeyf4Sq5tYUqevuPo4__dN_jbHA"

def create_twin(dtid, request):
    method_extension = "digitaltwins/" + dtid + "?api-version=2020-10-31"
    exec_put(method_extension, request)

def delete_twin(dtid):
    method_extension = "digitaltwins/" + dtid + "?api-version=2020-10-31"
    exec_delete(method_extension)

def create_relationship(source_dtid, rel_id, request):
    method_extension = "digitaltwins/" + source_dtid + "/relationships/" + rel_id + "?api-version=2020-10-31"
    exec_put(method_extension, request)

def delete_relationship(dtid, rel_id):
    method_extension = "digitaltwins/" + dtid + "/relationships/" + rel_id + "?api-version=2020-10-31"
    exec_delete(method_extension)
    

def create_interface(interface):
    method_extension = "models?api-version=2020-10-31"
    request = []
    request.append(interface)
    exec_post(method_extension, request)

def delete_interface(id):
    method_extension = "models/" + id + "?api-version=2020-10-31"
    exec_delete(method_extension)

def send_telemetry_for_twin(dtid, telemetry):
    method_extension = "digitaltwins/" + dtid + "/telemetry?api-version=2020-10-31"
    exec_post(method_extension, telemetry)
    
def send_telemetry_for_component(dtid, component_name, telemetry):
    method_extension = "digitaltwins/" + dtid + "/components/" + component_name + "/telemetry?api-version=2020-10-31"
    exec_post(method_extension, telemetry)

# generic REST methods
def exec_post(method_extension, json_request):
    response = requests.post(base_url + method_extension, json=json_request, verify=False, auth=BearerAuth(auth_token))
    print("####################### POST Request to " + method_extension + " #######################")
    process_response(response)

def exec_put(method_extension, json_request):
    response = requests.put(base_url + method_extension, json=json_request, verify=False, auth=BearerAuth(auth_token))
    print("####################### PUT Request to " + method_extension + " #######################")
    print(json_request)
    process_response(response)

def exec_delete(method_extension):
    response = requests.delete(base_url + method_extension, verify=False, auth=BearerAuth(auth_token))
    print("####################### DELETE Request to " + method_extension + " #######################")
    process_response(response)

def process_response(response):
    if str(response.status_code)[0] == "2":
        print("SUCCESS")
    else:
        print("Request FAILED with error message: " + str(response.content))
        

class BearerAuth(requests.auth.AuthBase):
    def __init__(self, token):
        self.token = token
    def __call__(self, r):
        r.headers["authorization"] = "Bearer " + self.token
        return r