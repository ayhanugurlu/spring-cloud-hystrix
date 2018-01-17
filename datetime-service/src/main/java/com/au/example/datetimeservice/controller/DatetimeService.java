package com.au.example.datetimeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Ayhan.Ugurlu on 17/01/2018
 */
@RestController
public class DatetimeService {

    @GetMapping("/datetime")
    public String getCurrentDatetime() {
        return new Date().toString();
    }
}
