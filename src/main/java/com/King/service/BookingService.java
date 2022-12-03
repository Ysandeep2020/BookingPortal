package com.King.service;

import com.King.model.BookingModule;

public interface BookingService {

	String set(BookingModule module) throws Exception;

	BookingModule fetchById(int id) throws Exception;

}
