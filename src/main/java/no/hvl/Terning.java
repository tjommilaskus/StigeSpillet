package no.hvl;

/**
 * Terning klasse retuner, ved funksjonen tril random 1-6
 *  @Author Magnus Fomdenes
 */
public class Terning {
    private int verdi;

    int trill(){
        int i = (int) (Math.floor(Math.random() * 6) + 1);
        System.out.println("Du rullet\uD83C\uDFB2: " + i);
        return i;

    }


}
 