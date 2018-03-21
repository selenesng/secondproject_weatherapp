package com.example.weatherapi.controllers;

import com.example.weatherapi.models.*;
import com.example.weatherapi.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import lombok.*;

import java.util.*;

@RestController
public class WeatherController {

    @Autowired
    private WeatherRepository weatherRepo;

    @GetMapping("/all")
    public Iterable<Weather> getAll() {
        return weatherRepo.findAll();
    }

    @GetMapping("/view/{id}")
    public Weather searchById(@PathVariable long id) {
        return weatherRepo.findOne(id);
    }

    @DeleteMapping("/delete/{id}")
    public HttpStatus deleteWeather(@PathVariable long id) {
        weatherRepo.delete(id);
        return HttpStatus.OK;
    }

    @PostMapping("/create")
    public HttpStatus createWeather(@RequestBody Weather weather) {
        weatherRepo.save(weather);
        return HttpStatus.OK;
    }

    @PatchMapping("/update/{id}")
    public HttpStatus updateSong(@PathVariable long id, @RequestBody Weather weatherRequest) {
        Weather weather = weatherRepo.findOne(id);
        weather.setCity(weatherRequest.getCity());
        weather.setCountry(weatherRequest.getCountry());
        weatherRepo.save(weather);
        return HttpStatus.OK;

    }
}

