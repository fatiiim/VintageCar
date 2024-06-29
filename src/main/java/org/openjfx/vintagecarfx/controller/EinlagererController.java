package org.openjfx.vintagecarfx.controller;

import org.openjfx.vintagecarfx.einlagerer.Einlagerer;
import org.openjfx.vintagecarfx.einlagerer.Fahrzeug;
import org.openjfx.vintagecarfx.lagerhalter.Termin;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EinlagererController {
    private final Einlagerer einlagerer;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


    public EinlagererController(Einlagerer einlagerer) {
        this.einlagerer = einlagerer;
    }

    //public void suchformularAnzeigen() {einlagerer.suchformularAnzeigen();}

    //public void stellplatzSuchen() {einlagerer.stellplatzSuchen();}

    public void anfrageStellen(int anfrage_ID, int lagerhalter_ID, int einlagerer_ID, LocalDate datum, LocalTime uhrzeit) {
        einlagerer.anfrageStellen(anfrage_ID, lagerhalter_ID, einlagerer_ID, datum, uhrzeit);
    }

    public List<Fahrzeug> getFahrzeuge() {
        return einlagerer.getFahrzeuge();
    }

    public boolean checkFahrbereitschaft(String fahrzeugkennzeichen) {
        return einlagerer.checkFahrbereitschaft(fahrzeugkennzeichen);
    }

    //public List<Termin> zeigeTermine(String fahrzeugkennzeichen) {return einlagerer.zeigeTermine(fahrzeugkennzeichen);}

    //public void showAngebot(String beschreibung, float preis) {einlagerer.showAngebot(beschreibung, preis);}

    //public void delAngebot() {einlagerer.delAngebot();}

    public Fahrzeug findFzg(String fahrzeugkennzeichen) {
        return einlagerer.findFzg(fahrzeugkennzeichen);
    }

    public void showFahrzeug(String fahrzeugkennzeichen) {
        einlagerer.showFahrzeug(fahrzeugkennzeichen);
    }
}
