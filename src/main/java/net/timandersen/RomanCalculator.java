package net.timandersen;

import java.util.ArrayList;
import java.util.List;

public class RomanCalculator {

    private int arabicValue;


    public RomanCalculator enter(String roman) {
        arabicValue = convertToArabic(roman);
        return this;
    }

    private int convertToArabic(String roman) {
        return RomanNumeral.valueOf(roman).getArabicValue();
    }

    public RomanCalculator plus(String roman) {
        arabicValue += convertToArabic(roman);
        return this;
    }

    public String display() {
        return convertToRoman(arabicValue);
    }

    private String convertToRoman(int arabicValue) {
        int originalValue = arabicValue;
        List<Integer> divisibleValues = new ArrayList<Integer>();
        for (RomanNumeral romanNumeral : RomanNumeral.descendingOrder()) {
            originalValue = operate(romanNumeral.getArabicValue(), originalValue, divisibleValues);
            if (originalValue >= romanNumeral.getArabicValue()) {
                originalValue = operate(romanNumeral.getArabicValue(), originalValue, divisibleValues);
            } else if (originalValue >= romanNumeral.getArabicValue()) {
                originalValue = operate(romanNumeral.getArabicValue(), originalValue, divisibleValues);
            } else if (originalValue >= romanNumeral.getArabicValue()) {
                originalValue = operate(romanNumeral.getArabicValue(), originalValue, divisibleValues);
            }
        }
        String romanNumeral = "";
        for (Integer divisibleValue : divisibleValues) {
            romanNumeral += RomanNumeral.lookupBy(divisibleValue);
        }
        return romanNumeral;

    }

    private int operate(int numeral, int originalValue, List<Integer> divisibleValues) {
        int returnValue = 0;
        if (originalValue >= numeral) {
            divisibleValues.add(numeral);
            originalValue -= numeral;
            returnValue = originalValue;
        } else {
            returnValue = originalValue;
        }
        return returnValue;
    }
}