module com.mycompany.DungeonMaster {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.DungeonMaster to javafx.fxml;
    exports com.mycompany.DungeonMaster;
}
