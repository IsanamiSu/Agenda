module org.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.example.demo to javafx.fxml;
    exports modele;
    exports vue;
    exports controleur;
}