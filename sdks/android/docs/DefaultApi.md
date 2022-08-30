# DefaultApi

All URIs are relative to *https://solarenergyprediction.p.rapidapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**prediction**](DefaultApi.md#prediction) | **GET** /v2.0/solar/prediction | Retrieve PV Forecast without metering



## prediction

> prediction(xRapidAPIKey, xRapidAPIHost, lat, lon, zip, deg, az, wp, loss, plant, decoration)

Retrieve PV Forecast without metering

The PV generation forecast for unmetered PV systems makes it possible to predict production of a PV system on an hourly basis for the next 4 days without having your own metering equipment or system-specific generation data.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
String xRapidAPIKey = null; // String | API Key from rapidapi.com
String xRapidAPIHost = null; // String | API Host to use (should be `solarenergyprediction.p.rapidapi.com` )
Float lat = 49.3418836; // Float | Geocode latitude of pv plant (required if parameter plant or zip is not given).
Float lon = 8.8006813; // Float | Geocode longitude of pv plant (required if parameter plant or zip is not given).
String zip = 69256; // String | Zipcode (postalcode) - works only for Germany. If specified no lat/lon parameter is required.
Integer deg = 35; // Integer | plane declination degrees, 0 (horizontal) … 90 (vertical)
Integer az = 0; // Integer | plant installation azimuth, -180 … 180 (-180 = north, -90 = east, 0 = south, 90 = west, 180 = north)
Integer wp = 6000; // Integer | Installed Watt-Peak  (eq. kWp/1000)
Integer loss = 14; // Integer | System loss in percent (defaults to 14)
String plant = null; // String | If specified all other query parameters will be taken from the stored value and must not be given with the query string.    Use as comma separated list of IDs to retrieve a forecast for multiple specifications.
String decoration = null; // String | Allows to use SolarPredictionAPI as a plug-in replacement for other APIs.    Supported decorations:    | `forecast.solar` | Output will be formated like [https://forecast.solar](http://doc.forecast.solar/doku.php?id=api:estimate#example) |  |----|----|
try {
    apiInstance.prediction(xRapidAPIKey, xRapidAPIHost, lat, lon, zip, deg, az, wp, loss, plant, decoration);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#prediction");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRapidAPIKey** | **String**| API Key from rapidapi.com | [default to null]
 **xRapidAPIHost** | **String**| API Host to use (should be &#x60;solarenergyprediction.p.rapidapi.com&#x60; ) | [default to null] [enum: solarenergyprediction.p.rapidapi.com]
 **lat** | **Float**| Geocode latitude of pv plant (required if parameter plant or zip is not given). | [optional] [default to null]
 **lon** | **Float**| Geocode longitude of pv plant (required if parameter plant or zip is not given). | [optional] [default to null]
 **zip** | **String**| Zipcode (postalcode) - works only for Germany. If specified no lat/lon parameter is required. | [optional] [default to null]
 **deg** | **Integer**| plane declination degrees, 0 (horizontal) … 90 (vertical) | [optional] [default to null]
 **az** | **Integer**| plant installation azimuth, -180 … 180 (-180 &#x3D; north, -90 &#x3D; east, 0 &#x3D; south, 90 &#x3D; west, 180 &#x3D; north) | [optional] [default to null]
 **wp** | **Integer**| Installed Watt-Peak  (eq. kWp/1000) | [optional] [default to null]
 **loss** | **Integer**| System loss in percent (defaults to 14) | [optional] [default to null]
 **plant** | **String**| If specified all other query parameters will be taken from the stored value and must not be given with the query string.    Use as comma separated list of IDs to retrieve a forecast for multiple specifications. | [optional] [default to null]
 **decoration** | **String**| Allows to use SolarPredictionAPI as a plug-in replacement for other APIs.    Supported decorations:    | &#x60;forecast.solar&#x60; | Output will be formated like [https://forecast.solar](http://doc.forecast.solar/doku.php?id&#x3D;api:estimate#example) |  |----|----| | [optional] [default to null] [enum: forecast.solar]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

