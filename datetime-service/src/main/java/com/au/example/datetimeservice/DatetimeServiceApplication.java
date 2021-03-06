package com.au.example.datetimeservice;

import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class DatetimeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatetimeServiceApplication.class, args);
	}


}