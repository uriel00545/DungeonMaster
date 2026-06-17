package com.mycompany.DungeonMaster.model;


import com.mycompany.DungeonMaster.model.Personagem;

public class Inimigo extends Personagem {

    private String nome;

    public Inimigo(String nome, int hp, int defesa) {
        super(hp, defesa);

        this.nome = nome;
    }
}