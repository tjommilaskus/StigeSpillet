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
     * get og set rutenr
     *
     */
    public int getRute() {
        return rutenr;
    }

    public void setPos(int rutenr) {
        this.rutenr = rutenr;
    }

    /**
     * brikken tar inn terning kast og regner ut hvor den skal
     * @return ruten den landet på
     */
    public int flyttTilRute(int flytt){
        int nyRute = getRute() + flytt;
        setPos(nyRute);
        return nyRute;

    }
    public boolean sjekkmaal(){
        return getRute() == 100;
    }
}