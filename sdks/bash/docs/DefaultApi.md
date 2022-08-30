# DefaultApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**prediction**](DefaultApi.md#prediction) | **GET** /v2.0/solar/prediction | Retrieve PV Forecast without metering



## prediction

Retrieve PV Forecast without metering

The PV generation forecast for unmetered PV systems makes it possible to predict production of a PV system on an hourly basis for the next 4 days without having your own metering equipment or system-specific generation data.

### Example

```bash
 prediction X-RapidAPI-Key:value X-RapidAPI-Host:value  lat=value  lon=value  zip=value  deg=value  az=value  wp=value  loss=value  plant=value  decoration=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRapidAPIKey** | **string** | API Key from rapidapi.com | [default to null]
 **xRapidAPIHost** | **string** | API Host to use (should be 'solarenergyprediction.p.rapidapi.com' ) | [default to null]
 **lat** | **float** | Geocode latitude of pv plant (required if parameter plant or zip is not given). | [optional] [default to null]
 **lon** | **float** | Geocode longitude of pv plant (required if parameter plant or zip is not given). | [optional] [default to null]
 **zip** | **string** | Zipcode (postalcode) - works only for Germany. If specified no lat/lon parameter is required. | [optional] [default to null]
 **deg** | **integer** | plane declination degrees, 0 (horizontal) … 90 (vertical) | [optional] [default to null]
 **az** | **integer** | plant installation azimuth, -180 … 180 (-180 = north, -90 = east, 0 = south, 90 = west, 180 = north) | [optional] [default to null]
 **wp** | **integer** | Installed Watt-Peak  (eq. kWp/1000) | [optional] [default to null]
 **loss** | **integer** | System loss in percent (defaults to 14) | [optional] [default to null]
 **plant** | **string** | If specified all other query parameters will be taken from the stored value and must not be given with the query string.

Use as comma separated list of IDs to retrieve a forecast for multiple specifications. | [optional] [default to null]
 **decoration** | **string** | Allows to use SolarPredictionAPI as a plug-in replacement for other APIs.

Supported decorations:

| 'forecast.solar' | Output will be formated like [https://forecast.solar](http://doc.forecast.solar/doku.php?id=api:estimate#example) |
|----|----| | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

