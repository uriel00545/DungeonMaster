module com.mycompany.DungeonMaster {

    requires javafx.controls;
    requires javafx.fxml;

    exports com.mycompany.DungeonMaster;

    opens com.mycompany.DungeonMaster to javafx.fxml;
    opens com.mycompany.DungeonMaster.controller to javafx.fxml;
}