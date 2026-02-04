package no.hvl;

/**
 * Ruteklasse
 *
 * @author Antonio Gil Hammerstad
 */
public class Rute {
    private int RuteNr;


    /**
     * Konstruerer Ruter
     *
     * @param RuteNr rute id
     */
    public Rute(int RuteNr) {
        this.RuteNr = RuteNr;
    }

    /**
     * Getter og setter rutenummer
     *
     * @return int rutenummer
     */
    public int getRuteNr() {
        return RuteNr;
    }

}
