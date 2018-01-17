package com.au.example.weatherservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Ayhan.Ugurlu on 17/01/2018
 */
@RestController
public class WeatherService {

    private String[] weather = new String[]{"sunny", "rainy", "cloudy", "windy"};


    @GetMapping("/weather")
    public String getWeather() {

        int rand = ThreadLocalRandom.current().nextInt(0, 4);
        return weather[rand];

    }
}
