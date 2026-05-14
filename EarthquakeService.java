package com.earthquake.alertsystem;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EarthquakeService {

    private final String API =
        "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_hour.geojson";

    public String getEarthquakes() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API, String.class);
    }
}