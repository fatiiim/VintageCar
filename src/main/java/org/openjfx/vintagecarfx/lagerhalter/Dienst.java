package org.openjfx.vintagecarfx.lagerhalter;

public class Dienst {
    private String dienstname;
    private float preis;
    private String verfuegbareZeiten;
    private String beschreibung;
    private boolean forLKW; // statt Fahrzeugtyp

    public Dienst(String dienstname, float preis, boolean forLKW){
        this.dienstname = dienstname;
        this.preis = preis;
        this.forLKW = forLKW;
    }

    public String getDienstname() {
        return dienstname;
    }
    public void setDienstname(String dienstname) {
        this.dienstname = dienstname;
    }
    public float getPreis() {
        return preis;
    }
    public void setPreis(float preis) {
        this.preis = preis;
    }
    public String getBeschreibung() {
        return beschreibung;
    }
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
    public boolean isForLKW() {
        return forLKW;
    }
    public void setForLKW(boolean forLKW) {
        this.forLKW = forLKW;
    }
}
