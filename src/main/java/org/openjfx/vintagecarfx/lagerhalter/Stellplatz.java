package org.openjfx.vintagecarfx.lagerhalter;

public class Stellplatz {
    private int stellplatz_ID;
    private int lager_ID;
    private int nummer;
    private boolean verfuegbar;
    private boolean forLKW;
    private float preis;
    private String fahrzeugkennzeichen;
    //private servicezeiten;

    public Stellplatz(int stellplatz_ID, int lager_ID, int nummer, boolean forLKW){
        this.stellplatz_ID = stellplatz_ID;
        this.lager_ID = lager_ID;
        this.nummer = nummer;
        this.verfuegbar = true;
        this.forLKW = forLKW;
    }

    //public void stellplatzKapazitaetAnpassen(fahrzeugtyp, boolean verfuegbar){}

    public int getStellplatz(){
        return stellplatz_ID;
    }
    public int getLager_ID(){
        return lager_ID;
    }
    public boolean isVerfuegbar(){
        return verfuegbar;
    }
    public boolean isForLKW(){
        return forLKW;
    }
    public float getPreis(){
        return preis;
    }
    public String getFahrzeugkennzeichen(){
        return fahrzeugkennzeichen;
    }
    public void setFahrzeugkennzeichen(String fahrzeugkennzeichen){
        this.fahrzeugkennzeichen = fahrzeugkennzeichen;
    }
    public void setVerfuegbar(boolean verfuegbar){
        this.verfuegbar = verfuegbar;
    }
    public void setPreis(float preis){
        this.preis = preis;
    }
}
