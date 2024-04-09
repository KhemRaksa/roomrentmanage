package com.example.roomrentalmanagementsystem.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer roomNumber;
    private Double price;
    private Boolean isAvailable;
    private String pictureUrl;
    private LocalDateTime previousDueDate;
    private LocalDateTime nextDueDate;

}
