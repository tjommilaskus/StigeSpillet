package no.hvl;
/*
* Stige klasse som skal flytte spiller opp ruter
*  @Author Martin Palm
 */

public class Stige extends Rute {
    private int stigeTil;

    public Stige getStige() {
        return stigeTil;
    }

    public void setStige(int stigeTil) {
        this.stigeTil = stigeTil;
    }

    public Stige(int RuteNr, int stigeTil) {
        super(RuteNr);
        this.stigeTil = stigeTil;
    }


}
