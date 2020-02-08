package com.allweather.openweather.allweatheropenweather.client.components;

import lombok.Data;

@Data
public class OpenWeatherSys {

    private int type;
    private int id;
    private double message;
    private String country;
    private Long sunrise;
    private Long sunset;
}
