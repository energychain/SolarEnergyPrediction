# SolarEnergyPrediction.DefaultApi

All URIs are relative to *https://solarenergyprediction.p.rapidapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**prediction**](DefaultApi.md#prediction) | **GET** /v2.0/solar/prediction | Retrieve PV Forecast without metering



## prediction

> prediction(xRapidAPIKey, xRapidAPIHost, opts)

Retrieve PV Forecast without metering

The PV generation forecast for unmetered PV systems makes it possible to predict production of a PV system on an hourly basis for the next 4 days without having your own metering equipment or system-specific generation data.

### Example

```javascript
import SolarEnergyPrediction from 'solar_energy_prediction';

let apiInstance = new SolarEnergyPrediction.DefaultApi();
let xRapidAPIKey = "xRapidAPIKey_example"; // String | API Key from rapidapi.com
let xRapidAPIHost = "xRapidAPIHost_example"; // String | API Host to use (should be `solarenergyprediction.p.rapidapi.com` )
let opts = {
  'lat': 49.3418836, // Number | Geocode latitude of pv plant (required if parameter plant or zip is not given).
  'lon': 8.8006813, // Number | Geocode longitude of pv plant (required if parameter plant or zip is not given).
  'zip': 69256, // String | Zipcode (postalcode) - works only for Germany. If specified no lat/lon parameter is required.
  'deg': 35, // Number | plane declination degrees, 0 (horizontal) … 90 (vertical)
  'az': 0, // Number | plant installation azimuth, -180 … 180 (-180 = north, -90 = east, 0 = south, 90 = west, 180 = north)
  'wp': 6000, // Number | Installed Watt-Peak  (eq. kWp/1000)
  'loss': 14, // Number | System loss in percent (defaults to 14)
  'plant': "plant_example", // String | If specified all other query parameters will be taken from the stored value and must not be given with the query string.    Use as comma separated list of IDs to retrieve a forecast for multiple specifications.
  'decoration': "decoration_example" // String | Allows to use SolarPredictionAPI as a plug-in replacement for other APIs.    Supported decorations:    | `forecast.solar` | Output will be formated like [https://forecast.solar](http://doc.forecast.solar/doku.php?id=api:estimate#example) |  |----|----|
};
apiInstance.prediction(xRapidAPIKey, xRapidAPIHost, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRapidAPIKey** | **String**| API Key from rapidapi.com | 
 **xRapidAPIHost** | **String**| API Host to use (should be &#x60;solarenergyprediction.p.rapidapi.com&#x60; ) | 
 **lat** | **Number**| Geocode latitude of pv plant (required if parameter plant or zip is not given). | [optional] 
 **lon** | **Number**| Geocode longitude of pv plant (required if parameter plant or zip is not given). | [optional] 
 **zip** | **String**| Zipcode (postalcode) - works only for Germany. If specified no lat/lon parameter is required. | [optional] 
 **deg** | **Number**| plane declination degrees, 0 (horizontal) … 90 (vertical) | [optional] 
 **az** | **Number**| plant installation azimuth, -180 … 180 (-180 &#x3D; north, -90 &#x3D; east, 0 &#x3D; south, 90 &#x3D; west, 180 &#x3D; north) | [optional] 
 **wp** | **Number**| Installed Watt-Peak  (eq. kWp/1000) | [optional] 
 **loss** | **Number**| System loss in percent (defaults to 14) | [optional] 
 **plant** | **String**| If specified all other query parameters will be taken from the stored value and must not be given with the query string.    Use as comma separated list of IDs to retrieve a forecast for multiple specifications. | [optional] 
 **decoration** | **String**| Allows to use SolarPredictionAPI as a plug-in replacement for other APIs.    Supported decorations:    | &#x60;forecast.solar&#x60; | Output will be formated like [https://forecast.solar](http://doc.forecast.solar/doku.php?id&#x3D;api:estimate#example) |  |----|----| | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

