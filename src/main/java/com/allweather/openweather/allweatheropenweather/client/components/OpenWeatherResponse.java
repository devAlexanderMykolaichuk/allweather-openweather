package com.allweather.openweather.allweatheropenweather.client.components;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenWeatherResponse {
    private OpenWeatherSys sys;
    private Long dt;
    private OpenWeatherClouds clouds;
    private OpenWeatherWind wind;
    private OpenWeatherMain main;
    private List<OpenWeatherWeather> weather;
    private String dt_txt;
}
