package org.hema.weather.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.hema.weather.entity.Reading;
import org.hema.weather.repository.ReadingRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ReadingRepositoryImpl implements ReadingRepository{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Reading> findAll() {
		
		return null;
	}

	@Override
	public Reading findByCity(String city) {
		
		//TypedQuery<Reading> query=em.createNamedQuery("Reading.findByCity",Reading.class);
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
	public Reading create(Reading reading) {
		em.persist(reading);
		return reading;
	}

}
