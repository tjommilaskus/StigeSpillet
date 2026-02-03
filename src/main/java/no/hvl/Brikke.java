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
     * setter startruten til 0
     * @param nr id nummer
     *
     */
    public Brikke(int nr, Rute rute) {
        this.nr = nr;
        rute.setRute(0);
    }

    /**
     * get og set rutenr
     *
     */
    public int getRute() {
        return rute.getRuteNr();
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