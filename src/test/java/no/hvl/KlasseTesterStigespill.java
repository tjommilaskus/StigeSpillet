package no.hvl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KlasseTesterStigespill {

    private Terning terning;
    private Rute rute;
    private Stige stige;
    private Spiller spiller;
    private Brikke brikke;

    @BeforeEach
    void setUp() {
        terning = new Terning();

        rute = new Rute(15);
        stige = new Stige(rute.getRuteNr(), 5);
        brikke = new Brikke(1);

        spiller = new Spiller("Hans",terning, brikke);


    }

    @Test
    void terningTest() {
      for (int i = 0; i <= 100; i++){
          int verdi = terning.trill();
          assertTrue(verdi >= 1 && verdi <= 6,
                  "Terningverdi utenfor gyldig område: " + verdi);
      }

    }

    @Test
    void RuteTest(){
        assertEquals(15, rute.getRuteNr());
    }

    @Test
    void stigeTest(){
        assertEquals(5, stige.getStige());
    }


    @Test
    void spillerTest(){
        assertEquals(0, spiller.sjekkRutenr());
        spiller.slangeEllerStiggeFlytt(5);
        assertEquals(5, spiller.sjekkRutenr());
    }


    @Test
    void Brikke(){
        brikke.setPos(90);
        assertEquals(90, brikke.getRute());
        assertFalse(brikke.sjekkmaal());
        brikke.flyttTilRute(10);
        assertEquals(100, brikke.getRute());
        assertTrue(brikke.sjekkmaal());
    }



}
