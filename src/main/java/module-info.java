//module com.grupp2.hardly {
//    requires javafx.controls;
//    requires javafx.fxml;
//
//    requires org.controlsfx.controls;
//
//    opens com.grupp2.hardly to javafx.fxml;
//    exports com.grupp2.hardly;
//}

open module com.grupp2.hardly {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires java.sql;
    requires org.hibernate.orm.core;
    requires java.sql.rowset;

    //opens com.grupp2.hardly to javafx.fxml;
    exports com.grupp2.hardly;
}
