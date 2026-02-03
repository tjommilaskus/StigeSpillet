package no.hvl;
/**
 * Klasse for brikkene
 *
 * @author Antonio Gil Hammerstad
 */
public class Brikke {
    private int nr;
    private Rute rute;

    /**
     * Konstruerer Brikke
     * @param nr
     */
    public Brikke(int nr) {
        this.nr = nr;
        this.rute = 0;
    }

    /**
     * get og set rutenr
     *
     */
    public int getRute() {
        return rute;
    }

    public void setNr(Rute rute) {
        this.rute = rute;
    }

    /**
     * brikken sjekker hvilken rute den lander på
     * @return ruten den landet på
     */
    public int sjekkRute(){
        return getRute();

    }
}