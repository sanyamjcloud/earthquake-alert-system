package com.earthquake.alertsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfig {

    private static final String API =
        "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_hour.geojson";

    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl(API)
                .build();
    }
}