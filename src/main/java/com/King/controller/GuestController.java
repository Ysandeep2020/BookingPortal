package com.King.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.King.entity.Guest;
import com.King.model.GuestModel;
import com.King.model.HotelModel;
import com.King.service.GuestService;
import com.King.service.HotelService;

@RestController
@RequestMapping("/guest")
public class GuestController {
	@Autowired
	private GuestService guestService;
	@Autowired
	private HotelService hotelService;

	@PostMapping("/add")
	public String add(@RequestBody GuestModel model) {
		return guestService.add(model);
	}

	@GetMapping("/{id}")
	public GuestModel findById(@PathVariable int id) throws Exception {
		return guestService.fetchById(id);
	}

	@GetMapping("/all")
	public List<GuestModel> findAll() throws Exception {
		return guestService.fetchAll();
	}

	@GetMapping("/hotel/{id}")
	public HotelModel findByHotelId(@PathVariable int id) throws Exception {
		return hotelService.findById(id);
	}
	
	@GetMapping("/hotel/all")
	public List<HotelModel> findAllHotels() throws Exception {
		return hotelService.findAll2();
	}
	
	@PostMapping("/hotel/add")
	public String addHotel(@RequestBody HotelModel model) {
		return hotelService.add(model);
	}
}
