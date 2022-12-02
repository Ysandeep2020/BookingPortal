package com.King.service;

import java.util.List;

import com.King.entity.Guest;
import com.King.model.GuestModel;

public interface GuestService {

	String add(GuestModel model);

	GuestModel fetchById(int id) throws Exception;

	List<GuestModel> fetchAll();

}
