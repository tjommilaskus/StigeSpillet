package no.hvl;

import java.util.Scanner;

/**
 * Dette er Stigespill klassen og det er her spillet blir laget
 *  @Author Ebrima Jallow
 */
public class Stigespill {
private boolean ferdig;
private Brett brett;
private Spiller[] spillere;
Scanner scanner = new Scanner(System.in);


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

        for(Spiller spiller : spillere){

            boolean omTrekk = true;
            int omTrekkTeller = 0;

            while(true) {
                int plass1 = spiller.sjekkRutenr();
                System.out.println("Trykk enter for å rulle terning!");
                scanner.next();
                int nyRute = spiller.spillTrekk();
                scanner.close();
                int tpFlytt = brett.sjekkRute(nyRute);
                int plass2 = spiller.sjekkRutenr();
                spiller.slangeEllerStiggeFlytt(tpFlytt);

                if((plass2 - plass1) != 6){
                    omTrekk = false;
                }else{
                    omTrekkTeller++;
                }
                if(omTrekkTeller == 3){
                    spiller.slangeEllerStiggeFlytt(0);

                }

            }

if(spiller.sjekkMaal()){
    ferdig = !ferdig;
}



        }

    }

}
