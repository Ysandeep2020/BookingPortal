package com.King.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.King.entity.Bill;
import com.King.entity.Booking;
import com.King.entity.Guest;
import com.King.model.BillModel;
import com.King.repository.BillRepository;
import com.King.repository.BookingRepository;
import com.King.repository.GuestRepository;

@Service
public class BillServiceImpl implements BillService {
	@Autowired
	private BillRepository billRepo;
	@Autowired
	private GuestRepository guestRepo;
	@Autowired
	private BookingRepository bookingRepo;

	@Override
	public String add(BillModel model) throws Exception {
		Bill bill = new Bill();
		// PaymentMode.getByValue("DebitCard");
		// PaymentMode mode = PaymentMode.valueOf(model.getPaymentMode());
		// PaymentMode mode1 = PaymentMode.getByValue(model.getPaymentMode());
		BeanUtils.copyProperties(model, bill);
		Guest guest = guestRepo.findById(model.getGuestId())
				.orElseThrow(() -> new Exception("No Guest with :" + model.getGuestId()));
		bill.setGuest(guest);
		Booking booking = bookingRepo.findById(model.getBooingId())
				.orElseThrow(() -> new Exception("No Booking with :" + model.getBooingId()));
		bill.setGuest(guest);
		bill.setBooking(booking);
		billRepo.save(bill);
		return "Invoice Added !";
	}

	@Override
	public BillModel fetchById(int id) throws Exception {
		BillModel model = new BillModel();
		Bill bill = billRepo.findById(id).orElseThrow(() -> new Exception("No Guest with :" + id));
		BeanUtils.copyProperties(bill, model);
		model.setGuestId(bill.getId());
		if(bill.getBooking()==null) {
			throw new RuntimeException("No Booking ...please book fiest then go further");
		}
		model.setBooingId(bill.getBooking().getId());
		return model;
	}

	@Override
	public List<BillModel> fetchAll() {
		List<BillModel> models = new ArrayList<>();
		List<Bill> bills = billRepo.findAll();
		bills.stream().forEach(bill -> {
			BillModel model = new BillModel();
			BeanUtils.copyProperties(bill, model);
			model.setGuestId(bill.getId());
			if(bill.getBooking()==null) {
				throw new RuntimeException("No Booking ...please book fiest then go further");
			}
			model.setBooingId(bill.getBooking().getId());
			models.add(model);
		});
		return models;
	}
}
