package com.spring.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.Repository.Booking1Repository;
import com.spring.demo.model.Booking1;

@Service
public class Booking1Service {
	@Autowired
	private Booking1Repository booking1Repository;

	public void addBooking(Booking1 booking1) {
		booking1Repository.saveAndFlush(booking1);

	}

	public List<Booking1> getAll() {
		return booking1Repository.findAll();
	}

}
