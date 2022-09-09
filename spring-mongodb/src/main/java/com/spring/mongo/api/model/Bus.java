package com.spring.mongo.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.internal.connection.Time;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;




@Getter
@Setter
@ToString

@Document(collection = "Bus")
public class Bus {
 @Id
 
	 private int id;

	 private String  BusName;

	private String  BusRoute;

	private String  BusTrip;

	private String  BusType;

	private Time  StartTime;

	private Time  EndTime;
	
	
	
	
	

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus(int id, String busName, String busRoute, String busTrip, String busType, Time startTime, Time endTime) {
		super();
		this.id = id;
		this.BusName = busName;
		this.BusRoute = busRoute;
		this.BusTrip = busTrip;
		this.BusType = busType;
		this.StartTime = startTime;
		this.EndTime = endTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBusName() {
		return BusName;
	}

	public void setBusName(String busName) {
		BusName = busName;
	}

	public String getBusRoute() {
		return BusRoute;
	}

	public void setBusRoute(String busRoute) {
		BusRoute = busRoute;
	}

	public String getBusTrip() {
		return BusTrip;
	}

	public void setBusTrip(String busTrip) {
		BusTrip = busTrip;
	}

	public String getBusType() {
		return BusType;
	}

	public void setBusType(String busType) {
		BusType = busType;
	}

	public Time getStartTime() {
		return StartTime;
	}

	public void setStartTime(Time startTime) {
		StartTime = startTime;
	}

	public Time getEndTime() {
		return EndTime;
	}

	public void setEndTime(Time endTime) {
		EndTime = endTime;
	}

//	public int getId() {
//		// TODO Auto-generated method stub
//		return id;
//	}
	
	

	
}
