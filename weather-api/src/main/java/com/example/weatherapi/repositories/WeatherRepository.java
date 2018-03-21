package com.example.weatherapi.repositories;

import com.example.weatherapi.models.Weather;
import org.springframework.data.repository.CrudRepository;

public interface WeatherRepository extends CrudRepository<Weather, Long> {
}