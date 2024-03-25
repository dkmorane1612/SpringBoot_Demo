package com.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.entity.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, String> {

}
