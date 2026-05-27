
package com.mycompany.DungeonMaster.model;


public class Player {
    private int hp;
    private int dmgbase;
    private int def;
    private double crit;
    private double critrate;
    
    
    private void dmgcrit (){
        
    } 

    public Player(int hp, int dmgbase, int def, double crit) {
        this.hp = hp;
        this.dmgbase = dmgbase;
        this.def = def;
        this.crit = crit;
    }
    
    public Player() {}

    
    //<editor-fold defaultstate="collapsed" desc="get e set">
    public int getHp() {
        return hp;
    }
    
    public void setHp(int hp) {
        this.hp = hp;
    }
    
    public int getDmgbase() {
        return dmgbase;
    }
    
    public void setDmgbase(int dmgbase) {
        this.dmgbase = dmgbase;
    }
    
    public int getDef() {
        return def;
    }
    
    public void setDef(int def) {
        this.def = def;
    }
    
    public double getCrit() {
        return crit;
    }
    
    public void setCrit(double crit) {
        this.crit = crit;
        

}//</editor-fold>

    
    
}