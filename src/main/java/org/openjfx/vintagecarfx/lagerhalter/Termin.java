package org.openjfx.vintagecarfx.lagerhalter;

import java.time.LocalDate;
import java.time.LocalTime;

public class Termin {
    private static int termin_ID;
    private boolean verfuegbar;
    private int fahrzeug_ID;
    private LocalTime uhrzeit;
    private LocalDate datum;

    public Termin(boolean verfuegbar, int fahrzeug_ID, LocalTime uhrzeit, LocalDate datum) {
        termin_ID = termin_ID + 1;
        this.verfuegbar = verfuegbar;
        this.fahrzeug_ID = fahrzeug_ID;
        this.uhrzeit = uhrzeit;
        this.datum = datum;
    }
    public int getTermin_ID() {
        return termin_ID;
    }
    public boolean isVerfuegbar() {
        return verfuegbar;
    }
    public void setVerfuegbar(boolean verfuegbar) {
        this.verfuegbar = verfuegbar;
    }
    public int getFahrzeug_ID() {
        return fahrzeug_ID;
    }
    public void setFahrzeug_ID(int fahrzeug_ID) {
        this.fahrzeug_ID = fahrzeug_ID;
    }
    public LocalTime getUhrzeit() {
        return uhrzeit;
    }
    public void setUhrzeit(LocalTime uhrzeit) {
        this.uhrzeit = uhrzeit;
    }
    public LocalDate getDatum() {
        return datum;
    }
    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

}
