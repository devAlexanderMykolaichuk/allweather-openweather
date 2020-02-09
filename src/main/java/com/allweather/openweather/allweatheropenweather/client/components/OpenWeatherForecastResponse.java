package com.allweather.openweather.allweatheropenweather.client.components;

import lombok.Data;

import java.util.List;

@Data
public class OpenWeatherForecastResponse {
    private int cod;
    private String message;
    private int cnt;
    private List<OpenWeatherResponse> list;
    private OpenWeatherCity city;
}
