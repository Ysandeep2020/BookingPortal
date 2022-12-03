package com.King.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.King.entity.Guest;
import com.King.model.GuestModel;
import com.King.repository.GuestRepository;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class GuestServiceImpl implements GuestService {

	@Autowired
	private GuestRepository guestRepo;

	@Override
	public String add(GuestModel model) {
		Guest guest = new Guest();
		BeanUtils.copyProperties(model, guest);
		guestRepo.save(guest);
		return "Guest Added !";
	}

	@Override
	public GuestModel fetchById(int id) throws Exception {
		GuestModel model = new GuestModel();
		Guest guest = guestRepo.findById(id).orElseThrow(() -> new Exception("No Guest with :" + id));
		BeanUtils.copyProperties(guest, model);
		model.setBookingId(guest.getBooking().getId());
		return model;
	}

	@Override
	public List<GuestModel> fetchAll() {
		List<GuestModel> models = new ArrayList<>();
		List<Guest> guests = guestRepo.findAll();
		guests.stream().forEach(guest -> {
			GuestModel model = new GuestModel();
			BeanUtils.copyProperties(guest, model);
			models.add(model);
		});
		return models;
	}

}
