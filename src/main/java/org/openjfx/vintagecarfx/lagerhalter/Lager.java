package org.openjfx.vintagecarfx.lagerhalter;

import org.openjfx.vintagecarfx.einlagerer.Fahrzeug;
import org.openjfx.vintagecarfx.enums.Standort;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Lager {
    private static int lager_ID;
    private final String name;
    private final Standort standort;
    private LocalTime oeffnet;
    private LocalTime schliesst;
    private String lagerbedingungen;
    private List <Stellplatz> stellplaetze;
    private List <Termin> termine;
    private int kapazitaet_PKW;
    private int kapazitaet_LKW;
    private List<Fahrzeug> eingelagerteFahrzeuge;

    public Lager(String name, Standort standort, LocalTime oeffnet, LocalTime schliesst, String lagerbedingungen, int kapazitaet_PKW, int kapazitaet_LKW) {
        lager_ID = lager_ID + 1;
        this.name = name;
        this.standort = standort;
        this.oeffnet = oeffnet;
        this.schliesst = schliesst;
        this.lagerbedingungen = lagerbedingungen;
        this.kapazitaet_PKW = kapazitaet_PKW;
        this.kapazitaet_LKW = kapazitaet_LKW;
        setStellplaetze();
    }

    public void lagerKapazitaetenAnpassen(int kapazitaet_PKW, int kapazitaet_LKW){

    }

    public void bucheTermin(int termin_ID){
        termine.get(termin_ID).setVerfuegbar(false);
    }
    public Stellplatz findStellplatz(int stellplatz_ID){
        return stellplaetze.get(stellplatz_ID);
    }
    public int getLager_ID(){
        return lager_ID;
    }
    public String getName(){
        return name;
    }
    public Standort getStandort(){
        return standort;
    }
    public LocalTime getOeffnet(){
        return oeffnet;
    }
    public void setOeffnet(LocalTime oeffnet){
        this.oeffnet = oeffnet;
    }
    public LocalTime getSchliesst(){
        return schliesst;
    }
    public void setSchliesst(LocalTime schliesst){
        this.schliesst = schliesst;
    }
    public String getLagerbedingungen(){
        return lagerbedingungen;
    }
    public void setLagerbedingungen(String lagerbedingungen){
        this.lagerbedingungen = lagerbedingungen;
    }
    public void setStellplaetze() {
        for(int i = 0; i <= kapazitaet_PKW; i++){
            assert stellplaetze != null;
            stellplaetze.add(new Stellplatz(i + lager_ID, lager_ID, i, false)); // false für ist LKW
        }
        for(int i = kapazitaet_PKW + 1; i <= kapazitaet_PKW + kapazitaet_LKW; i++){
            assert stellplaetze != null;
            stellplaetze.add(new Stellplatz(i + lager_ID, lager_ID, i, true)); //true für ist LKW statt fahrzeugtyp
        }
    }
    public List<Stellplatz> getStellplaetze() {
        return stellplaetze;
    }
    public void addTermin(int fahrzeug_ID, LocalTime uhrzeit, LocalDate datum){
        termine.add(new Termin(false, fahrzeug_ID, uhrzeit, datum));
    }
    public Termin getTermin(int termin_ID) {
        return termine.get(termin_ID);
    }
    public Termin getFahrzeugTermin(int fahrzeug_ID) {
        return termine.get(fahrzeug_ID);
    }
    public List <Termin> getTermineAm(LocalDate datum){
        List <Termin> tmpTermine = new ArrayList<>();
        for(Termin termin : termine){
            if(termin.getDatum().equals(datum)){
                tmpTermine.add(termin);
            }
        }
        return tmpTermine;
    }
    public List <Termin> getAlleTermine(LocalDate datum){
        return termine;
    }
    public void setTermine(List<Termin> termine){
        this.termine = termine;
    }
    public void addFahrzeug(Fahrzeug fahrzeug){
        eingelagerteFahrzeuge.add(fahrzeug);
    }
    public void removeFahrzeug(Fahrzeug fahrzeug){
        eingelagerteFahrzeuge.remove(fahrzeug);
    }
    public List<Fahrzeug> getEingelagerteFahrzeuge(){
        return eingelagerteFahrzeuge;
    }
    public void setEingelagerteFahrzeuge(List<Fahrzeug> eingelagerteFahrzeuge){
        this.eingelagerteFahrzeuge = eingelagerteFahrzeuge;
    }


}
