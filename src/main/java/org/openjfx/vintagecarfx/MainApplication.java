package org.openjfx.vintagecarfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.openjfx.vintagecarfx.controller.StartController;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("/org/openjfx/vintagecarfx/start-view.fxml"));
        fxmlLoader.setController(new StartController(stage));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Start View");
        stage.setScene(scene);
        stage.show();
        stage.toFront();
    }

    public static void main(String[] args) {
        launch();
    }
}