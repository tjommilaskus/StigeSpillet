package no.hvl;

import java.util.Scanner;

/**
 * Dette er Stigespill klassen og det er her spillet blir laget
 *  @Author Ebrima Jallow
 */
public class Stigespill {
private boolean rundeFerdig;
private boolean spillFerdig = false;
private Brett brett;
private Spiller[] spillere;
Scanner scanner = new Scanner(System.in);


    /**
     * Denne klassen lager spillere og tar navn;
     */
      public void lagSpillere(int antall, String[] navn){
          this.spillere = new Spiller[antall];


for(int i = 0; i < antall; i++) {

    spillere[i] = new Spiller(navn[i]);
}




      }

    public void spill(int antall, String[] navn){
brett = new Brett();

          lagSpillere(antall, navn);

        while (!spillFerdig){

            spillRunde(spillere);

        }

    }

    public void spillRunde(Spiller[] spillere){

        for(Spiller spiller : spillere){
rundeFerdig = !rundeFerdig;
            boolean omTrekk = true;
            int omTrekkTeller = 0;

            while(!rundeFerdig) {
                int plass1 = spiller.sjekkRutenr();
                System.out.println("Trykk enter for å rulle terning!");
                scanner.nextLine();

                int nyRute = spiller.spillTrekk();


                int plass2 = spiller.sjekkRutenr();


                int tpFlytt = brett.sjekkRute(nyRute);

                if(tpFlytt != 0){
                    spiller.slangeEllerStiggeFlytt(tpFlytt - plass2);

                }
                System.out.println(spiller.getNavn() +spiller.sjekkRutenr() );

                if((plass2 - plass1) != 6){
                   rundeFerdig = !rundeFerdig;
                }else{
                    omTrekkTeller++;
                }
                if(omTrekkTeller == 3){
                    spiller.slangeEllerStiggeFlytt(-plass2);
                rundeFerdig = !rundeFerdig;
                }

                if(spiller.sjekkMaal()){
                    System.out.println(spiller.getNavn() + "Vant");
                    spillFerdig = !spillFerdig;
                }

            }




        }

    }

}
