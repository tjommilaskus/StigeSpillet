package no.hvl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Enhetstester for stigespillet.
 * <p>
 * Tester funksjonaliteten til klassene Terning, Rute, Stige, Spiller,
 * Brikke og Brett ved bruk av JUnit 5.
 * </p>
 *
 * @author Magnus Fondenes
 */
class KlasseTesterStigespill {

    private Terning terning;
    private Rute rute;
    private Stige stige;
    private Spiller spiller;
    private Brikke brikke;
    private Brett brett;

    /**
     * Setter opp testobjekter før hver test kjøres.
     */
    @BeforeEach
    void setUp() {
        terning = new Terning();
        rute = new Rute(15);
        stige = new Stige(rute.getRuteNr(), 5);
        brikke = new Brikke(1);
        spiller = new Spiller("Hans", terning, brikke);
        brett = new Brett();
    }

    /**
     * Tester at terningen alltid gir verdier mellom 1 og 6.
     */
    @Test
    void terningTest() {
        for (int i = 0; i <= 100; i++) {
            int verdi = terning.trill();
            assertTrue(verdi >= 1 && verdi <= 6,
                    "Terningverdi utenfor gyldig område: " + verdi);
        }
    }

    /**
     * Tester at ruten returnerer korrekt rutenummer.
     */
    @Test
    void RuteTest() {
        assertEquals(15, rute.getRuteNr());
    }

    /**
     * Tester at stigen leder til riktig rute.
     */
    @Test
    void stigeTest() {
        assertEquals(5, stige.getStigeTil());
    }

    /**
     * Tester at spilleren starter på rute 0 og flyttes korrekt
     * ved bruk av stige eller vanlig flytt.
     */
    @Test
    void spillerTest() {
        assertEquals(0, spiller.sjekkRutenr());
        spiller.slangeEllerStiggeFlytt(5);
        assertEquals(5, spiller.sjekkRutenr());
    }

    /**
     * Tester brikkens bevegelse, ruteoppdatering og mål-sjekk.
     */
    @Test
    void brikkeTest() {
        assertEquals(0, brikke.getRute());
        assertEquals(4, brikke.flyttTilRute(4));
        assertEquals(4, brikke.getRute());
        assertFalse(brikke.sjekkmaal());
        brikke.setPos(100);
        assertTrue(brikke.sjekkmaal());
    }

    /**
     * Tester at spilleren "spretter tilbake" hvis brikken går forbi rute 100.
     */
    @Test
    void spillerSjekkRuteBounceTest() {
        brikke.setPos(103);
        assertEquals(97, spiller.sjekkRutenr());
    }

    /**
     * Tester et spilltrekk med en fast terningverdi
     * for forutsigbar testoppførsel.
     */
    @Test
    void spillerTrekkMedFastTerning() {
        Spiller spillerMedFastTerning =
                new Spiller("Ida", new FastTerning(6), new Brikke(2));

        assertEquals(6, spillerMedFastTerning.spillTrekk());
        assertEquals(6, spillerMedFastTerning.sjekkRutenr());
    }

    /**
     * Tester brettets logikk for slanger og stiger.
     */
    @Test
    void brettSjekkRuteTest() {
        assertEquals(4, brett.sjekkRute(8));
        assertEquals(19, brett.sjekkRute(5));
        assertEquals(0, brett.sjekkRute(6));
    }

    /**
     * Test-implementasjon av Terning som alltid returnerer samme verdi.
     */
    static class FastTerning extends Terning {

        private final int verdi;

        /**
         * Oppretter en fast terning med gitt verdi.
         *
         * @param verdi verdien terningen alltid skal returnere
         */
        FastTerning(int verdi) {
            this.verdi = verdi;
        }

        /**
         * Returnerer en fast terningverdi.
         *
         * @return fast verdi
         */
        @Override
        int trill() {
            return verdi;
        }
    }
}
