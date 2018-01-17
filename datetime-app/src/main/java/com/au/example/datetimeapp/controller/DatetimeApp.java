package com.au.example.datetimeapp.controller;

import com.au.example.datetimeapp.service.DatetimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * Created by Ayhan.Ugurlu on 17/01/2018
 */
@RestController
public class DatetimeApp {

    @Inject
    DatetimeService datetimeService;

    @GetMapping("/current/datetime")
    public String getCurrentDateTime() {
        return String.format("The date/time is %s", datetimeService.getCurrentDatetime());
    }
}
