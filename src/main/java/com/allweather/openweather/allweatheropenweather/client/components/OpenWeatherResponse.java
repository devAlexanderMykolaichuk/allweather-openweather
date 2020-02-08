package com.allweather.openweather.allweatheropenweather.client.components;

import lombok.Data;

import java.util.List;

@Data
public class OpenWeatherResponse {

    private int cod;
    private String message;
    private String name;
    private Long id;
    private int timeZone;
    private OpenWeatherSys sys;
    private Long dt;
    private OpenWeatherClouds clouds;
    private OpenWeatherWind wind;
    private int visibility;
    private OpenWeatherMain main;
    private String base;
    private List<OpenWeatherWeather> weather;
    private OpenWeatherCoordinate coord;
}
