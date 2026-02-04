package no.hvl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class KlasseTesterStigespill {

    private Terning terning;
    @BeforeEach
    void setUp() {
        terning = new Terning();
    }

    @Test
    void terningTest() {
      for (int i = 0; i <= 100; i++){
          int verdi = terning.trill();
          assertTrue(verdi >= 1 && verdi <= 6,
                  "Terningverdi utenfor gyldig område: " + verdi);
      }

    }
}
