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
(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.SolarEnergyPrediction);
  }
}(this, function(expect, SolarEnergyPrediction) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new SolarEnergyPrediction.PredictionApi();
  });

  describe('(package)', function() {
    describe('PredictionApi', function() {
      describe('v20SolarPredictionGet', function() {
        it('should call v20SolarPredictionGet successfully', function(done) {
          // TODO: uncomment, update parameter values for v20SolarPredictionGet call and complete the assertions
          /*
          var opts = {};

          instance.v20SolarPredictionGet(xRapidAPIKey, lon, lat, wp, opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(SolarEnergyPrediction.InlineResponse200);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
    });
  });

}));
