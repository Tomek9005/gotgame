package com.sda.javagda21.gotgame.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    @OneToMany
    private Gold gold;
}
