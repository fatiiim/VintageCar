package org.openjfx.vintagecarfx.lagerhalter;

import org.openjfx.vintagecarfx.benutzer.Benutzer;
import org.openjfx.vintagecarfx.enums.Marke;
import org.openjfx.vintagecarfx.enums.Standort;

import java.time.LocalTime;
import java.util.List;

public class Lagerhalter extends Benutzer {

    private List<Lager> lager;
    private List<Zusatzservice> zusatzservices;
    private List<Marke> fahrzeugspezialisierungen;
    private boolean fahrzeugspezialisierung;
    private int kapazitaet;

    public Lagerhalter(String vorname, String nachname, String geschlecht, String mailadresse,
                       String password, int handynummer, int plz, String stadt, String strasse, String hausnummer) {
        super(vorname, nachname, geschlecht, mailadresse, password, handynummer, plz, stadt, strasse, hausnummer);
    }

    public void lagerplaetzeAnzeigen(){

    }
    public void ausfuellformularLpAnzeigen(){

    }
    public void fahrzeugeinlagerungHinzufuegen(String name, Standort standort, int kapazitaet_PKW, int kapazitaet_LKW,
                                               LocalTime oeffnungszeit, LocalTime schliesszeit, String lagerbedingungen){
        Lager lager = new Lager(name, standort, oeffnungszeit, schliesszeit, lagerbedingungen, kapazitaet_PKW, kapazitaet_LKW);
    }
    public void ausfuellformularFesAnzeigen(){
    }
    public void fahrzeugeinlagerungserviceHinzufuegen(String name, String beschreibung, float preis){
        Zusatzservice zusatzservice = new Zusatzservice(name, preis, beschreibung);
    }
    public void kapazitaetAnpassen(int kapazitaet){
        this.kapazitaet = kapazitaet;
    }
    public void fahrzeugspezialisierungAnpassen(){}
    public void fahrzeugspezailisierungAuswahl(List<Marke> fahrzeugspezialisierungen){
        this.fahrzeugspezialisierungen = fahrzeugspezialisierungen;
    }
    public List<Zusatzservice> getZusatzservices(){
        return zusatzservices;
    }
    public String getZusatzservicesName(int zusatzservice_ID){
        for(Zusatzservice zusatzservice : zusatzservices){
            if(zusatzservice.getZusatzservice_ID() == zusatzservice_ID){
                return zusatzservice.getName();
            }
        }
        return null;
    }
    public String getZusatzservicesBeschreibung(int zusatzservice_ID){
        for (Zusatzservice zusatzservice : zusatzservices){
            if(zusatzservice.getZusatzservice_ID() == zusatzservice_ID){
                return zusatzservice.getBeschreibung();
            }
        }
        return null;
    }
    public float getZusatzservicesPreis(int zusatzservice_ID){
        for (Zusatzservice zusatzservice : zusatzservices){
            if(zusatzservice.getZusatzservice_ID() == zusatzservice_ID){
                return zusatzservice.getPreis();
            }
        }
        return 0;
    }
    public Lager findLager(int lager_ID){
        return lager.get(lager_ID);
    }
    public void zusatzserviceBuchen(int zusatzservice_ID, String fahrzeugkennzeichen){

    }

}
