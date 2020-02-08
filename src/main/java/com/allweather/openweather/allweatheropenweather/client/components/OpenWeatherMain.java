package com.allweather.openweather.allweatheropenweather.client.components;

import lombok.Data;

@Data
public class OpenWeatherMain {

    private int pressure;

    private int humidity;

    private double temp;

    private double temp_min;

    private double temp_max;
}
