package com.example.springaop.dao;

import org.springframework.stereotype.Repository;

import com.example.springaop.aspect.TrackTime;

@Repository
public class Dao1 {
	
	@TrackTime
	public String retrieveSomething() {
		return "Dao1";
	}	
}
