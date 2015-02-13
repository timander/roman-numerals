package net.timandersen;

public class RomanNumerals {

    public static String arabicToRoman(int arabic) {
        return new ArabicToRomanConverter(arabic).convert();
    }
}