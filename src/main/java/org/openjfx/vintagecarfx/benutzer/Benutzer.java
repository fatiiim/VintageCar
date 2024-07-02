package org.openjfx.vintagecarfx.benutzer;

public abstract class Benutzer {
    // benutzer_ID soll in der Datenbank automatisch generiert
    private String vorname;
    private String nachname;
    private String geschlecht;
    private String mailadresse;
    private String passwort;
    private String handynummer;
    private int plz;
    private String stadt;
    private String strasse;
    private String hausnummer;

    public Benutzer(String vorname, String nachname, String geschlecht,
                    String mailadresse, String passwort, String handynummer,
                    int plz, String stadt, String strasse, String hausnummer){
        this.vorname = vorname;
        this.nachname = nachname;
        this.geschlecht = geschlecht;
        this.mailadresse = mailadresse;
        this.passwort = passwort;
        this.handynummer = handynummer;
        this.plz = plz;
        this.stadt = stadt;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
    }

    public String getVorname(){
        return vorname;
    }
    public String getNachname(){
        return nachname;
    }
    public String getGeschlecht(){
        return geschlecht;
    }
    public String getMailadresse(){
        return mailadresse;
    }
    public String getPasswort(){
        return passwort;
    }
    public String getHandynummer(){
        return handynummer;
    }
    public int getPlz(){
        return plz;
    }
    public String getStadt(){
        return stadt;
    }
    public String getStrasse(){
        return strasse;
    }
    public String getHausnummer(){
        return hausnummer;
    }
    public void setVorname(String vorname){
        this.vorname = vorname;
    }
    public void setNachname(String nachname){
        this.nachname = nachname;
    }
    public void setGeschlecht(String geschlecht){
        this.geschlecht = geschlecht;
    }
    public void setMailadresse(String mailadresse){
        this.mailadresse = mailadresse;
    }
    public void setPasswort(String passwort){
        this.passwort = passwort;
    }
    public void setHandynummer(String handynummer){
        this.handynummer = handynummer;
    }
    public void setPlz(int plz){
        this.plz = plz;
    }
    public void setStadt(String stadt){
        this.stadt = stadt;
    }
    public void setStrasse(String strasse){
        this.strasse = strasse;
    }
    public void setHausnummer(String hausnummer){
        this.hausnummer = hausnummer;
    }
}
