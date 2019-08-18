package com.sda.javagda21.gotgame.model;

import org.springframework.stereotype.Component;

import javax.persistence.OneToMany;

@Component
public class Player {

    private String name;


    @OneToMany
    private Gold gold;
}
