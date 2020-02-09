package com.allweather.openweather.allweatheropenweather.client.components;

import lombok.Data;

@Data
public class OpenWeatherCity {
    private int id;
    private String name;
    private OpenWeatherCoordinate coord;
    private String country;
    private int timezone;
    private Long sunrise;
    private Long sunset;
}
