package com.mycompany.DungeonMaster.model;


public class Espada {

    private int id;
    private String nome;
    private int dano;
    private double critRate;

    public Espada(int id, String nome, int dano, double critRate) {
        this.id = id;
        this.nome = nome;
        this.dano = dano;
        this.critRate = critRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public double getCritRate() {
        return critRate;
    }

    public void setCritRate(double critRate) {
        this.critRate = critRate;
    }

    
}