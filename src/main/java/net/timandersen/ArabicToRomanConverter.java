package net.timandersen;

public class ArabicToRomanConverter {
    private String roman;
    private int arabic;

    public ArabicToRomanConverter(int arabic) {
        this.arabic = arabic;
        this.roman = "";
    }

    public String convert() {
        for (RomanNumeral romanNumeral : RomanNumeral.values()) {
            while (arabic >= romanNumeral.intValue()) {
                roman += romanNumeral.name();
                arabic -= romanNumeral.intValue();
            }
        }
        return roman;
    }


}
