package com.earthquake.alertsystem;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class EarthquakeController {

    private final EarthquakeService service;

    public EarthquakeController(EarthquakeService service) {
        this.service = service;
    }

    @GetMapping("/earthquakes")
    public String getData() {
        return service.getEarthquakes();
    }
}