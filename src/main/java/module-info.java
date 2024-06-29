module org.openjfx.vintagecarfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.openjfx.vintagecarfx to javafx.fxml;
    opens org.openjfx.vintagecarfx.controller to javafx.fxml;
    exports org.openjfx.vintagecarfx;
}