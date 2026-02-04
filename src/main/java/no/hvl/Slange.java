package no.hvl;
/**
* @Author Martin Palm
* Slange klasse som skal flytte spiller ned ruter
 */

public class Slange extends Rute{
    private int slangeTil;

    public int getSlangeTil() {
        return slangeTil;
    }
    public void setSlange(int slangeTil) {
        this.slangeTil = slangeTil;
    }
    public Slange(int RuteNr, int slangeTil) {
        super(RuteNr);
        this.slangeTil = slangeTil;
    }
}
