package org.openjfx.vintagecarfx.einlagerer;

import org.openjfx.vintagecarfx.enums.Marke;
import org.openjfx.vintagecarfx.lagerhalter.Termin;
import org.openjfx.vintagecarfx.lagerhalter.Zusatzservice;

import java.time.LocalDate;
import java.util.List;

public class Fahrzeug {
    private String fahrzeugkennzeichen;
    private final int einlagerer_ID;
    private int stellplatz_ID;
    private final Marke marke;
    private final String modell;
    private final LocalDate baujahr;
    private final String farbe;
    private int stellplatznummer;
    private boolean fahrbereit;
    private final int lager_ID;
    private final int lagerhalter_ID;
    private final List<Zusatzservice> zusatzservices;

    public Fahrzeug(String fahrzeugkennzeichen, int einlagerer_ID, int stellplatz_ID, Marke marke,
                    String modell, LocalDate baujahr, String farbe, int stellplatznummer, boolean fahrbereit,
                    int lager_ID, int lagerhalter_ID, List<Zusatzservice> zusatzservices) {
        this.fahrzeugkennzeichen = fahrzeugkennzeichen;
        this.einlagerer_ID = einlagerer_ID;
        this.stellplatz_ID = stellplatz_ID;
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.farbe = farbe;
        this.stellplatznummer = stellplatznummer;
        this.fahrbereit = fahrbereit;
        this.lager_ID = lager_ID;
        this.lagerhalter_ID = lagerhalter_ID;
        this.zusatzservices = zusatzservices;
    }
    //diese methode vielleicht zum controller verschieben
    public boolean checkFahrbereit(){
        return fahrbereit;
    }
    public String getStatus(){
        return fahrbereit ? "Fahrbereit" : "Nicht Fahrbereit";
    }
    //diese methode soll vielleicht woanders hin
    //public List<Termin> getVerfuegbareTermine(){}
    public void zusatzserviceBuchen(int zusatzservice_ID){

    }
    public String getFahrzeugkennzeichen(){
        return fahrzeugkennzeichen;
    }
    public Marke getMarke(){
        return marke;
    }
    public String getModell(){
        return modell;
    }
    public String getName(){
        return marke + " " + modell;
    }
    public LocalDate getBaujahr(){
        return baujahr;
    }
    public String getFarbe(){
        return farbe;
    }
    public int getStellplatznummer(){
        return stellplatznummer;
    }
    public int getLager_ID(){
        return lager_ID;
    }
    public int getLagerhalter_ID(){
        return lagerhalter_ID;
    }
    public int getEinlagerer_ID(){
        return einlagerer_ID;
    }
    public List<Zusatzservice> getZusatzservices(){
        return zusatzservices;
    }
    public void setFahrzeugkennzeichen(String fahrzeugkennzeichen){
        this.fahrzeugkennzeichen = fahrzeugkennzeichen;
    }
    public void setStellplatz_ID(int stellplatz_ID){
        this.stellplatz_ID = stellplatz_ID;
    }
    public void setStellplatznummer(int stellplatznummer){
        this.stellplatznummer = stellplatznummer;
    }
    public void setFahrbereit(boolean fahrbereit){
        this.fahrbereit = fahrbereit;
    }
    public void removeZusatzservice(Zusatzservice zusatzservice){
        zusatzservices.removeIf(zusatzservice1 -> zusatzservice1.getZusatzservice_ID() == zusatzservice.getZusatzservice_ID());
    }


}
