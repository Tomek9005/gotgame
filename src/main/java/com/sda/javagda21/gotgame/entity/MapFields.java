package com.sda.javagda21.gotgame.entity;

import com.sda.javagda21.gotgame.model.Player;

import javax.persistence.*;
import java.util.List;

@Entity
public class MapFields {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer fieldNo;
    private List surroundingFields;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "name")
    private Player owner;


    public MapFields() {
    }

    public MapFields(Integer fieldNo, Player owner, List surroundingFields) {
        this.fieldNo = fieldNo;
        this.owner = owner;
        this.surroundingFields = surroundingFields;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFieldNo() {
        return fieldNo;
    }

    public void setFieldNo(Integer fieldNo) {
        this.fieldNo = fieldNo;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public List getSurroundingFields() {
        return surroundingFields;
    }

    public void setSurroundingFields(List surroundingFields) {
        this.surroundingFields = surroundingFields;
    }
}
