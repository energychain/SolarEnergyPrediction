# OpenAPIClient-php

The PV generation forecast for unmetered PV systems makes it possible to predict production of a PV system on an hourly basis for the next 4 days without having your own metering equipment or system-specific generation data.

For more information, please visit [https://corrently.io/](https://corrently.io/).

## Installation & Usage

### Requirements

PHP 7.4 and later.
Should also work with PHP 8.0.

### Composer

To install the bindings via [Composer](https://getcomposer.org/), add the following to `composer.json`:

```json
{
  "repositories": [
    {
      "type": "vcs",
      "url": "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
    }
  ],
  "require": {
    "GIT_USER_ID/GIT_REPO_ID": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
<?php
require_once('/path/to/OpenAPIClient-php/vendor/autoload.php');
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

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

## API Endpoints

All URIs are relative to *https://solarenergyprediction.p.rapidapi.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**prediction**](docs/Api/DefaultApi.md#prediction) | **GET** /v2.0/solar/prediction | Retrieve PV Forecast without metering

## Models


## Authorization

### RapidAPI

- **Type**: API key
- **API key parameter name**: X-RapidAPI-Key
- **Location**: HTTP header


## Tests

To run the tests, use:

```bash
composer install
vendor/bin/phpunit
```

## Author

dev@stromdao.com

## About this package

This PHP package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: `1.0.0`
- Build package: `org.openapitools.codegen.languages.PhpClientCodegen`
