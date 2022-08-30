#
# SolarEnergyPrediction
# The PV generation forecast for unmetered PV systems makes it possible to predict production of a PV system on an hourly basis for the next 4 days without having your own metering equipment or system-specific generation data.
# Version: 1.0.0
# Contact: dev@stromdao.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

Retrieve PV Forecast without metering

.DESCRIPTION

No description available.

.PARAMETER XRapidAPIKey
API Key from rapidapi.com

.PARAMETER XRapidAPIHost
API Host to use (should be `solarenergyprediction.p.rapidapi.com` )

.PARAMETER Lat
Geocode latitude of pv plant (required if parameter plant or zip is not given).

.PARAMETER Lon
Geocode longitude of pv plant (required if parameter plant or zip is not given).

.PARAMETER Zip
Zipcode (postalcode) - works only for Germany. If specified no lat/lon parameter is required.

.PARAMETER Deg
plane declination degrees, 0 (horizontal) … 90 (vertical)

.PARAMETER Az
plant installation azimuth, -180 … 180 (-180 = north, -90 = east, 0 = south, 90 = west, 180 = north)

.PARAMETER Wp
Installed Watt-Peak  (eq. kWp/1000)

.PARAMETER Loss
System loss in percent (defaults to 14)

.PARAMETER Plant
If specified all other query parameters will be taken from the stored value and must not be given with the query string.    Use as comma separated list of IDs to retrieve a forecast for multiple specifications.

.PARAMETER Decoration
Allows to use SolarPredictionAPI as a plug-in replacement for other APIs.    Supported decorations:    | `forecast.solar` | Output will be formated like [https://forecast.solar](http://doc.forecast.solar/doku.php?id=api:estimate#example) |  |----|----|

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

None
#>
function Invoke-Prediction {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${XRapidAPIKey},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [ValidateSet("solarenergyprediction.p.rapidapi.com")]
        [String]
        ${XRapidAPIHost},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [System.Nullable[Double]]
        ${Lat},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [System.Nullable[Double]]
        ${Lon},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${Zip},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [System.Nullable[Int32]]
        ${Deg},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [System.Nullable[Int32]]
        ${Az},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [System.Nullable[Int32]]
        ${Wp},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [System.Nullable[Int32]]
        ${Loss},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${Plant},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [ValidateSet("forecast.solar")]
        [String]
        ${Decoration},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-Prediction' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $LocalVarAccepts = @()
        $LocalVarContentTypes = @()
        $LocalVarQueryParameters = @{}
        $LocalVarHeaderParameters = @{}
        $LocalVarFormParameters = @{}
        $LocalVarPathParameters = @{}
        $LocalVarCookieParameters = @{}
        $LocalVarBodyParameter = $null

        $Configuration = Get-Configuration
        # HTTP header 'Accept' (if needed)
        $LocalVarAccepts = @('application/json')

        $LocalVarUri = '/v2.0/solar/prediction'

        if (!$XRapidAPIKey) {
            throw "Error! The required parameter `XRapidAPIKey` missing when calling prediction."
        }
        $LocalVarHeaderParameters['X-RapidAPI-Key'] = $XRapidAPIKey

        if (!$XRapidAPIHost) {
            throw "Error! The required parameter `XRapidAPIHost` missing when calling prediction."
        }
        $LocalVarHeaderParameters['X-RapidAPI-Host'] = $XRapidAPIHost

        if ($Lat) {
            $LocalVarQueryParameters['lat'] = $Lat
        }

        if ($Lon) {
            $LocalVarQueryParameters['lon'] = $Lon
        }

        if ($Zip) {
            $LocalVarQueryParameters['zip'] = $Zip
        }

        if ($Deg) {
            $LocalVarQueryParameters['deg'] = $Deg
        }

        if ($Az) {
            $LocalVarQueryParameters['az'] = $Az
        }

        if ($Wp) {
            $LocalVarQueryParameters['wp'] = $Wp
        }

        if ($Loss) {
            $LocalVarQueryParameters['loss'] = $Loss
        }

        if ($Plant) {
            $LocalVarQueryParameters['plant'] = $Plant
        }

        if ($Decoration) {
            $LocalVarQueryParameters['decoration'] = $Decoration
        }

        $LocalVarResult = Invoke-ApiClient -Method 'GET' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "" `
                                -IsBodyNullable $false

        if ($WithHttpInfo.IsPresent) {
            return $LocalVarResult
        } else {
            return $LocalVarResult["Response"]
        }
    }
}

