package com.example.demo.controller;

import com.example.demo.entity.Weather;
import com.example.demo.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    // CREATE
    @PostMapping
    public Weather saveWeather(@RequestBody Weather weather) {
        return weatherService.saveWeather(weather);
    }

    // READ ALL
    @GetMapping
    public List<Weather> getAllWeather() {
        return weatherService.getAllWeather();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public ResponseEntity<Weather> getWeatherById(@PathVariable Long id) {

        return weatherService.getWeatherById(id)
                .map(weather -> ResponseEntity.ok(weather))
                .orElse(ResponseEntity.notFound().build());
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Weather> updateWeather(
            @PathVariable Long id,
            @RequestBody Weather weather) {

        Weather updatedWeather =
                weatherService.updateWeather(id, weather);

        if (updatedWeather != null) {
            return ResponseEntity.ok(updatedWeather);
        }

        return ResponseEntity.notFound().build();
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteWeather(@PathVariable Long id) {

        weatherService.deleteWeather(id);

        return ResponseEntity.ok("Weather record deleted successfully");
    }
}