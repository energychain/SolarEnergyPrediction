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
 *
 */


import ApiClient from "../ApiClient";

/**
* Default service.
* @module api/DefaultApi
* @version 1.0.0
*/
export default class DefaultApi {

    /**
    * Constructs a new DefaultApi. 
    * @alias module:api/DefaultApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the prediction operation.
     * @callback module:api/DefaultApi~predictionCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieve PV Forecast without metering
     * The PV generation forecast for unmetered PV systems makes it possible to predict production of a PV system on an hourly basis for the next 4 days without having your own metering equipment or system-specific generation data.
     * @param {String} xRapidAPIKey API Key from rapidapi.com
     * @param {module:model/String} xRapidAPIHost API Host to use (should be `solarenergyprediction.p.rapidapi.com` )
     * @param {Object} opts Optional parameters
     * @param {Number} opts.lat Geocode latitude of pv plant (required if parameter plant or zip is not given).
     * @param {Number} opts.lon Geocode longitude of pv plant (required if parameter plant or zip is not given).
     * @param {String} opts.zip Zipcode (postalcode) - works only for Germany. If specified no lat/lon parameter is required.
     * @param {Number} opts.deg plane declination degrees, 0 (horizontal) … 90 (vertical)
     * @param {Number} opts.az plant installation azimuth, -180 … 180 (-180 = north, -90 = east, 0 = south, 90 = west, 180 = north)
     * @param {Number} opts.wp Installed Watt-Peak  (eq. kWp/1000)
     * @param {Number} opts.loss System loss in percent (defaults to 14)
     * @param {String} opts.plant If specified all other query parameters will be taken from the stored value and must not be given with the query string.    Use as comma separated list of IDs to retrieve a forecast for multiple specifications.
     * @param {module:model/String} opts.decoration Allows to use SolarPredictionAPI as a plug-in replacement for other APIs.    Supported decorations:    | `forecast.solar` | Output will be formated like [https://forecast.solar](http://doc.forecast.solar/doku.php?id=api:estimate#example) |  |----|----|
     * @param {module:api/DefaultApi~predictionCallback} callback The callback function, accepting three arguments: error, data, response
     */
    prediction(xRapidAPIKey, xRapidAPIHost, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'xRapidAPIKey' is set
      if (xRapidAPIKey === undefined || xRapidAPIKey === null) {
        throw new Error("Missing the required parameter 'xRapidAPIKey' when calling prediction");
      }
      // verify the required parameter 'xRapidAPIHost' is set
      if (xRapidAPIHost === undefined || xRapidAPIHost === null) {
        throw new Error("Missing the required parameter 'xRapidAPIHost' when calling prediction");
      }

      let pathParams = {
      };
      let queryParams = {
        'lat': opts['lat'],
        'lon': opts['lon'],
        'zip': opts['zip'],
        'deg': opts['deg'],
        'az': opts['az'],
        'wp': opts['wp'],
        'loss': opts['loss'],
        'plant': opts['plant'],
        'decoration': opts['decoration']
      };
      let headerParams = {
        'X-RapidAPI-Key': xRapidAPIKey,
        'X-RapidAPI-Host': xRapidAPIHost
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = null;
      let basePaths = ['https://solarenergyprediction.p.rapidapi.com/'];
      let basePath = basePaths[0]; // by default use the first one in "servers" defined in OpenAPI
      if (typeof opts['_base_path_index'] !== 'undefined') {
        if (opts['_base_path_index']  >= basePaths.length || opts['_base_path_index'] <  0) {
          throw new Error("Invalid index " + opts['_base_path_index'] + " when selecting the host settings. Must be less than " + basePaths.length);
        }
        basePath = basePaths[opts['_base_path_index']];
      }

      return this.apiClient.callApi(
        '/v2.0/solar/prediction', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, basePath, callback
      );
    }


}