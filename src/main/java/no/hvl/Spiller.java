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



    public Spiller(String navn, Terning terning, Brikke brikke) {
        this.navn = navn;
        this.brikke = brikke;
        this.terning = terning;
    }


    public String getNavn() {
        return navn;
    }


    public void slangeEllerStiggeFlytt(int flytt){

        brikke.flyttTilRute(flytt);
    }

    public int sjekkRutenr(){

        return brikke.getRute();
    }

    public boolean sjekkMaal(){
       return brikke.sjekkmaal();
    }

    public int spillTrekk(){

  int flytt = terning.trill();

int nyRute = brikke.flyttTilRute(flytt);


return nyRute;
    }



}
