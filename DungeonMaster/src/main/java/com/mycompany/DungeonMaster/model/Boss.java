
package com.mycompany.DungeonMaster.model;

/**
 *
 * @author aluno
 */
public class Boss extends Inimigo {
    
    private String habilidadeEspecial;

    public Boss(String habilidadeEspecial, int hp, int dmg, int def) {
        super(hp, dmg, def);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }

    
    
    
    
}
