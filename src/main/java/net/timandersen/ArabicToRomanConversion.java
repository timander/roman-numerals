package net.timandersen;

public class ArabicToRomanConversion {
    public final StringBuilder processed = new StringBuilder();
    public int remainder;

    public ArabicToRomanConversion(int remainder) {
        this.remainder = remainder;
    }

    public String convert() {
        for (RomanNumeral romanNumeral : RomanNumeral.descendingOrder()) {
            process(romanNumeral);
        }
        return processed.toString();
    }

    private void process(RomanNumeral romanNumeral) {
        while (remainder >= romanNumeral.getValue()) {
            processed.append(romanNumeral.getSymbol());
            remainder -= romanNumeral.getValue();
        }
    }


}
