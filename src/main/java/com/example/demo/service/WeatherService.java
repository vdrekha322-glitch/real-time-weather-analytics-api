package com.example.demo.service;

import com.example.demo.entity.Weather;
import com.example.demo.repository.WeatherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WeatherService {

    private final WeatherRepository weatherRepository;

    public WeatherService(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    // CREATE
    public Weather saveWeather(Weather weather) {
        return weatherRepository.save(weather);
    }

    // READ ALL
    public List<Weather> getAllWeather() {
        return weatherRepository.findAll();
    }

    // READ BY ID
    public Optional<Weather> getWeatherById(Long id) {
        return weatherRepository.findById(id);
    }

    // UPDATE
    public Weather updateWeather(Long id, Weather newWeather) {

        Optional<Weather> optionalWeather =
                weatherRepository.findById(id);

        if (optionalWeather.isPresent()) {

            Weather existingWeather = optionalWeather.get();

            existingWeather.setCity(newWeather.getCity());
            existingWeather.setTemperature(newWeather.getTemperature());
            existingWeather.setHumidity(newWeather.getHumidity());
            existingWeather.setCondition(newWeather.getCondition());
            existingWeather.setRecordedAt(newWeather.getRecordedAt());

            return weatherRepository.save(existingWeather);
        }

        return null;
    }

    // DELETE
    public void deleteWeather(Long id) {
        weatherRepository.deleteById(id);
    }
}