package com.allweather.openweather.allweatheropenweather.client.components;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
@Log4j2
public class OWHttpClient {

    private final HttpClient httpClient = java.net.http.HttpClient.newBuilder().build();

    private final ObjectMapper objectMapper;

    public OWHttpClient() {
        this.objectMapper = new ObjectMapper();
    }

    public <T> T proccesGet(URI uri, Class<T> responze){
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(uri)
                .build();
        log.info("GET REQUEST will be sent to uri " + uri.toString());
        try {
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            log.info("Raw resp: " + response.body());
            return objectMapper.readValue(response.body(), responze);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static void main(String[] args) {
        OWHttpClient owHttpClient = new OWHttpClient();
        owHttpClient.proccesGet(URI.create("https://google.com"), OpenWeatherResponse.class);
    }

}
