package org.openjfx.vintagecarfx.lagerhalter;

public class Zusatzservice {
    private int zusatzservice_ID;
    private String name;
    private float preis;
    private boolean verfuegbar;
    private String beschreibung;

    public Zusatzservice(String name, float preis, String beschreibung) {
        this.name = name;
        this.preis = preis;
        this.beschreibung = beschreibung;
        this.verfuegbar = true;
    }

    public int getZusatzservice_ID() {
        return zusatzservice_ID;
    }

    public void setZusatzservice_ID(int zusatzservice_ID) {
        this.zusatzservice_ID = zusatzservice_ID;
    }

    public String getName() {
        return name;
    }

    public float getPreis() {
        return preis;
    }

    public boolean isVerfuegbar() {
        return verfuegbar;
    }

    public void setVerfuegbar(boolean verfuegbar) {
        this.verfuegbar = verfuegbar;
    }
    public String getBeschreibung() {
        return beschreibung;
    }
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPreis(float preis) {
        this.preis = preis;
    }
}
