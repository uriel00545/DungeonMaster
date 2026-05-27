
package com.mycompany.DungeonMaster.model;


public class Inimigo {
    private int hp;
    private int dmg;
    private int def;

    public Inimigo(int hp, int dmg, int def) {
        this.hp = hp;
        this.dmg = dmg;
        this.def = def;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }
    
}
