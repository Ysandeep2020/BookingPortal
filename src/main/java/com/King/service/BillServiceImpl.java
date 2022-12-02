package com.King.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.King.entity.Bill;
import com.King.entity.Guest;
import com.King.model.BillModel;
import com.King.repository.BillRepository;
import com.King.repository.GuestRepository;

@Service
public class BillServiceImpl implements BillService {
	@Autowired
	private BillRepository billRepo;
	@Autowired
	private GuestRepository guestRepo;

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
		billRepo.save(bill);
		return "Invoice Added !";
	}

	@Override
	public BillModel fetchById(int id) throws Exception {
		BillModel model = new BillModel();
		Bill bill = billRepo.findById(id).orElseThrow(() -> new Exception("No Guest with :" + id));
		BeanUtils.copyProperties(bill, model);
		model.setGuestId(bill.getId());
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
			models.add(model);
		});
		return models;
	}
}
