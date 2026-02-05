package no.hvl;

public class Brett {
    /**
     * Oppretter brett som en array
     */
    Rute[] ruter = new Rute[108];

    public Brett(){

        for(int i = 0; i < ruter.length -1; i ++  ){

            ruter[i] = new Rute(i);
        }

        /**
         * Setter slanger og brett til sine ruter satte pos
         */
        ruter[43] = new Slange(43, 2);
        ruter[36] = new Slange(36, 7);
        ruter[31] = new Slange(31, 14);
        ruter[89] = new Slange(89, 48);
        ruter[93] = new Slange(93, 76);
        ruter[98] = new Slange(98, 58);



        ruter[4] = new Stige(4, 37);
        ruter[12] = new Stige(12, 49);
        ruter[27] = new Stige(27, 55);
        ruter[42] = new Stige(42, 80);
        ruter[57] = new Stige(57, 85);
        ruter[67] = new Stige(67, 94);

    }


    /**
     * Sjekker om det er en instance av slange eller stige
     * på den satte ruten, vis ja
     * @return ruteNr
     */
    public int sjekkRute(int ruteNr){
        if(ruter[ruteNr] instanceof Slange){
            System.out.println("Slange \uD83D\uDC0D til rute: " + ( (Slange) ruter[ruteNr]).getSlangeTil() );
            return ((Slange) ruter[ruteNr]).getSlangeTil();
        }
        if(ruter[ruteNr] instanceof Stige){
            System.out.println("Stige \uD83E\uDE9C til rute: " + ( (Stige) ruter[ruteNr]).getStigeTil() );

            return ((Stige) ruter[ruteNr]).getStigeTil();
        }
        return 0;
    }


}