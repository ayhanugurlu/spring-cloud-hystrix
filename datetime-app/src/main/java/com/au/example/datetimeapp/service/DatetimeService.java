package com.au.example.datetimeapp.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;

/**
 * Created by Ayhan.Ugurlu on 17/01/2018
 */

@Service
public class DatetimeService {

    @Inject
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "unknown")
    public String getCurrentDatetime() {
        return restTemplate
                .getForEntity("http://datetime-service/datetime", String.class)
                .getBody();
    }

    public String unknown() {
        return "unknown";
    }
}