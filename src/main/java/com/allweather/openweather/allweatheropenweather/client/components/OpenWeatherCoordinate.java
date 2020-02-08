package com.allweather.openweather.allweatheropenweather.client.components;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
public class OpenWeatherCoordinate {

    private double lon;

    private double lat;
}
