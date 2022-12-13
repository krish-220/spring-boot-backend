package com.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.Booking1;
import com.spring.demo.service.Booking1Service;

@RestController
public class Booking1Controller {
	@Autowired
	private Booking1Service booking1service;

	@PostMapping("/Booking1")
	public void addBooking(Booking1 booking1) {
		booking1service.addBooking(booking1);

	}
	@GetMapping("/Booking1")
	public List<Booking1> getAll() {
		return booking1service.getAll();
	}

}