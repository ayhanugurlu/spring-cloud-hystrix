package com.au.example.weatherapp.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;

/**
 * Created by Ayhan.Ugurlu on 17/01/2018
 */
@Service
public class WeatherService {

    @Inject
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "unknown")
    public String getWeather() {
         return restTemplate.getForEntity("http://weather-service/weather",String.class).getBody();
    }

    public String unknown() {
        return "unknown";
    }
}
