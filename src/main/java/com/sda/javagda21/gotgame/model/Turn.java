package com.sda.javagda21.gotgame.model;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import org.springframework.stereotype.Component;



@Component
public class Turn {

    TextField textField = new TextField("Turn for: ");
    Button button = new Button("End Turn");
}
