/*
 * SolarEnergyPrediction
 * AI-based photovoltaic power prediction for unmetered PV plants. Powered by our industry-leading irradiance and real-time weather data.
 *
 * OpenAPI spec version: 1.1
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.34
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from './ApiClient';
import {InlineResponse200} from './model/InlineResponse200';
import {DefaultApi} from './api/DefaultApi';
import {PredictionApi} from './api/PredictionApi';

/**
* AI_based_photovoltaic_power_prediction_for_unmetered_PV_plants__Powered_by_our_industry_leading_irradiance_and_real_time_weather_data_.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var SolarEnergyPrediction = require('index'); // See note below*.
* var xxxSvc = new SolarEnergyPrediction.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new SolarEnergyPrediction.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new SolarEnergyPrediction.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new SolarEnergyPrediction.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version 1.1
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The InlineResponse200 model constructor.
     * @property {module:model/InlineResponse200}
     */
    InlineResponse200,

    /**
    * The DefaultApi service constructor.
    * @property {module:api/DefaultApi}
    */
    DefaultApi,

    /**
    * The PredictionApi service constructor.
    * @property {module:api/PredictionApi}
    */
    PredictionApi
};
