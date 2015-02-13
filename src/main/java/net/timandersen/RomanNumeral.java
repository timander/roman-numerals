package net.timandersen;

public enum RomanNumeral {

    I(1),
    V(5),
    X(10);

    private int arabicValue;

    RomanNumeral(int arabicValue) {
        this.arabicValue = arabicValue;
    }

    public int getArabicValue() {
        return arabicValue;
    }

    public static RomanNumeral lookupBy(int arabicValue) {
        System.out.println("arabicValue = " + arabicValue);
        for (RomanNumeral romanNumeral : values()) {
            if (romanNumeral.getArabicValue() == arabicValue) {
                return romanNumeral;
            }
        }
        return null;
    }
}
