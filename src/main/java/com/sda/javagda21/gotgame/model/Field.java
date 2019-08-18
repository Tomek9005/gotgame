package com.sda.javagda21.gotgame.model;

public class Field {

    private Integer fieldNo;
    private Player owner;


    public Field() {
    }

    public Field(Integer fieldNo, Player owner) {
        this.fieldNo = fieldNo;
        this.owner = owner;
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

    @Override
    public String toString() {
        return "Field{" +
                "fieldNo=" + fieldNo +
                ", owner=" + owner +
                '}';
    }
}
