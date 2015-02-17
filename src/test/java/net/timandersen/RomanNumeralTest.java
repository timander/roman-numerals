package net.timandersen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralTest {

    @Test
    public void testFactorsFor() {
        assertEquals(RomanNumeral.I, RomanNumeral.findHighestRomanFor(1));
        assertEquals(RomanNumeral.IV, RomanNumeral.findHighestRomanFor(4));
        assertEquals(RomanNumeral.V, RomanNumeral.findHighestRomanFor(5));
        assertEquals(RomanNumeral.V, RomanNumeral.findHighestRomanFor(6));
        assertEquals(RomanNumeral.V, RomanNumeral.findHighestRomanFor(7));
        assertEquals(RomanNumeral.V, RomanNumeral.findHighestRomanFor(8));
        assertEquals(RomanNumeral.IX, RomanNumeral.findHighestRomanFor(9));
        assertEquals(RomanNumeral.X, RomanNumeral.findHighestRomanFor(10));
        assertEquals(RomanNumeral.X, RomanNumeral.findHighestRomanFor(11));
        assertEquals(RomanNumeral.C, RomanNumeral.findHighestRomanFor(101));
    }

}
