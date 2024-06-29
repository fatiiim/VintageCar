package org.openjfx.vintagecarfx.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.openjfx.vintagecarfx.enums.Marke;
import org.openjfx.vintagecarfx.enums.Zustand;
import org.openjfx.vintagecarfx.ersatzteilanbieter.Ersatzteil;
import org.openjfx.vintagecarfx.ersatzteilanbieter.Ersatzteilanbieter;

import java.io.IOException;
import java.util.List;

public class ErsatzteilanbieterController {
    private final Ersatzteilanbieter ersatzteilanbieter;
    private final Stage stage;

    @FXML
    private Label welcomeText;

    public ErsatzteilanbieterController(Ersatzteilanbieter ersatzteilanbieter, Stage stage) {
        this.ersatzteilanbieter = ersatzteilanbieter;
        this.stage = stage;
    }

    public List<Ersatzteil> getErsatzteile(Marke marke) {
        return ersatzteilanbieter.getErsatzteile(marke);
    }

    public String getErsatzteilName(int ersatzteil_ID) {
        return ersatzteilanbieter.getErsatzteilName(ersatzteil_ID);
    }

    public float getErsatzteilPreis(int ersatzteil_ID) {
        return ersatzteilanbieter.getErsatzteilPreis(ersatzteil_ID);
    }

    public Marke getErsatzteilkompatibilitaet(int ersatzteil_ID) {
        return ersatzteilanbieter.getErsatzteilkompatibilitaet(ersatzteil_ID);
    }

    public float getErsatzteilGewicht(int ersatzteil_ID) {
        return ersatzteilanbieter.getErsatzteilGewicht(ersatzteil_ID);
    }

    public String getErsatzteilMaterial(int ersatzteil_ID) {
        return ersatzteilanbieter.getErsatzteilMaterial(ersatzteil_ID);
    }

    public int getErsatzteilGarantie(int ersatzteil_ID) {
        return ersatzteilanbieter.getErsatzteilGarantie(ersatzteil_ID);
    }

    public String getErsatzteilHersteller(int ersatzteil_ID) {
        return ersatzteilanbieter.getErsatzteilHersteller(ersatzteil_ID);
    }

    public Zustand getErsatzteilZustand(int ersatzteil_ID) {
        return ersatzteilanbieter.getErsatzteilZustand(ersatzteil_ID);
    }

    public int ersatzteilReservieren(int ersatzteil_ID, int anzahl) {
        return ersatzteilanbieter.ersatzteilReservieren(ersatzteil_ID, anzahl);
    }

    public void showFormular() {
        ersatzteilanbieter.showFormular();
    }

    //public String zeigInfos() {return ersatzteilanbieter.zeigInfos();}

    //public boolean isInfosVollstaendig() {return ersatzteilanbieter.isInfosVollstaendig();}

    public void showArtikel(Ersatzteil artikel) {
        ersatzteilanbieter.showArtikel();
    }

    public Ersatzteil findArtikel(int ersatzteil_ID) {
        return ersatzteilanbieter.findArtikel(ersatzteil_ID);
    }

    public void artikelloeschen(int ersatzteil_ID) {
        ersatzteilanbieter.artikelloeschen(ersatzteil_ID);
    }
}
