package com.example.roomrentalmanagementsystem.repository;

import com.example.roomrentalmanagementsystem.models.Rentee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RenteeRepository extends JpaRepository<Rentee, Long> {
}
