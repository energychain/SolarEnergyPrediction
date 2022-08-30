# PSOpenAPITools.PSOpenAPITools/Api.DefaultApi

All URIs are relative to *https://solarenergyprediction.p.rapidapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-Prediction**](DefaultApi.md#Invoke-Prediction) | **GET** /v2.0/solar/prediction | Retrieve PV Forecast without metering


<a name="Invoke-Prediction"></a>
# **Invoke-Prediction**
> void Invoke-Prediction<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-XRapidAPIKey] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-XRapidAPIHost] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Lat] <System.Nullable[Double]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Lon] <System.Nullable[Double]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Zip] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Deg] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Az] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Wp] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Loss] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Plant] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Decoration] <String><br>

Retrieve PV Forecast without metering

The PV generation forecast for unmetered PV systems makes it possible to predict production of a PV system on an hourly basis for the next 4 days without having your own metering equipment or system-specific generation data.

### Example
```powershell
$XRapidAPIKey = "MyXRapidAPIKey" # String | API Key from rapidapi.com
$XRapidAPIHost = "solarenergyprediction.p.rapidapi.com" # String | API Host to use (should be `solarenergyprediction.p.rapidapi.com` )
$Lat = 49.3418836 # Double | Geocode latitude of pv plant (required if parameter plant or zip is not given). (optional)
$Lon = 8.8006813 # Double | Geocode longitude of pv plant (required if parameter plant or zip is not given). (optional)
$Zip = "69256" # String | Zipcode (postalcode) - works only for Germany. If specified no lat/lon parameter is required. (optional)
$Deg = 35 # Int32 | plane declination degrees, 0 (horizontal) … 90 (vertical) (optional)
$Az = 0 # Int32 | plant installation azimuth, -180 … 180 (-180 = north, -90 = east, 0 = south, 90 = west, 180 = north) (optional)
$Wp = 6000 # Int32 | Installed Watt-Peak  (eq. kWp/1000) (optional)
$Loss = 14 # Int32 | System loss in percent (defaults to 14) (optional)
$Plant = "MyPlant" # String | If specified all other query parameters will be taken from the stored value and must not be given with the query string.    Use as comma separated list of IDs to retrieve a forecast for multiple specifications. (optional)
$Decoration = "forecast.solar" # String | Allows to use SolarPredictionAPI as a plug-in replacement for other APIs.    Supported decorations:    | `forecast.solar` | Output will be formated like [https://forecast.solar](http://doc.forecast.solar/doku.php?id=api:estimate#example) |  |----|----| (optional)

# Retrieve PV Forecast without metering
try {
    $Result = Invoke-Prediction -XRapidAPIKey $XRapidAPIKey -XRapidAPIHost $XRapidAPIHost -Lat $Lat -Lon $Lon -Zip $Zip -Deg $Deg -Az $Az -Wp $Wp -Loss $Loss -Plant $Plant -Decoration $Decoration
} catch {
    Write-Host ("Exception occurred when calling Invoke-Prediction: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **XRapidAPIKey** | **String**| API Key from rapidapi.com | 
 **XRapidAPIHost** | **String**| API Host to use (should be &#x60;solarenergyprediction.p.rapidapi.com&#x60; ) | 
 **Lat** | **Double**| Geocode latitude of pv plant (required if parameter plant or zip is not given). | [optional] 
 **Lon** | **Double**| Geocode longitude of pv plant (required if parameter plant or zip is not given). | [optional] 
 **Zip** | **String**| Zipcode (postalcode) - works only for Germany. If specified no lat/lon parameter is required. | [optional] 
 **Deg** | **Int32**| plane declination degrees, 0 (horizontal) … 90 (vertical) | [optional] 
 **Az** | **Int32**| plant installation azimuth, -180 … 180 (-180 &#x3D; north, -90 &#x3D; east, 0 &#x3D; south, 90 &#x3D; west, 180 &#x3D; north) | [optional] 
 **Wp** | **Int32**| Installed Watt-Peak  (eq. kWp/1000) | [optional] 
 **Loss** | **Int32**| System loss in percent (defaults to 14) | [optional] 
 **Plant** | **String**| If specified all other query parameters will be taken from the stored value and must not be given with the query string.    Use as comma separated list of IDs to retrieve a forecast for multiple specifications. | [optional] 
 **Decoration** | **String**| Allows to use SolarPredictionAPI as a plug-in replacement for other APIs.    Supported decorations:    | &#x60;forecast.solar&#x60; | Output will be formated like [https://forecast.solar](http://doc.forecast.solar/doku.php?id&#x3D;api:estimate#example) |  |----|----| | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

