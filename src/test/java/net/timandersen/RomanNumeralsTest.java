package net.timandersen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void six() {
        assertRoman("VI", 6);
    }

    @Test
    public void arabicToRoman() {
        assertRoman("", 0);
        assertRoman("I", 1);
        assertRoman("II", 2);
        assertRoman("III", 3);
        assertRoman("IV", 4);
        assertRoman("V", 5);
        assertRoman("VI", 6);
        assertRoman("VII", 7);
        assertRoman("VIII", 8);
        assertRoman("IX", 9);
        assertRoman("X", 10);
        assertRoman("XL", 40);
        assertRoman("L", 50);
        assertRoman("XC", 90);
        assertRoman("C", 100);
        assertRoman("CD", 400);
        assertRoman("D", 500);
        assertRoman("CM", 900);
        assertRoman("M", 1000);
        assertRoman("MMXIII", 2013);
        assertRoman("MMXIV", 2014);
        assertRoman("MMXV", 2015);
    }

    @Test
    public void count() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println("RomanNumerals.arabicToRoman(" + i + ") = " + RomanNumerals.arabicToRoman(i));
        }
    }


    private void assertRoman(String roman, Integer arabic) {
        assertEquals(arabic.toString(), roman, RomanNumerals.arabicToRoman(arabic));
    }

}
