package org.openjfx.vintagecarfx.ersatzteilanbieter;

import org.openjfx.vintagecarfx.enums.Marke;
import org.openjfx.vintagecarfx.enums.Zustand;

public class Ersatzteil {
    private int ersatzteil_ID;
    private int anzahl;
    private final String name;
    private float preis;
    private final Marke kompatibilitaet;
    private final float gewicht;
    private final String material;
    private final Zustand zustand;
    private final int garantiedauer;
    private String hersteller;

    public Ersatzteil(String name, float preis, Zustand zustand, Marke kompatibilitaet, float gewicht, String material, int garantiedauer) {
        this.name = name;
        this.preis = preis;
        this.zustand = zustand;
        this.kompatibilitaet = kompatibilitaet;
        this.gewicht = gewicht;
        this.material = material;
        this.garantiedauer = garantiedauer;
    }
    public int getErsatzteil_ID() {
        return ersatzteil_ID;
    }
    public void setErsatzteil_ID(int ersatzteil_ID) {
        this.ersatzteil_ID = ersatzteil_ID;
    }
    public String getName() {
        return name;
    }
    public float getPreis() {
        return preis;
    }
    public void setPreis(float preis) {this.preis = preis;}
    public Marke getKompatibilitaet() {
        return kompatibilitaet;
    }
    public float getGewicht() {
        return gewicht;
    }
    public String getMaterial() {
        return material;
    }
    public int getGarantie() {
        return garantiedauer;
    }
    public String getHersteller() {
        return hersteller;
    }
    public Zustand getZustand() {
        return zustand;
    }
    public int getAnzahl() {return anzahl;}
    public void setAnzahl(int anzahl) {this.anzahl = anzahl;}


}
