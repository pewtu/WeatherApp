package de.pewtu.weatherapp.model;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class WeatherData {
    @NotNull private String city;
    private float temperature;
    private float description;
}
