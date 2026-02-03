package no.hvl;

import java.util.Scanner;

/*
 * Dette er Stigespill klassen og det er her spillet blir laget
 *  @Author Ebrima Jallow
 */
public class Stigespill {
boolean ferdig;
Brett brett;
Spiller[] spillere;


    /**
     * Denne klassen lager spillere og tar navn;
     */
      public void lagSpillere(int antall, String[] navn){
          this.spillere = new Spiller[antall];


for(int i = 0; i < antall; ) {

    spillere[i].setNavn(navn[i]);
}


      }

    public void spill(int antall, String[] navn){


          lagSpillere(antall, navn);

        while (!ferdig){

            spillRunde(spillere);

        }

    }

    public void spillRunde(Spiller[] spillere){

        for(int i = 0; i < spillere.length; i++){

            spillere[i].spillTrekk();
            brett

        }

    }

}
