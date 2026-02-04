package no.hvl;
/**
* Stige klasse som skal flytte spiller opp ruter
*  @Author Martin Palm
 */

public class Stige extends Rute {
    private int stigeTil;

    /**
     * Getter til stige
     * @return stigeTil
     */
    public int getStigeTil() {
        return stigeTil;
    }

    /**
     * Setter til stige
     * @param stigeTil
     */
    public void setStige(int stigeTil) {
        this.stigeTil = stigeTil;
    }

    /**
     * Stige konstruktør som tar inn RuteNr og sitgeTil
     * @param RuteNr
     * @param stigeTil
     */
    public Stige(int RuteNr, int stigeTil) {
        super(RuteNr);
        this.stigeTil = stigeTil;
    }


}
