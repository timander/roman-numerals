package net.timandersen;

public class RomanNumerals {

    public static String arabicToRoman(int arabic) {
        if (arabic == 0) return "";
        RomanNumeral romanNumeral = RomanNumeral.findHighestRomanFor(arabic);
        return romanNumeral.name() + arabicToRoman(arabic - romanNumeral.intValue());
    }

}