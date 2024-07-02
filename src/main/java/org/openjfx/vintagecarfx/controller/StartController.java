package org.openjfx.vintagecarfx.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.openjfx.vintagecarfx.einlagerer.Einlagerer;
import org.openjfx.vintagecarfx.enums.Marke;
import org.openjfx.vintagecarfx.enums.Zustand;
import org.openjfx.vintagecarfx.ersatzteilanbieter.Ersatzteil;
import org.openjfx.vintagecarfx.ersatzteilanbieter.Ersatzteilanbieter;
import org.openjfx.vintagecarfx.lagerhalter.Lagerhalter;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class StartController {
    private final Stage stage;


    public StartController(Stage stage) {
        this.stage = stage;
    }

    @FXML
    public void showEinlagererView() throws IOException {
        Einlagerer einlagerer = new Einlagerer("Ward", "Jasim", "männlich", "blabla.com",
                "12345", "01760000", 34122, "Kassel", "Hauptstraße", "1");

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/openjfx/vintagecarfx/einlagerer-view.fxml"));
        EinlagererController eController = new EinlagererController(einlagerer, stage);
        fxmlLoader.setController(eController);
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setScene(scene);
    }

    @FXML
    public void showLagerhalterView() throws IOException {
        Lagerhalter lagerhalter = new Lagerhalter("Max", "Mustermann", "männlich", "fjdf.com",
                "12345", "01760000", 34122, "Kassel", "Hauptstraße", "1");

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/openjfx/vintagecarfx/lagerhalter-view.fxml"));
        LagerhalterController lController = new LagerhalterController(lagerhalter, stage);
        fxmlLoader.setController(lController);
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setScene(scene);
    }

    @FXML
    public void showErsatzteilanbieterView() throws IOException {
        Ersatzteilanbieter ersatzteilanbieter = new Ersatzteilanbieter("man", "muster",
                "männlich", "musterman@hotmail.de", "12345", "156000",
                35234, "Berlin", "hauptstraße", "1", "beste Firma", Arrays.asList(Marke.AUDI, Marke.BMW),
                "noch keine Beschreibung", List.of(new Ersatzteil(
                        "Reifen", 100, Zustand.AKZEPTABEL, Marke.AUDI, 10, "Gummi", "2 Jahre")));

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/openjfx/vintagecarfx/ersatzteilanbieter-view.fxml"));
        ErsatzteilanbieterController Econtroller = new ErsatzteilanbieterController(ersatzteilanbieter, stage);
        fxmlLoader.setController(Econtroller);
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setScene(scene);
    }

}
