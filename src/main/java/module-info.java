module com.example.javafx6quiprend {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafx6quiprend to javafx.fxml;
    exports com.example.javafx6quiprend;
}