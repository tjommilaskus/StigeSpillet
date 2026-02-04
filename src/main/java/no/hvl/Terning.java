package no.hvl;

/**
 * Terning klasse retuner, ved funksjonen tril random 1-6
 *  @Author Magnus Fomdenes
 */
public class Terning {
    private int verdi;

    int trill(){
        return (int) (Math.floor(Math.random() * 6) + 1);

    }
}
 