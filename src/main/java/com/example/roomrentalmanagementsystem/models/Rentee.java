package com.example.roomrentalmanagementsystem.models;

import javax.persistence.*;

@Entity
public class Rentee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String telephoneNumber;
    private String pictureUrl;
    private String identiyCardPictureUrl;

    @OneToOne
    private Room room;

}
