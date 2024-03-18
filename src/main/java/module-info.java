module com.example.unittests {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.unittests to javafx.fxml;
    exports com.example.unittests;
}