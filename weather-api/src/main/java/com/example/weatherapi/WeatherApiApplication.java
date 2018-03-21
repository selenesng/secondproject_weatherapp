package com.example.weatherapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class WeatherApiApplication {

	@RequestMapping("/")
	public String home() { return "find a weather";}

	public static void main(String[] args) {
		SpringApplication.run(WeatherApiApplication.class, args);
	}
}
