package com.spring.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.Booking1;
@Repository
public interface Booking1Repository extends JpaRepository<Booking1, String> {

}
