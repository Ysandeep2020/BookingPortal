package com.King.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.King.model.BookingModule;
import com.King.model.GuestModel;
import com.King.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	private BookingService service;

	@PostMapping("/add")
	public String add(@RequestBody BookingModule module) throws Exception {
		return service.set(module);
	}

	@GetMapping("/{id}")
	public BookingModule findById(@PathVariable int id) throws Exception {
		return service.fetchById(id);
	}
}
