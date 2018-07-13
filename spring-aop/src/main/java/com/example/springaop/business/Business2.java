package com.example.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springaop.dao.Dao1;

@Service
public class Business2 {
	@Autowired
	private Dao1 dao2;
	
	public String calculateSomething() {
		return dao2.retrieveSomething();
	}
}