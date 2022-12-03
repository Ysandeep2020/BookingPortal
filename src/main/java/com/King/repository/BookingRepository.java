package com.King.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.King.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
    
	Booking findByGuest(int guest);
         
}
