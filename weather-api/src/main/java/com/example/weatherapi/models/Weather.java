package com.example.weatherapi.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Weather")

public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "city")
    private String city;

    @Column(name="country")
    private String country;

    public Weather(long id, String city, String country){
        this.id = id;
        this.city = city;
        this.country = country;
    }

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
//
//    public String toString() {
//        StringBuilder s = new StringBuilder();
//        s.append("Location")
//                .append("city,").append(city)
//                .append("country").append(country);
//        return s.toString();
//    }
}