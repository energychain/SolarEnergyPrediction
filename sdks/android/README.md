# openapi-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/openapi-android-client-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.DefaultApi;

public class DefaultApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://solarenergyprediction.p.rapidapi.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**prediction**](docs/DefaultApi.md#prediction) | **GET** /v2.0/solar/prediction | Retrieve PV Forecast without metering


## Documentation for Models



## Documentation for Authorization

Authentication schemes defined for the API:
### RapidAPI

- **Type**: API key

- **API key parameter name**: X-RapidAPI-Key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

dev@stromdao.com

