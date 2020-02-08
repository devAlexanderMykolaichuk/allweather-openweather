package com.allweather.openweather.allweatheropenweather.client.components;

import lombok.Data;

@Data
public class OpenWeatherWeather {

    private int id;
    private String main;
    private String description;
    private String icon;
}
