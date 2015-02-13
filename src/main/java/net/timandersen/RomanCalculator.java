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

        int remainder = 0;
        while (originalValue > 0) {
            System.out.println("originalValue = " + originalValue);
            System.out.println("remainder = " + remainder);
            if (originalValue >= 10) {
                divisibleValues.add(10);
                remainder = originalValue % 10;
                originalValue = originalValue - 10;
            } else if (originalValue >= 5) {
                divisibleValues.add(5);
                remainder = originalValue % 5;
                originalValue = originalValue - 5;
            } else {
                divisibleValues.add(1);
                originalValue--;
            }

        }
        String romanNumeral = "";
        for (Integer divisibleValue : divisibleValues) {
            romanNumeral += RomanNumeral.lookupBy(divisibleValue);
        }
        return romanNumeral;

    }
}