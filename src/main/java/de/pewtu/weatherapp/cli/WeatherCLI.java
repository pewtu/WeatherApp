package de.pewtu.weatherapp.cli;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.pewtu.weatherapp.config.WeatherModule;
import de.pewtu.weatherapp.model.WeatherData;
import de.pewtu.weatherapp.service.WeatherService;

import java.util.Scanner;

public class WeatherCLI {
    public static void start() {
        Injector injector = Guice.createInjector(new WeatherModule());
        WeatherService service = injector.getInstance(WeatherService.class);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        try {
            WeatherData data = service.getWeather(city);
            System.out.println("\nCity: " + data.getCity());
            System.out.println("Temperature: " + data.getTemperature() + "°C");
            System.out.println("Description: " + data.getDescription());
        } catch (Exception e) {
            System.err.println("Error fetching weather data: " + e.getMessage());
        }
    }
}
