package net.timandersen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {


    @Test
    public void arabicToRoman() {
        assertRoman(1, "i");
    }

    private void assertRoman(int arabic, String roman) {
        assertEquals(Integer.valueOf(arabic).toString(), roman, RomanNumerals.arabicToRoman(arabic));
    }


}
