package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    @Test
    void testEmptyConstructor() {
        Fraction fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
        assertEquals(1, fraction.decimal());
    }

    @Test
    void testArgsConstructor() {
        Fraction fraction = new Fraction(2, 3);
        assertEquals(2, fraction.getNumerator());
        assertEquals(3, fraction.getDenominator());
    }

    @Test
    void testDecimal(){
        Fraction fraction = new Fraction(12, 3);
        assertNotNull(fraction);
        assertEquals(4, fraction.decimal());
    }

    @Test
    void testIsProper() {
        Fraction fraction = new Fraction(2, 3);
        assertTrue(fraction.isProper());
    }

    @Test
    void testIsImproper() {
        Fraction fraction = new Fraction(3, 2);
        assertTrue(fraction.isImproper());
    }

    @Test
    void testIsEquivalent() {
        Fraction fraction = new Fraction(2, 3);
        assertTrue(fraction.isEquivalent(new Fraction(4, 6)));
    }

    @Test
    void testAdd() {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(3, 2);
        Fraction fractionResult = fraction1.add(fraction2);
        assertEquals(fractionResult.getNumerator(), 13);
        assertEquals(fractionResult.getDenominator(), 6);
    }

    @Test
    void testMultiply() {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(3, 2);
        Fraction fractionResult = fraction1.multiply(fraction2);
        assertEquals(fractionResult.getNumerator(), 6);
        assertEquals(fractionResult.getDenominator(), 6);
    }

    @Test
    void testDivide() {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(3, 2);
        Fraction fractionResult = fraction1.divide(fraction2);
        assertEquals(fractionResult.getNumerator(), 4);
        assertEquals(fractionResult.getDenominator(), 9);
    }

    @Test
    void testToString() {
        Fraction fraction = new Fraction(12, 3);
        assertNotNull(fraction);
        assertEquals("Fraction{numerator=12, denominator=3}", fraction.toString());
    }

}
