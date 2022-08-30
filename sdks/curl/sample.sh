#!/bin/sh

curl --request GET \
	--url 'https://solarenergyprediction.p.rapidapi.com/v2.0/solar/prediction?lat=49.3418836&lon=8.8006813&zip=69256&loss=14&deg=32&az=45&wp=6442&inverter=4500' \
	--header 'X-RapidAPI-Host: solarenergyprediction.p.rapidapi.com' \
	--header 'X-RapidAPI-Key: INSERT_YOUR_RAPID_API_KEY_HERE'
