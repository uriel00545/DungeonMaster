package com.mycompany.DungeonMaster.controller;


import javafx.fxml.FXML;
import com.mycompany.DungeonMaster.util.Cena;
import javafx.scene.layout.AnchorPane;

public class AreaController {
    
    @FXML
    private AnchorPane AreaCena;

    
    @FXML
    public void initialize() {
        
    Cena.setRootContainer(AreaCena);
    
    Cena.mostrar("fogueira.fxml");
     
   }
    
}