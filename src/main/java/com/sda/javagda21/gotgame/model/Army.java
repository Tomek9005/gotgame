package com.sda.javagda21.gotgame.model;


import java.util.Random;

public class Army {
    private int size;

    public Army(int size) {
        this.size = size;
    }

    public int dealDmg (int size) {
        Random random = new Random();
        int damage = 0;

        for (int i = 0; i < size; i++) {
            damage = damage + random.nextInt(3);
        }

        return damage;

    }

    public int takeDmg (int dmg, int size){
        int kills = dmg/3;
        return size - kills;
    }
}


