package net.timandersen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanCalculatorTest {


    @Test
    public void onePlusFive() {
        RomanCalculator calculator = new RomanCalculator();
        assertEquals("VI", calculator.enter("I").plus("V").display());
    }

    @Test
    public void fivePlusFive() {
        RomanCalculator calculator = new RomanCalculator();
        assertEquals("X", calculator.enter("V").plus("V").display());
    }

    @Test
    public void onePlusOne() {
        RomanCalculator calculator = new RomanCalculator();
        assertEquals("II", calculator.enter("I").plus("I").display());
    }

    @Test
    public void fivePlusTen() {
        RomanCalculator calculator = new RomanCalculator();
        assertEquals("XV", calculator.enter("V").plus("X").display());
    }

    @Test
    public void tenPlusTen() {
        RomanCalculator calculator = new RomanCalculator();
        assertEquals("XX", calculator.enter("X").plus("X").display());
    }

}
