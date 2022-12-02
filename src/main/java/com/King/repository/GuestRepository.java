package com.King.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.King.entity.Guest;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Integer> {

}
