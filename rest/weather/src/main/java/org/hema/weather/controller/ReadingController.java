package org.hema.weather.controller;

import org.hema.weather.constants.URI;
import org.hema.weather.entity.Reading;
import org.hema.weather.service.ReadingService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value=URI.READINGS)
public class ReadingController {
	
	private ReadingService service;
	
	public ReadingController(ReadingService service)
	{
		this.service=service;
	}
	

	@RequestMapping(method=RequestMethod.POST)
	@CrossOrigin(origins = "http://mocker.egen.io")
	public Reading create(@RequestBody Reading reading)
	{
		System.out.println("hema");
		  System.out.println(reading.toString());
		return service.create(reading);
	}
}
