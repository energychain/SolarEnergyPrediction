# DefaultApi

All URIs are relative to *https://solarenergyprediction.p.rapidapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Prediction**](DefaultApi.md#Prediction) | **GET** /v2.0/solar/prediction | Retrieve PV Forecast without metering


# **Prediction**
> Prediction(x_rapid_api_key, x_rapid_api_host, lat = var.lat, lon = var.lon, zip = var.zip, deg = var.deg, az = var.az, wp = var.wp, loss = var.loss, plant = var.plant, decoration = var.decoration)

Retrieve PV Forecast without metering

The PV generation forecast for unmetered PV systems makes it possible to predict production of a PV system on an hourly basis for the next 4 days without having your own metering equipment or system-specific generation data.

### Example
```R
library(openapi)

var_x_rapid_api_key <- 'x_rapid_api_key_example' # character | API Key from rapidapi.com
var_x_rapid_api_host <- 'x_rapid_api_host_example' # character | API Host to use (should be `solarenergyprediction.p.rapidapi.com` )
var_lat <- 49.3418836 # numeric | Geocode latitude of pv plant (required if parameter plant or zip is not given).
var_lon <- 8.8006813 # numeric | Geocode longitude of pv plant (required if parameter plant or zip is not given).
var_zip <- '69256' # character | Zipcode (postalcode) - works only for Germany. If specified no lat/lon parameter is required.
var_deg <- 35 # integer | plane declination degrees, 0 (horizontal) … 90 (vertical)
var_az <- 0 # integer | plant installation azimuth, -180 … 180 (-180 = north, -90 = east, 0 = south, 90 = west, 180 = north)
var_wp <- 6000 # integer | Installed Watt-Peak  (eq. kWp/1000)
var_loss <- 14 # integer | System loss in percent (defaults to 14)
var_plant <- 'plant_example' # character | If specified all other query parameters will be taken from the stored value and must not be given with the query string.    Use as comma separated list of IDs to retrieve a forecast for multiple specifications.
var_decoration <- 'decoration_example' # character | Allows to use SolarPredictionAPI as a plug-in replacement for other APIs.    Supported decorations:    | `forecast.solar` | Output will be formated like [https://forecast.solar](http://doc.forecast.solar/doku.php?id=api:estimate#example) |  |----|----|

#Retrieve PV Forecast without metering
api_instance <- DefaultApi$new()
api_instance$Prediction(var_x_rapid_api_key, var_x_rapid_api_host, lat = var_lat, lon = var_lon, zip = var_zip, deg = var_deg, az = var_az, wp = var_wp, loss = var_loss, plant = var_plant, decoration = var_decoration)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_rapid_api_key** | **character**| API Key from rapidapi.com | 
 **x_rapid_api_host** | Enum [solarenergyprediction.p.rapidapi.com] | API Host to use (should be &#x60;solarenergyprediction.p.rapidapi.com&#x60; ) | 
 **lat** | **numeric**| Geocode latitude of pv plant (required if parameter plant or zip is not given). | [optional] 
 **lon** | **numeric**| Geocode longitude of pv plant (required if parameter plant or zip is not given). | [optional] 
 **zip** | **character**| Zipcode (postalcode) - works only for Germany. If specified no lat/lon parameter is required. | [optional] 
 **deg** | **integer**| plane declination degrees, 0 (horizontal) … 90 (vertical) | [optional] 
 **az** | **integer**| plant installation azimuth, -180 … 180 (-180 &#x3D; north, -90 &#x3D; east, 0 &#x3D; south, 90 &#x3D; west, 180 &#x3D; north) | [optional] 
 **wp** | **integer**| Installed Watt-Peak  (eq. kWp/1000) | [optional] 
 **loss** | **integer**| System loss in percent (defaults to 14) | [optional] 
 **plant** | **character**| If specified all other query parameters will be taken from the stored value and must not be given with the query string.    Use as comma separated list of IDs to retrieve a forecast for multiple specifications. | [optional] 
 **decoration** | Enum [forecast.solar] | Allows to use SolarPredictionAPI as a plug-in replacement for other APIs.    Supported decorations:    | &#x60;forecast.solar&#x60; | Output will be formated like [https://forecast.solar](http://doc.forecast.solar/doku.php?id&#x3D;api:estimate#example) |  |----|----| | [optional] 

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
| **200** | SolarEnergy Prediction for the upcoming 4 days.   |  -  |

