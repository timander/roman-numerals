package net.timandersen;

import java.util.*;

public enum RomanNumeral {

    I(1),
    V(5),
    X(10);

    private Integer arabicValue;

    RomanNumeral(Integer arabicValue) {
        this.arabicValue = arabicValue;
    }

    public Integer getArabicValue() {
        return arabicValue;
    }

    public static RomanNumeral lookupBy(int arabicValue) {
        for (RomanNumeral romanNumeral : values()) {
            if (romanNumeral.getArabicValue() == arabicValue) return romanNumeral;
        }
        return null;
    }


    public static List<RomanNumeral> descendingOrder() {
        List<RomanNumeral> romans = Arrays.asList(values());
        Collections.sort(romans, new Comparator<RomanNumeral>() {
            @Override
            public int compare(RomanNumeral o1, RomanNumeral o2) {
                return o2.getArabicValue().compareTo(o1.getArabicValue());
            }
        });
        return romans;
    }
}
