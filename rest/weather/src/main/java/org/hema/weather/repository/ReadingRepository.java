package org.hema.weather.repository;

import java.util.List;

import org.hema.weather.entity.Reading;

public interface ReadingRepository {
	
public List<Reading> findAll();
	
	public Reading findByCity(String city);
	
	public Reading getWeatherProperty(String city);
	
	public Reading getHourlyAvgWeather(String city);
	
	public Reading getDailyAvgWeather(String city);
	
	public Reading create(Reading reading);
	
	

}
