package org.openjfx.vintagecarfx.controller;

import javafx.stage.Stage;
import org.openjfx.vintagecarfx.enums.Marke;
import org.openjfx.vintagecarfx.enums.Standort;
import org.openjfx.vintagecarfx.lagerhalter.Lager;
import org.openjfx.vintagecarfx.lagerhalter.Lagerhalter;

import java.time.LocalTime;
import java.util.List;

public class LagerhalterController {
    private final Lagerhalter lagerhalter;
    private final Stage stage;

    public LagerhalterController(Lagerhalter lagerhalter, Stage stage) {
        this.lagerhalter = lagerhalter;
        this.stage = stage;
    }

    public void lagerplaetzeAnzeigen() {
        lagerhalter.lagerplaetzeAnzeigen();
    }

    public void fahrzeugeinlagerungHinzufuegen(String name, Standort standort, int kapazitaet_PKW, int kapazitaet_LKW,
                                               LocalTime oeffnungszeit, LocalTime schliesszeit, String lagerbedingungen) {
        lagerhalter.fahrzeugeinlagerungHinzufuegen(name, standort, kapazitaet_PKW, kapazitaet_LKW, oeffnungszeit, schliesszeit, lagerbedingungen);
    }

    public void fahrzeugeinlagerungserviceHinzufuegen(String name, String beschreibung, float preis) {
        lagerhalter.fahrzeugeinlagerungserviceHinzufuegen(name, beschreibung, preis);
    }

    public void kapazitaetAnpassen(int kapazitaet) {
        lagerhalter.kapazitaetAnpassen(kapazitaet);
    }

    public void fahrzeugspezialisierungAnpassen(List<Marke> fahrzeugspezialisierungen) {
        lagerhalter.fahrzeugspezailisierungAuswahl(fahrzeugspezialisierungen);
    }

    public void zusatzserviceBuchen(int zusatzservice_ID, String fahrzeugkennzeichen) {
        lagerhalter.zusatzserviceBuchen(zusatzservice_ID, fahrzeugkennzeichen);
    }

    public Lager findLager(int lager_ID) {
        return lagerhalter.findLager(lager_ID);
    }
}
