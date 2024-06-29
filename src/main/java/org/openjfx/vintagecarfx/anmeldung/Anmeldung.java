package org.openjfx.vintagecarfx.anmeldung;

public class Anmeldung {
    String mailadresse;
    String passwort;


    public Anmeldung(String mailadresse, String passwort){
        this.mailadresse = mailadresse;
        this.passwort = passwort;
    }

    //eventuell durch den Konsturktor ersetzen
    public void anmeldeformularAnzeigen(){}
    public void anmeldeformularAusfüllen(String mailadresse, String passwort){
    }

}
