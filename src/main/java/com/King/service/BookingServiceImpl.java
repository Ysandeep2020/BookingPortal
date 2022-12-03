package com.King.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.King.entity.Booking;
import com.King.entity.Guest;
import com.King.model.BookingModule;
import com.King.repository.BookingRepository;
import com.King.repository.GuestRepository;

@Service
public class BookingServiceImpl implements BookingService {
	@Autowired
	private BookingRepository repo;
	@Autowired
	private GuestRepository guestRepo;

	@Override
	public String set(BookingModule module) throws Exception {
		Booking booking = new Booking();
		BeanUtils.copyProperties(module, booking);
		// add guest id
		Guest guest = guestRepo.findById(module.getGuestId())
				.orElseThrow(() -> new Exception("No Guest are thre with Id:" + module.getGuestId()));
		booking.setGuest(guest);
		Booking save = repo.save(booking);
         // add that book id into  Guest
		 guest.setBooking(save);
	     guestRepo.save(guest);
		return "Booked By Id:";
	}

	@Override
	public BookingModule fetchById(int id) throws Exception {
		BookingModule module = new BookingModule();
		Booking booking = repo.findById(id).orElseThrow(() -> new Exception("No booking are there with Id:" + id));
		BeanUtils.copyProperties(booking, module);
		// add guest Id
		
		Guest guest = guestRepo.findById(booking.getGuest().getId())
				.orElseThrow(() -> new Exception("No Guest are thre with Id:" + module.getGuestId()));
		module.setGuestId(guest.getId());
		// Add bills
		module.setBills(booking.getBills());
		return module;
	}

}
