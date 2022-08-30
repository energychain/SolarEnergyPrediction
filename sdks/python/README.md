# openapi-client
The PV generation forecast for unmetered PV systems makes it possible to predict production of a PV system on an hourly basis for the next 4 days without having your own metering equipment or system-specific generation data.

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.PythonClientCodegen
For more information, please visit [https://corrently.io/](https://corrently.io/)

## Requirements.

Python >=3.6

## Installation & Usage
### pip install

If the python package is hosted on a repository, you can install directly using:

```sh
pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git`)

Then import the package:
```python
import openapi_client
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import openapi_client
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python

import time
import openapi_client
from pprint import pprint
from openapi_client.api import default_api
# Defining the host is optional and defaults to https://solarenergyprediction.p.rapidapi.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://solarenergyprediction.p.rapidapi.com"
)



# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)
    x_rapid_api_key = "X-RapidAPI-Key_example" # str | API Key from rapidapi.com
    x_rapid_api_host = "solarenergyprediction.p.rapidapi.com" # str | API Host to use (should be `solarenergyprediction.p.rapidapi.com` ) (default to "solarenergyprediction.p.rapidapi.com")
    lat = 49.3418836 # float | Geocode latitude of pv plant (required if parameter plant or zip is not given). (optional)
    lon = 8.8006813 # float | Geocode longitude of pv plant (required if parameter plant or zip is not given). (optional)
    zip = "69256" # str | Zipcode (postalcode) - works only for Germany. If specified no lat/lon parameter is required. (optional)
    deg = 35 # int | plane declination degrees, 0 (horizontal) … 90 (vertical) (optional)
    az = 0 # int | plant installation azimuth, -180 … 180 (-180 = north, -90 = east, 0 = south, 90 = west, 180 = north) (optional)
    wp = 6000 # int | Installed Watt-Peak  (eq. kWp/1000) (optional)
    loss = 14 # int | System loss in percent (defaults to 14) (optional)
    plant = "plant_example" # str | If specified all other query parameters will be taken from the stored value and must not be given with the query string.    Use as comma separated list of IDs to retrieve a forecast for multiple specifications. (optional)
    decoration = "forecast.solar" # str | Allows to use SolarPredictionAPI as a plug-in replacement for other APIs.    Supported decorations:    | `forecast.solar` | Output will be formated like [https://forecast.solar](http://doc.forecast.solar/doku.php?id=api:estimate#example) |  |----|----| (optional) (default to "forecast.solar")

    try:
        # Retrieve PV Forecast without metering
        api_instance.prediction(x_rapid_api_key, x_rapid_api_host, lat=lat, lon=lon, zip=zip, deg=deg, az=az, wp=wp, loss=loss, plant=plant, decoration=decoration)
    except openapi_client.ApiException as e:
        print("Exception when calling DefaultApi->prediction: %s\n" % e)
```

## Documentation for API Endpoints

All URIs are relative to *https://solarenergyprediction.p.rapidapi.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**prediction**](docs/DefaultApi.md#prediction) | **GET** /v2.0/solar/prediction | Retrieve PV Forecast without metering


## Documentation For Models



## Documentation For Authorization


## RapidAPI

- **Type**: API key
- **API key parameter name**: X-RapidAPI-Key
- **Location**: HTTP header


## Author

dev@stromdao.com


## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in openapi_client.apis and openapi_client.models may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from openapi_client.api.default_api import DefaultApi`
- `from openapi_client.model.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import openapi_client
from openapi_client.apis import *
from openapi_client.models import *
```
