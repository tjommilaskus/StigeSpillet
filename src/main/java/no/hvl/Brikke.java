package no.hvl;
/**
 * Klasse for brikkene
 *
 * @author Antonio Gil Hammerstad
 */
public class Brikke {
    private int id;
    private int rutenr;

    /**
     * Konstruerer Brikke
     * setter startruten til 0
     * @param id id nummer
     *
     */
    public Brikke(int id) {
        this.id = id;
        this.rutenr = 0;
    }

    /**
     * getter brikkens rute
     *
     */
    public int getRute() {
        return rutenr;
    }

    /**
     * setter brikkens nye posisjon
     * @param rutenr ruteid
     */
    public void setPos(int rutenr) {
        this.rutenr = rutenr;
    }

    /**
     * brikken tar inn terning kast og regner ut hvor den skal
     * @return ruten den landet på
     */
    public int flyttTilRute(int flytt){
rutenr = rutenr + flytt;

        return rutenr ;

    }

    /**
     * sjekker om brikken har kommet i mål
     *(om spiller har vunnet)
     * @return true om brikken er på siste rute
     */
    public boolean sjekkmaal(){
        return rutenr >= 100;
    }
}