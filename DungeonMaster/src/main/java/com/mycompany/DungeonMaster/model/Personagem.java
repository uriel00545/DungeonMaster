package com.mycompany.DungeonMaster.model;

public abstract class Personagem {

    protected int hp;
    protected int defesa;

    public Personagem(int hp, int defesa) {
        this.hp = hp;
        this.defesa = defesa;
    }
    
    public int atacar() {

    return (int)(Math.random() * 15) + 1;
        }

    public void receberDano(int dano) {

        int danoFinal = dano - defesa;

        if (danoFinal < 0) {
            danoFinal = 0;
        }

        hp -= danoFinal;
    }

    public boolean estaVivo() {
        return hp > 0;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    //</editor-fold>
}