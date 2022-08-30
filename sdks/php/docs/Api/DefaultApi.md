# OpenAPI\Client\DefaultApi

All URIs are relative to https://solarenergyprediction.p.rapidapi.com.

Method | HTTP request | Description
------------- | ------------- | -------------
[**prediction()**](DefaultApi.md#prediction) | **GET** /v2.0/solar/prediction | Retrieve PV Forecast without metering


## `prediction()`

```php
prediction($x_rapid_api_key, $x_rapid_api_host, $lat, $lon, $zip, $deg, $az, $wp, $loss, $plant, $decoration)
```

Retrieve PV Forecast without metering

The PV generation forecast for unmetered PV systems makes it possible to predict production of a PV system on an hourly basis for the next 4 days without having your own metering equipment or system-specific generation data.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$x_rapid_api_key = 'x_rapid_api_key_example'; // string | API Key from rapidapi.com
$x_rapid_api_host = 'x_rapid_api_host_example'; // string | API Host to use (should be `solarenergyprediction.p.rapidapi.com` )
$lat = 49.3418836; // float | Geocode latitude of pv plant (required if parameter plant or zip is not given).
$lon = 8.8006813; // float | Geocode longitude of pv plant (required if parameter plant or zip is not given).
$zip = 69256; // string | Zipcode (postalcode) - works only for Germany. If specified no lat/lon parameter is required.
$deg = 35; // int | plane declination degrees, 0 (horizontal) … 90 (vertical)
$az = 0; // int | plant installation azimuth, -180 … 180 (-180 = north, -90 = east, 0 = south, 90 = west, 180 = north)
$wp = 6000; // int | Installed Watt-Peak  (eq. kWp/1000)
$loss = 14; // int | System loss in percent (defaults to 14)
$plant = 'plant_example'; // string | If specified all other query parameters will be taken from the stored value and must not be given with the query string.    Use as comma separated list of IDs to retrieve a forecast for multiple specifications.
$decoration = 'decoration_example'; // string | Allows to use SolarPredictionAPI as a plug-in replacement for other APIs.    Supported decorations:    | `forecast.solar` | Output will be formated like [https://forecast.solar](http://doc.forecast.solar/doku.php?id=api:estimate#example) |  |----|----|

try {
    $apiInstance->prediction($x_rapid_api_key, $x_rapid_api_host, $lat, $lon, $zip, $deg, $az, $wp, $loss, $plant, $decoration);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->prediction: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_rapid_api_key** | **string**| API Key from rapidapi.com |
 **x_rapid_api_host** | **string**| API Host to use (should be &#x60;solarenergyprediction.p.rapidapi.com&#x60; ) |
 **lat** | **float**| Geocode latitude of pv plant (required if parameter plant or zip is not given). | [optional]
 **lon** | **float**| Geocode longitude of pv plant (required if parameter plant or zip is not given). | [optional]
 **zip** | **string**| Zipcode (postalcode) - works only for Germany. If specified no lat/lon parameter is required. | [optional]
 **deg** | **int**| plane declination degrees, 0 (horizontal) … 90 (vertical) | [optional]
 **az** | **int**| plant installation azimuth, -180 … 180 (-180 &#x3D; north, -90 &#x3D; east, 0 &#x3D; south, 90 &#x3D; west, 180 &#x3D; north) | [optional]
 **wp** | **int**| Installed Watt-Peak  (eq. kWp/1000) | [optional]
 **loss** | **int**| System loss in percent (defaults to 14) | [optional]
 **plant** | **string**| If specified all other query parameters will be taken from the stored value and must not be given with the query string.    Use as comma separated list of IDs to retrieve a forecast for multiple specifications. | [optional]
 **decoration** | **string**| Allows to use SolarPredictionAPI as a plug-in replacement for other APIs.    Supported decorations:    | &#x60;forecast.solar&#x60; | Output will be formated like [https://forecast.solar](http://doc.forecast.solar/doku.php?id&#x3D;api:estimate#example) |  |----|----| | [optional]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
