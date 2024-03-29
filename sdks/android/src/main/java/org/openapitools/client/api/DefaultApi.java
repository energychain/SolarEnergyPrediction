/**
 * SolarEnergyPrediction
 * The PV generation forecast for unmetered PV systems makes it possible to predict production of a PV system on an hourly basis for the next 4 days without having your own metering equipment or system-specific generation data.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: dev@stromdao.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.ApiInvoker;
import org.openapitools.client.ApiException;
import org.openapitools.client.Pair;


import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class DefaultApi {
  String basePath = "https://solarenergyprediction.p.rapidapi.com";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Retrieve PV Forecast without metering
  * The PV generation forecast for unmetered PV systems makes it possible to predict production of a PV system on an hourly basis for the next 4 days without having your own metering equipment or system-specific generation data.
   * @param xRapidAPIKey API Key from rapidapi.com
   * @param xRapidAPIHost API Host to use (should be &#x60;solarenergyprediction.p.rapidapi.com&#x60; )
   * @param lat Geocode latitude of pv plant (required if parameter plant or zip is not given).
   * @param lon Geocode longitude of pv plant (required if parameter plant or zip is not given).
   * @param zip Zipcode (postalcode) - works only for Germany. If specified no lat/lon parameter is required.
   * @param deg plane declination degrees, 0 (horizontal) … 90 (vertical)
   * @param az plant installation azimuth, -180 … 180 (-180 &#x3D; north, -90 &#x3D; east, 0 &#x3D; south, 90 &#x3D; west, 180 &#x3D; north)
   * @param wp Installed Watt-Peak  (eq. kWp/1000)
   * @param loss System loss in percent (defaults to 14)
   * @param plant If specified all other query parameters will be taken from the stored value and must not be given with the query string.    Use as comma separated list of IDs to retrieve a forecast for multiple specifications.
   * @param decoration Allows to use SolarPredictionAPI as a plug-in replacement for other APIs.    Supported decorations:    | &#x60;forecast.solar&#x60; | Output will be formated like [https://forecast.solar](http://doc.forecast.solar/doku.php?id&#x3D;api:estimate#example) |  |----|----|
   * @return void
  */
  public void prediction (String xRapidAPIKey, String xRapidAPIHost, Float lat, Float lon, String zip, Integer deg, Integer az, Integer wp, Integer loss, String plant, String decoration) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'xRapidAPIKey' is set
    if (xRapidAPIKey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xRapidAPIKey' when calling prediction",
        new ApiException(400, "Missing the required parameter 'xRapidAPIKey' when calling prediction"));
    }
    // verify the required parameter 'xRapidAPIHost' is set
    if (xRapidAPIHost == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xRapidAPIHost' when calling prediction",
        new ApiException(400, "Missing the required parameter 'xRapidAPIHost' when calling prediction"));
    }

    // create path and map variables
    String path = "/v2.0/solar/prediction";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "lat", lat));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "lon", lon));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "zip", zip));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "deg", deg));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "az", az));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "wp", wp));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "loss", loss));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "plant", plant));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "decoration", decoration));
    headerParams.put("X-RapidAPI-Key", ApiInvoker.parameterToString(xRapidAPIKey));
    headerParams.put("X-RapidAPI-Host", ApiInvoker.parameterToString(xRapidAPIHost));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return ;
      } else {
         return ;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Retrieve PV Forecast without metering
   * The PV generation forecast for unmetered PV systems makes it possible to predict production of a PV system on an hourly basis for the next 4 days without having your own metering equipment or system-specific generation data.
   * @param xRapidAPIKey API Key from rapidapi.com   * @param xRapidAPIHost API Host to use (should be &#x60;solarenergyprediction.p.rapidapi.com&#x60; )   * @param lat Geocode latitude of pv plant (required if parameter plant or zip is not given).   * @param lon Geocode longitude of pv plant (required if parameter plant or zip is not given).   * @param zip Zipcode (postalcode) - works only for Germany. If specified no lat/lon parameter is required.   * @param deg plane declination degrees, 0 (horizontal) … 90 (vertical)   * @param az plant installation azimuth, -180 … 180 (-180 &#x3D; north, -90 &#x3D; east, 0 &#x3D; south, 90 &#x3D; west, 180 &#x3D; north)   * @param wp Installed Watt-Peak  (eq. kWp/1000)   * @param loss System loss in percent (defaults to 14)   * @param plant If specified all other query parameters will be taken from the stored value and must not be given with the query string.    Use as comma separated list of IDs to retrieve a forecast for multiple specifications.   * @param decoration Allows to use SolarPredictionAPI as a plug-in replacement for other APIs.    Supported decorations:    | &#x60;forecast.solar&#x60; | Output will be formated like [https://forecast.solar](http://doc.forecast.solar/doku.php?id&#x3D;api:estimate#example) |  |----|----|
  */
  public void prediction (String xRapidAPIKey, String xRapidAPIHost, Float lat, Float lon, String zip, Integer deg, Integer az, Integer wp, Integer loss, String plant, String decoration, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'xRapidAPIKey' is set
    if (xRapidAPIKey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xRapidAPIKey' when calling prediction",
        new ApiException(400, "Missing the required parameter 'xRapidAPIKey' when calling prediction"));
    }
    // verify the required parameter 'xRapidAPIHost' is set
    if (xRapidAPIHost == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xRapidAPIHost' when calling prediction",
        new ApiException(400, "Missing the required parameter 'xRapidAPIHost' when calling prediction"));
    }

    // create path and map variables
    String path = "/v2.0/solar/prediction".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "lat", lat));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "lon", lon));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "zip", zip));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "deg", deg));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "az", az));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "wp", wp));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "loss", loss));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "plant", plant));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "decoration", decoration));

    headerParams.put("X-RapidAPI-Key", ApiInvoker.parameterToString(xRapidAPIKey));
    headerParams.put("X-RapidAPI-Host", ApiInvoker.parameterToString(xRapidAPIHost));

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
              responseListener.onResponse(localVarResponse);
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
