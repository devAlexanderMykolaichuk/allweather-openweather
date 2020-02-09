package com.allweather.openweather.allweatheropenweather.client;

import com.allweather.openweather.allweatheropenweather.client.components.OWHttpClient;
import com.allweather.openweather.allweatheropenweather.client.components.OpenWeatherForecastResponse;
import com.allweather.openweather.allweatheropenweather.client.components.OpenWeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class OWClient {

    private static String SCHAME = "https";
    private static String BASE_URL = "api.openweathermap.org/data/2.5";
    private static String FORECAST_PATH = "forecast";
    private static String APP_KEY_NAME = "appid";
    private static String APP_KEY_VALUE = "c7defecbfa765360affb39c837caac74";
    private static int CITY_ID = 703448;

    private final OWHttpClient owHttpClient;

    public OWClient(OWHttpClient owHttpClient) {
        this.owHttpClient = owHttpClient;
    }


    public OpenWeatherForecastResponse updateForecast(){
        URI uri = UriComponentsBuilder.newInstance()
                .scheme(SCHAME)
                .host(BASE_URL)
                .path(FORECAST_PATH)
                .queryParam(APP_KEY_NAME, APP_KEY_VALUE)
                .queryParam("units", "metric")
                .queryParam("id", CITY_ID)
                .build()
                .toUri();
        return owHttpClient.proccesGet(uri, OpenWeatherForecastResponse.class);
    }

    public static void main(String[] args) {
        OWClient owClient = new OWClient(new OWHttpClient());
        System.out.println(owClient.updateForecast());
    }
}
