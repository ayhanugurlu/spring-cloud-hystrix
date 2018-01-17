package com.au.example.weatherapp.controller;

import com.au.example.weatherapp.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * Created by Ayhan.Ugurlu on 17/01/2018
 */
@RestController
public class WeatherApp {

    @Inject
    private WeatherService weatherService;


    @GetMapping("/current/weather")
    public String getWeather() {
        return "The current weather is "+weatherService.getWeather();
    }
}
