package com.mycompany.DungeonMaster.model;


import com.mycompany.DungeonMaster.model.Personagem;

public class Player extends Personagem {

    private int id;
    private double critRate;

    public Player(int id, int hp, int defesa, double critRate) {
        super(hp, defesa);

        this.id = id;
        this.critRate = critRate;
    }
}