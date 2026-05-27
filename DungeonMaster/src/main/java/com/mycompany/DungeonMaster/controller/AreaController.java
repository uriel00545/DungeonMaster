package com.mycompany.DungeonMaster.controller;

import com.mycompany.DungeonMaster.util.Cena;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class AreaController {

    @FXML
    private AnchorPane AreaCena;

    @FXML
    public void initialize() {

        Cena.setRootContainer(AreaCena);

        // cena inicial
        Cena.mostrar("/com/mycompany/DungeonMaster/Fogueira.fxml");
    }

    @FXML
    private void tfogueira() {
        Cena.mostrar("/com/mycompany/DungeonMaster/Fogueira.fxml");
    }

    @FXML
    private void tinv() {
        Cena.mostrar("/com/mycompany/DungeonMaster/Inventario.fxml");
    }

    @FXML
    private void tDescanso() {
        Cena.mostrar("/com/mycompany/DungeonMaster/Descanso.fxml");
    }

    @FXML
    private void tLoja() {
        Cena.mostrar("/com/mycompany/DungeonMaster/Loja.fxml");
    }
}