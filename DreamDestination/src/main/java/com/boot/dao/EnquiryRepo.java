package com.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.entity.Enquiry;

@Repository
public interface EnquiryRepo extends JpaRepository<Enquiry, String>{

}
