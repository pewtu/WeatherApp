package de.pewtu.weatherapp.config;

import com.google.inject.AbstractModule;
import de.pewtu.weatherapp.service.WeatherService;

public class WeatherModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(WeatherService.class);
    }
}
