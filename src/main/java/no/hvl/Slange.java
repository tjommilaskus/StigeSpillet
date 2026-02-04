package no.hvl;
/**
* @Author Martin Palm
* Slange klasse som skal flytte spiller ned ruter
 */

public class Slange extends Rute{
    private int slangeTil;

    /**
     * Getter til slange
     * @return slangeTil
     */
    public int getSlangeTil() {
        return slangeTil;
    }

    /**
     * Setter til slange
     * @param slangeTil
     */
    public void setSlange(int slangeTil) {
        this.slangeTil = slangeTil;
    }

    /**
     * Slange konstruktør som tar inn rutenummer og hvor slangen skal bevege seg til
     * @param RuteNr
     * @param slangeTil
     */
    public Slange(int RuteNr, int slangeTil) {
        super(RuteNr);
        this.slangeTil = slangeTil;
    }
}
