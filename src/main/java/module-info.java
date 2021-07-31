module com.crumlabs.crummyconverter {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.crumlabs.crummyconverter to javafx.fxml;
    exports com.crumlabs.crummyconverter;
}