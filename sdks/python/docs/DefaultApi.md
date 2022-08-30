# openapi_client.DefaultApi

All URIs are relative to *https://solarenergyprediction.p.rapidapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**prediction**](DefaultApi.md#prediction) | **GET** /v2.0/solar/prediction | Retrieve PV Forecast without metering


# **prediction**
> prediction(x_rapid_api_key, )

Retrieve PV Forecast without metering

The PV generation forecast for unmetered PV systems makes it possible to predict production of a PV system on an hourly basis for the next 4 days without having your own metering equipment or system-specific generation data.

### Example


```python
import time
import openapi_client
from openapi_client.api import default_api
from pprint import pprint
# Defining the host is optional and defaults to https://solarenergyprediction.p.rapidapi.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://solarenergyprediction.p.rapidapi.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)
    x_rapid_api_key = "X-RapidAPI-Key_example" # str | API Key from rapidapi.com
    lat = 49.3418836 # float | Geocode latitude of pv plant (required if parameter plant or zip is not given). (optional)
    lon = 8.8006813 # float | Geocode longitude of pv plant (required if parameter plant or zip is not given). (optional)
    zip = "69256" # str | Zipcode (postalcode) - works only for Germany. If specified no lat/lon parameter is required. (optional)
    deg = 35 # int | plane declination degrees, 0 (horizontal) … 90 (vertical) (optional)
    az = 0 # int | plant installation azimuth, -180 … 180 (-180 = north, -90 = east, 0 = south, 90 = west, 180 = north) (optional)
    wp = 6000 # int | Installed Watt-Peak  (eq. kWp/1000) (optional)
    loss = 14 # int | System loss in percent (defaults to 14) (optional)
    plant = "plant_example" # str | If specified all other query parameters will be taken from the stored value and must not be given with the query string.    Use as comma separated list of IDs to retrieve a forecast for multiple specifications. (optional)
    decoration = "forecast.solar" # str | Allows to use SolarPredictionAPI as a plug-in replacement for other APIs.    Supported decorations:    | `forecast.solar` | Output will be formated like [https://forecast.solar](http://doc.forecast.solar/doku.php?id=api:estimate#example) |  |----|----| (optional) if omitted the server will use the default value of "forecast.solar"

    # example passing only required values which don't have defaults set
    try:
        # Retrieve PV Forecast without metering
        api_instance.prediction(x_rapid_api_key, )
    except openapi_client.ApiException as e:
        print("Exception when calling DefaultApi->prediction: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Retrieve PV Forecast without metering
        api_instance.prediction(x_rapid_api_key, lat=lat, lon=lon, zip=zip, deg=deg, az=az, wp=wp, loss=loss, plant=plant, decoration=decoration)
    except openapi_client.ApiException as e:
        print("Exception when calling DefaultApi->prediction: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_rapid_api_key** | **str**| API Key from rapidapi.com |
 **x_rapid_api_host** | **str**| API Host to use (should be &#x60;solarenergyprediction.p.rapidapi.com&#x60; ) | defaults to "solarenergyprediction.p.rapidapi.com"
 **lat** | **float**| Geocode latitude of pv plant (required if parameter plant or zip is not given). | [optional]
 **lon** | **float**| Geocode longitude of pv plant (required if parameter plant or zip is not given). | [optional]
 **zip** | **str**| Zipcode (postalcode) - works only for Germany. If specified no lat/lon parameter is required. | [optional]
 **deg** | **int**| plane declination degrees, 0 (horizontal) … 90 (vertical) | [optional]
 **az** | **int**| plant installation azimuth, -180 … 180 (-180 &#x3D; north, -90 &#x3D; east, 0 &#x3D; south, 90 &#x3D; west, 180 &#x3D; north) | [optional]
 **wp** | **int**| Installed Watt-Peak  (eq. kWp/1000) | [optional]
 **loss** | **int**| System loss in percent (defaults to 14) | [optional]
 **plant** | **str**| If specified all other query parameters will be taken from the stored value and must not be given with the query string.    Use as comma separated list of IDs to retrieve a forecast for multiple specifications. | [optional]
 **decoration** | **str**| Allows to use SolarPredictionAPI as a plug-in replacement for other APIs.    Supported decorations:    | &#x60;forecast.solar&#x60; | Output will be formated like [https://forecast.solar](http://doc.forecast.solar/doku.php?id&#x3D;api:estimate#example) |  |----|----| | [optional] if omitted the server will use the default value of "forecast.solar"

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | SolarEnergy Prediction for the upcoming 4 days.   |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

