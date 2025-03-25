package com.example.bookingtracker.repository;

import com.example.bookingtracker.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
    
    List<Hotel> findByLocationContainingIgnoreCase(String location);
    
    List<Hotel> findByNameContainingIgnoreCase(String name);
}