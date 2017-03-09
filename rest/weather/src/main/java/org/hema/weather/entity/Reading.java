package org.hema.weather.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
//@NamedQueries({
//	@NamedQuery(name="Reading.findByCity",query ="SELECT r from Reading where r.city=:givenCity"),
//	@NamedQuery(name="Reading.findAll",query="SELECT r from Reading")
//})
public class Reading {
	
	@Id
	private String city;
	private String description;
	private double humidity;
	private double pressure;
	private double temperature;
	//private Wind wind = new Wind(0.0,0.0);
	//private String timestamp;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
//	public Wind getWind() {
//		return wind;
//	}
//	public void setWind(Wind wind1) {
//		this.wind.setSpeed(wind1.getSpeed());
//		this.wind.setDegree(wind1.getDegree());
//		
//	}
//	public String getTimestamp() {
//		return timestamp;
//	}
//	public void setTimestamp(String timestamp) {
//		this.timestamp = new SimpleDateFormat("YYYY-MM-DDTHH:MM:SSZ").format(new Date());
//	}
	

}
