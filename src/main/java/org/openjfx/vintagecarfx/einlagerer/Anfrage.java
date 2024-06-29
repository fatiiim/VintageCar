package org.openjfx.vintagecarfx.einlagerer;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Anfrage {
    private int anfrage_ID;
    private int lagerhalter_ID;
    private int einlagerer_ID;
    private LocalDate datum;
    private LocalTime uhrzeit;
    private static List<Anfrage> anfragen;

    public void anfrageStellen(int anfrage_ID, int lagerhalter_ID, int einlagerer_ID, LocalDate datum, LocalTime uhrzeit){
        Anfrage anfrage = new Anfrage();
        anfrage.anfrage_ID = anfrage_ID;
        anfrage.lagerhalter_ID = lagerhalter_ID;
        anfrage.einlagerer_ID = einlagerer_ID;
        anfrage.datum = datum;
        anfrage.uhrzeit = uhrzeit;
        anfragen.add(anfrage);
    }
    public int getAnfrage_ID(){
        return anfrage_ID;
    }
    public int getLagerhalter_ID(){
        return lagerhalter_ID;
    }
    public int getEinlagerer_ID(){
        return einlagerer_ID;
    }
    public LocalDate getDatum(){
        return datum;
    }
    public LocalTime getUhrzeit(){
        return uhrzeit;
    }
    public Anfrage findAnfrage(int anfrage_ID){
        for(Anfrage anfrage : anfragen){
            if(anfrage.getAnfrage_ID() == anfrage_ID){
                return anfrage;
            }
        }
        return null;
    }
    //public void removeAngebot(Angebot ang){}
}
