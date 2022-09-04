# SolarEnergyPrediction.PredictionApi

All URIs are relative to *https://solarenergyprediction.p.rapidapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v20SolarPredictionGet**](PredictionApi.md#v20SolarPredictionGet) | **GET** /v2.0/solar/prediction | Generation prediction for the next 4 days 

<a name="v20SolarPredictionGet"></a>
# **v20SolarPredictionGet**
> InlineResponse200 v20SolarPredictionGet(xRapidAPIKey, lon, lat, wp, opts)

Generation prediction for the next 4 days 

The PV generation forecast for unmetered PV systems makes it possible to predict production of a PV system on an hourly basis for the next 4 days without having your own metering equipment or system-specific generation data.

### Example
```javascript
import {SolarEnergyPrediction} from 'solar_energy_prediction';

let apiInstance = new SolarEnergyPrediction.PredictionApi();
let xRapidAPIKey = "xRapidAPIKey_example"; // String | Could be retrieved from rapidapi.com account (free)
let lon = 1.2; // Number | Geocode longitude part of pv plant
let lat = 1.2; // Number | Geocode latitude part of pv plant
let wp = 1.2; // Number | Installed Watt-Peak (eq. kWp/1000)
let opts = { 
  'deg': 1.2, // Number | PV plant declination degrees, 0 (horizontal) … 90 (vertical)
  'az': 1.2 // Number | plane azimuth, -180 … 180 (-180 = north, -90 = east, 0 = south, 90 = west, 180 = north)
};
apiInstance.v20SolarPredictionGet(xRapidAPIKey, lon, lat, wp, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRapidAPIKey** | **String**| Could be retrieved from rapidapi.com account (free) | 
 **lon** | **Number**| Geocode longitude part of pv plant | 
 **lat** | **Number**| Geocode latitude part of pv plant | 
 **wp** | **Number**| Installed Watt-Peak (eq. kWp/1000) | 
 **deg** | **Number**| PV plant declination degrees, 0 (horizontal) … 90 (vertical) | [optional] 
 **az** | **Number**| plane azimuth, -180 … 180 (-180 &#x3D; north, -90 &#x3D; east, 0 &#x3D; south, 90 &#x3D; west, 180 &#x3D; north) | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

