package com.sda.javagda21.gotgame.model;


import java.util.Random;

public class Army {
    private int size;

    public Army(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }




    @Override
    public String toString() {
        return "Army{" +
                "size=" + size +
                '}';
    }
}


