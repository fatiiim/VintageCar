package org.openjfx.vintagecarfx.einlagerer;

import org.openjfx.vintagecarfx.benutzer.Benutzer;
import org.openjfx.vintagecarfx.lagerhalter.Termin;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Einlagerer extends Benutzer {
    List<Fahrzeug> eingelagerteFahrzeuge;

    public Einlagerer(String vorname, String nachname, String geschlecht, String mailadresse,
                      String password, String handynummer, int plz, String stadt, String strasse, String hausnummer) {
        super(vorname, nachname, geschlecht, mailadresse, password, handynummer, plz, stadt, strasse, hausnummer);
        eingelagerteFahrzeuge = new ArrayList<>();
    }

    //public suchformularAnzeigen(){}

    //public stellplatzSuchen(){}
    public void anfrageStellen(int anfrage_ID, int lagerhalter_ID, int einlagerer_ID, LocalDate datum, LocalTime uhrzeit){

    }
    public List<Fahrzeug> getFahrzeuge(){
        return eingelagerteFahrzeuge;
    }
    public boolean checkFahrbereitschaft(String fahrzeugkennzeichen){
        for(Fahrzeug fahrzeug : eingelagerteFahrzeuge){
            if(fahrzeug.getFahrzeugkennzeichen().equals(fahrzeugkennzeichen)){
                return fahrzeug.checkFahrbereit();
            }
        }
        return false;
    }
    // diese methode vielleicht zum controller verschieben
    /*public List<Termin> zeigeTermine(String fahrzeugkennzeichen){
        for(Fahrzeug fahrzeug : eingelagerteFahrzeuge){
            if(fahrzeug.getFahrzeugkennzeichen().equals(fahrzeugkennzeichen)){
                return fahrzeug.getVerfuegbareTermine();
            }
        }
        return null;
    }*/

    //public showAngebot(String beschreibung, float preis){}
    //public delAngebot(){}
    public Fahrzeug findFzg(String fahrzeugkennzeichen){
        for(Fahrzeug fahrzeug : eingelagerteFahrzeuge){
            if(fahrzeug.getFahrzeugkennzeichen().equals(fahrzeugkennzeichen)){
                return fahrzeug;
            }
        }
        return null;
    }
    public void showFahrzeug(String fahrzeugkennzeichen){

    }

}
