package org.openjfx.vintagecarfx.ersatzteilanbieter;

import org.openjfx.vintagecarfx.benutzer.Benutzer;
import org.openjfx.vintagecarfx.enums.Marke;
import org.openjfx.vintagecarfx.enums.Zustand;

import java.util.List;

public class Ersatzteilanbieter extends Benutzer {
    private String unternehmensname;
    private List<Marke> spezialisierungen;
    private String beschreibung;
    private final List<Ersatzteil> ersatzteile;

    public Ersatzteilanbieter(String vorname, String nachname, String geschlecht, String mailadresse, String password,
                              int handynummer, int plz, String stadt, String strasse, String hausnummer, String unternehmensname,
                              List<Marke> spezialisierungen, String beschreibung, List<Ersatzteil> ersatzteile) {
        super(vorname, nachname, geschlecht, mailadresse, password, handynummer, plz, stadt, strasse, hausnummer);
        this.unternehmensname = unternehmensname;
        this.spezialisierungen = spezialisierungen;
        this.beschreibung = beschreibung;
        this.ersatzteile = ersatzteile;
    }

    public List<Ersatzteil> getErsatzteile(Marke marke){
        return ersatzteile;
    }

    public String getErsatzteilName(int ersatzteil_ID){
        for(Ersatzteil ersatzteil : ersatzteile){
            if(ersatzteil.getErsatzteil_ID() == ersatzteil_ID){
                return ersatzteil.getName();
            }
        }
        return null;
    }
    public float getErsatzteilPreis(int ersatzteil_ID){
        for(Ersatzteil ersatzteil : ersatzteile){
            if(ersatzteil.getErsatzteil_ID() == ersatzteil_ID){
                return ersatzteil.getPreis();
            }
        }
        return 0;
    }
    public Marke getErsatzteilkompatibilitaet(int ersatzteil_ID){
        for(Ersatzteil ersatzteil : ersatzteile){
            if(ersatzteil.getErsatzteil_ID() == ersatzteil_ID){
                return ersatzteil.getKompatibilitaet();
            }
        }
        return null;
    }
    public float getErsatzteilGewicht(int ersatzteil_ID){
        for(Ersatzteil ersatzteil : ersatzteile){
            if(ersatzteil.getErsatzteil_ID() == ersatzteil_ID){
                return ersatzteil.getGewicht();
            }
        }
        return 0;
    }
    public String getErsatzteilMaterial(int ersatzteil_ID){
         for(Ersatzteil ersatzteil : ersatzteile) {
             if (ersatzteil.getErsatzteil_ID() == ersatzteil_ID) {
                 return ersatzteil.getMaterial();
             }
         }
            return null;
    }
    public int getErsatzteilGarantie(int ersatzteil_ID){
        for(Ersatzteil ersatzteil : ersatzteile){
            if(ersatzteil.getErsatzteil_ID() == ersatzteil_ID){
                return ersatzteil.getGarantie();
            }
        }
        return 0;
    }
    public String getErsatzteilHersteller(int ersatzteil_ID) {
        for (Ersatzteil ersatzteil : ersatzteile) {
            if (ersatzteil.getErsatzteil_ID() == ersatzteil_ID) {
                return ersatzteil.getHersteller();
            }
        }
        return null;
    }

    public Zustand getErsatzteilZustand(int ersatzteil_ID){
        for(Ersatzteil ersatzteil : ersatzteile){
            if(ersatzteil.getErsatzteil_ID() == ersatzteil_ID){
                return ersatzteil.getZustand();
            }
        }
        return null;
    }
    public int ersatzteilReservieren(int ersatzteil_ID, int anzahl){
        for(Ersatzteil ersatzteil : ersatzteile){
            if(ersatzteil.getErsatzteil_ID() == ersatzteil_ID){
                if(ersatzteil.getAnzahl() >= anzahl){
                    ersatzteil.setAnzahl(ersatzteil.getAnzahl() - anzahl);
                    return anzahl;
                }
            }
        }
        return 0;
    }
    public void showFormular(){};
    //public String zeigInfos(){};
    //public boolean isInfosVollstaendig(){};
    public void showArtikel(){};
    public Ersatzteil findArtikel(int ersatzteil_ID){
        for(Ersatzteil ersatzteil : ersatzteile){
            if(ersatzteil.getErsatzteil_ID() == ersatzteil_ID){
                return ersatzteil;
            }
        }
        return null;
    }
    public void artikelloeschen(int ersatzteil_ID){
        for(Ersatzteil ersatzteil : ersatzteile){
            if(ersatzteil.getErsatzteil_ID() == ersatzteil_ID){
                ersatzteile.remove(ersatzteil);
            }
        }
    }
    public void setBeschreibung(String beschreibung){
        this.beschreibung = beschreibung;
    }
    public void setUnternehmensname(String unternehmensname){
        this.unternehmensname = unternehmensname;
    }
    public void setSpezialisierungen(List<Marke> spezialisierungen){
        this.spezialisierungen = spezialisierungen;
    }
    public void addErsatzteil(Ersatzteil ersatzteil){
        ersatzteile.add(ersatzteil);
    }
}
