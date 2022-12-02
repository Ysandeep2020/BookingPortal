package com.King.service;

import java.util.List;

import com.King.model.BillModel;

public interface BillService {

	String add(BillModel model) throws Exception;

	BillModel fetchById(int id) throws Exception;

	List<BillModel> fetchAll();

}
