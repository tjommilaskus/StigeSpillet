package no.hvl;
/*
* Dette er Spiler Klassen
*  @Author Martin Palm
 */
public class Spiller {
    private String navn;

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public Spiller(String navn) {
        this.navn = navn;
    }
}
