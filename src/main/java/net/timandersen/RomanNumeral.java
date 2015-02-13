package net.timandersen;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public enum RomanNumeral {

    M(1000),
    CM(900),
    D(500),
    CD(400),
    C(100),
    XC(90),
    L(50),
    XL(40),
    X(10),
    IX(9),
    V(5),
    IV(4),
    I(1);

    private Integer value;

    RomanNumeral(Integer value) {
        this.value = value;
    }

    public String getSymbol() {
        return name();
    }

    public Integer getValue() {
        return value;
    }

    public static RomanNumeral lookupBy(int arabicValue) {
        for (RomanNumeral romanNumeral : values()) {
            if (romanNumeral.getValue() == arabicValue) return romanNumeral;
        }
        return null;
    }


    public static List<RomanNumeral> descendingOrder() {
        List<RomanNumeral> romans = Arrays.asList(values());
        Collections.sort(romans, new Comparator<RomanNumeral>() {
            @Override
            public int compare(RomanNumeral o1, RomanNumeral o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        return romans;
    }
}
