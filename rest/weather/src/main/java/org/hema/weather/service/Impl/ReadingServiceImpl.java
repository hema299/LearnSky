package org.hema.weather.service.Impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.hema.weather.entity.Reading;
import org.hema.weather.exception.BadRequestException;
import org.hema.weather.repository.ReadingRepository;
import org.hema.weather.service.ReadingService;
import org.springframework.stereotype.Service;

@Service
public class ReadingServiceImpl implements ReadingService {
	
	private ReadingRepository repository;
	
	public ReadingServiceImpl(ReadingRepository repository)
	{
		this.repository=repository;
	}

	@Override
	public List<Reading> findAll() {
	
		return null;
	}

	@Override
	public Reading findByCity(String city) {
		
		return null;
	}

	@Override
	public Reading getWeatherProperty(String city) {
		
		return null;
	}

	@Override
	public Reading getHourlyAvgWeather(String city) {
		
		return null;
	}

	@Override
	public Reading getDailyAvgWeather(String city) {
		
		return null;
	}

	@Override
	@Transactional
	public Reading create(Reading reading) {
		
	Reading mayExists = repository.findByCity(reading.getCity());
	
	if(mayExists != null){
		throw new BadRequestException("Reading with city"+reading.getCity()+"already exists");
	}
	return repository.create(reading);
	}

}
