module org.openjfx.vintagecarfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.openjfx.vintagecarfx to javafx.fxml;
    opens org.openjfx.vintagecarfx.controller to javafx.fxml;
    opens org.openjfx.vintagecarfx.ersatzteilanbieter to javafx.base;
    opens org.openjfx.vintagecarfx.einlagerer to javafx.base;
    opens org.openjfx.vintagecarfx.lagerhalter to javafx.base;
    opens org.openjfx.vintagecarfx.enums to javafx.base;

    exports org.openjfx.vintagecarfx;
}