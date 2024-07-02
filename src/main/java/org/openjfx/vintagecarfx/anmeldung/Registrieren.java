package org.openjfx.vintagecarfx.anmeldung;

import org.openjfx.vintagecarfx.benutzer.Benutzer;
import org.openjfx.vintagecarfx.einlagerer.Einlagerer;
import org.openjfx.vintagecarfx.enums.Rollen;
import org.openjfx.vintagecarfx.lagerhalter.Lagerhalter;

import java.util.List;

public class Registrieren {
    //Liste der regsitrierten Benutzer in der Klasse Anmeldung

    List<Benutzer> registrierteBenutzer;

    public void registrierungsformularAhzeigen(){

    }
    public void benutzerDaten(Rollen rolle, String vorname, String nachname,
                              String geschlecht, String mailadresse, String password,
                              String handynummer, int plz, String stadt, String strasse, String hausnummer){
        if(rolle == Rollen.LAGERHALTER){
            Lagerhalter lagerhalter = new Lagerhalter(vorname, nachname, geschlecht, mailadresse, password, handynummer, plz, stadt, strasse, hausnummer);
        }
    }

}
