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

    public Spiller(String navn) {
        this.navn = navn;
        brikke = new Brikke(1);
        terning  = new Terning();
    }


    public String getNavn() {
        return navn;
    }

    public void slangeEllerStiggeFlytt(int flytt){

        brikke.flyttTilRute(flytt);
    }

    public int sjekkRutenr(){
       int ruten = brikke.getRute();

        if(ruten > 100){
    brikke.setPos(100 - (ruten-100));
}

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
