package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchesTest {

    @Test
    void testFindFractionMultiplicationByUserFamilyName(){
        Searches searches = new Searches();
        Fraction searchResult = searches.findFractionMultiplicationByUserFamilyName("Torres");

        assertEquals(0, searchResult.getNumerator());
        assertEquals(0, searchResult.getDenominator());
    }
}
