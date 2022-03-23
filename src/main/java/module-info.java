module com.grupp2.hardly {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.grupp2.hardly to javafx.fxml;
    exports com.grupp2.hardly;
}