package no.hvl;

import javax.swing.plaf.nimbus.AbstractRegionPainter;

/**
* Dette er Spiler Klassen
*  @Author Martin Palm
 */
public class Spiller {
    private String navn;
    private Terning terning;
    private Brikke brikke;


    /**
     * Konstruktør
     * @param navn
     * @param terning
     * @param brikke
     */
    public Spiller(String navn, Terning terning, Brikke brikke) {
        this.navn = navn;
        this.brikke = brikke;
        this.terning = terning;
    }

    /**
     *
     * @param navn
     */
    public Spiller(String navn) {
        this.navn = navn;
        brikke = new Brikke(1);
        terning  = new Terning();
    }

    /**
     * Getter
     * @return navn
     */
    public String getNavn() {
        return navn;
    }

    /**
     * Metode for å flytte brikke til en ny rute
     * @param flytt
     */
    public void slangeEllerStiggeFlytt(int flytt){

        brikke.flyttTilRute(flytt);
    }

    /**
     * Metode for å sjekke hvilke rute en brikke ligger på
     * @return brikke.getRute()
     */
    public int sjekkRutenr(){
       int ruten = brikke.getRute();

        if(ruten > 100){
    brikke.setPos(100 - (ruten-100));
}

        return brikke.getRute();
    }

    /**
     * Metode for å sjekke om man er i mål
     * @return brikke.sjekkmaal()
     */
    public boolean sjekkMaal(){
       return brikke.sjekkmaal();
    }

    /**
     * Metode for å trekke
     * @return nyRute;
     */
    public int spillTrekk(){

  int flytt = terning.trill();

int nyRute = brikke.flyttTilRute(flytt);


return nyRute;
    }





}
