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
    void testToString() {
        Fraction fraction = new Fraction(12, 3);
        assertNotNull(fraction);
        assertEquals("Fraction{numerator=12, denominator=3}", fraction.toString());
    }

}
