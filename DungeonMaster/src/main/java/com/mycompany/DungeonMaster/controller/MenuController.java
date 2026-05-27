package com.mycompany.DungeonMaster.controller;

import com.mycompany.DungeonMaster.util.Navegar;
import java.io.IOException;
import javafx.fxml.FXML;

public class MenuController {

    @FXML
    private void jogar() throws IOException {
        Navegar.ir("area.fxml");
    }
    
    

}
