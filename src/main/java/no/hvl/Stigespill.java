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

            boolean omTrekk = true;
            int omTrekkTeller = 0;

            while(true) {
                int plass1 = spillere[i].sjekkRutenr();
                int nyRute = spillere[i].spillTrekk();
                int tpFlytt = brett.sjekkRute(nyRute);
                int plass2 = spillere[i].sjekkRutenr();
                spillere[i].slangeEllerStiggeFlytt(tpFlytt);

                if((plass2 - plass1) != 6){
                    omTrekk = false;
                }else{
                    omTrekkTeller++;
                }
                if(omTrekkTeller == 3){
                    spillere[i].slangeEllerStiggeFlytt(0);

                }

            }





        }

    }

}
