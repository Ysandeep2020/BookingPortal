package com.King.service;

import java.util.List;

import com.King.model.HotelModel;

public interface HotelService {

	HotelModel findById(int id) throws Exception;
	public List<HotelModel> findAll(); 
	public List<HotelModel> findAll2();
	public String add(HotelModel model);
}
