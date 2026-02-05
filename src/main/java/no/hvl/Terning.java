package no.hvl;

/**
 * Terning
 *  @Author Magnus Fomdenes
 */
public class Terning {
    private int verdi;

    /**
     * Terning metode som retuner random int fra 1-6 og Printer ut resultatet av kastet
     */
    int trill(){
        int i = (int) (Math.floor(Math.random() * 6) + 1);
        System.out.println("Du rullet\uD83C\uDFB2: " + i);
        return i;

    }


}
 