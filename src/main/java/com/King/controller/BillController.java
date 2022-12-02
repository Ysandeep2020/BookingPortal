package com.King.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.King.model.BillModel;
import com.King.service.BillService;

@RestController
@RequestMapping("/bill")
public class BillController {
	@Autowired
	private BillService billService;

	@PostMapping("/add")
	public String add(@RequestBody BillModel model) throws Exception {
		return billService.add(model);
	}

	@GetMapping("/{id}")
	public BillModel findById(@PathVariable int id) throws Exception {
		return billService.fetchById(id);
	}

	@GetMapping("/all")
	public List<BillModel> findAll() throws Exception {
		return billService.fetchAll();
	}

}
