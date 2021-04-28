import requests
import json
import os
import codecs

base_url = "https://HariDT.api.weu.digitaltwins.azure.net/" # url of dt service
auth_token = 'eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Im5PbzNaRHJPRFhFSzFqS1doWHNsSFJfS1hFZyIsImtpZCI6Im5PbzNaRHJPRFhFSzFqS1doWHNsSFJfS1hFZyJ9.eyJhdWQiOiIwYjA3ZjQyOS05ZjRiLTQ3MTQtOTM5Mi1jYzVlOGU4MGM4YjAiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC81ZDlkOWNiMS1mNWNkLTQzYTUtYWY4Ni04M2JiMWVmOWRjMmQvIiwiaWF0IjoxNjE4ODM0NTA2LCJuYmYiOjE2MTg4MzQ1MDYsImV4cCI6MTYxODgzODQwNiwiYWNyIjoiMSIsImFpbyI6IkFVUUF1LzhUQUFBQXpBZDlCaGhsdEVnZk41bDAra3FET2VzYW1iVDZ5NzU0eUVLSjBUR25jeEhEMGd6RjFvcUw1U1dqbGgrK1NDYzVob0MzblU3ck5Rcml1YW9wWTR4cVNnPT0iLCJhbHRzZWNpZCI6IjE6bGl2ZS5jb206MDAwM0JGRkQzQTEzNDZCMCIsImFtciI6WyJwd2QiXSwiYXBwaWQiOiIwNGIwNzc5NS04ZGRiLTQ2MWEtYmJlZS0wMmY5ZTFiZjdiNDYiLCJhcHBpZGFjciI6IjAiLCJlbWFpbCI6ImhhcmkuZ292aW5kYXNhbXlAb3V0bG9vay5jb20iLCJmYW1pbHlfbmFtZSI6IkdvdmluZGFzYW15IiwiZ2l2ZW5fbmFtZSI6IkhhcmkiLCJpZHAiOiJsaXZlLmNvbSIsImlwYWRkciI6IjE0MC43OC41LjEwNSIsIm5hbWUiOiJIYXJpIEdvdmluZGFzYW15Iiwib2lkIjoiNTRmOTFhMjUtZGM3My00MjQ5LTlmOWItMDI1ZjVlNzlkZDBkIiwicHVpZCI6IjEwMDMyMDAxMkU3NDU1QTkiLCJyaCI6IjAuQVlFQXNaeWRYYzMxcFVPdmhvTzdIdm5jTFpWM3NBVGJqUnBHdS00Qy1lR19lMGFCQUVJLiIsInNjcCI6InVzZXJfaW1wZXJzb25hdGlvbiIsInN1YiI6Im5fMTQ0NUhndTI3THIzaXlOSkdEVGt1WUtUSXpCcjJYS3pjbkVUREJPeEkiLCJ0aWQiOiI1ZDlkOWNiMS1mNWNkLTQzYTUtYWY4Ni04M2JiMWVmOWRjMmQiLCJ1bmlxdWVfbmFtZSI6ImxpdmUuY29tI2hhcmkuZ292aW5kYXNhbXlAb3V0bG9vay5jb20iLCJ1dGkiOiJyMVhjYXJYMGRVMnZuT3U4UmpsaEFBIiwidmVyIjoiMS4wIn0.YpgbdmrzRL1IPbX-t7DaaEGFhj80FbgLkJR4nXcihIq5cELxp7BS9HDXKgvhcYAzFA8J9N1TgCItOY4dgJQESbmzJnqhiOwh3a0cRns8kfBG4x-xomyW0KFUNFKf2kb6Wh7ddahDxXVERYQoPUVnN8_ncVzQR074SCixbyjaT40OAqEm2FA87Ey0Qi_xMfpGh8IS4EwNfusSpW2I1cZcKPkuGzpuoBIkgZHrgljk__tOfsGVKDUISETXZONouImlVavUKkr3qFCSbLycA7B8KpX6biEGa2w4WfzibLlyK8ii-dOUIEus19RglZIk1CiG2fMdPZ0OCD3VoCTSJoe8Uw'

def create_twin(dtid, request):
    method_extension =- "digitaltwins/" + dtid + "?api-version=2020-10-31"
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