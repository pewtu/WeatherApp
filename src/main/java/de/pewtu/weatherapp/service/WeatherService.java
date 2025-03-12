package de.pewtu.weatherapp.service;

import com.google.gson.Gson;
import de.pewtu.weatherapp.config.ConfigLoader;
import de.pewtu.weatherapp.model.WeatherData;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherService {
    private final String apiKey;

    public WeatherService() {
        this.apiKey = ConfigLoader.getApiKey();
    }

    public WeatherData getWeather(String city) throws Exception {
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";
        HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
        connection.setRequestMethod("GET");

        try (InputStreamReader reader = new InputStreamReader(connection.getInputStream())) {
            return new Gson().fromJson(reader, WeatherData.class);
        }
    }
}
