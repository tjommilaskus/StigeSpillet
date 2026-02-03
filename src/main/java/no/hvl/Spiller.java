package no.hvl;
/*
* Dette er Spiler Klassen
*  @Author Martin Palm
 */
public class Spiller {
    private String navn;
    private Terning terning;
    private Brikke brikke;

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public Spiller(String navn) {
        this.navn = navn;
    }


    public void slangeEllerStiggeFlytt(int flytt){

        brikke.flyttTilRute(flytt);
    }

    public int sjekkRutenr(){

        return brikke.getRute();
    }

    public int spillTrekk(){

  int flytt = terning.trill();

int nyRute = brikke.flyttTilRute(flytt);


return nyRute;
    }



}
