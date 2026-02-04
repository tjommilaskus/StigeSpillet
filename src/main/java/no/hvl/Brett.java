package no.hvl;

import no.hvl.Rute;
import no.hvl.Slange;
import no.hvl.Stige;

public class Brett {

    Rute[] ruter = new Rute[101];

    public Brett(){

        for(int i = 0; i < ruter.length -1; i ++  ){

            ruter[i] = new Rute(i);
        }

        ruter[8] = new Slange(8, 4);
        ruter[50] = new Slange(50, 25);
        ruter[90] = new Slange(90, 50);
        ruter[75] = new Slange(75, 25);


        ruter[5] = new Stige(5, 19);
        ruter[20] = new Stige(20, 90);
        ruter[7] = new Stige(7, 28);
        ruter[51] = new Stige(51, 85);

    }


    public int sjekkRute(int ruteNr){
        if(ruter[ruteNr] instanceof Slange){
            System.out.print("slange til" + ( (Slange) ruter[ruteNr]).getSlangeTil() );
            return ((Slange) ruter[ruteNr]).getSlangeTil();
        }
        if(ruter[ruteNr] instanceof Stige){
            System.out.print("stige til" + ( (Stige) ruter[ruteNr]).getStigeTil() );

            return ((Stige) ruter[ruteNr]).getStigeTil();
        }
        return 0;
    }


}