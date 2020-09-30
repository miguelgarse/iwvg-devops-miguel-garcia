package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchesTest {

    @Test
    void testFindFractionMultiplicationByUserFamilyName(){
        Searches searches = new Searches();
        Fraction searchResult = searches.findFractionMultiplicationByUserFamilyName("Torres");

        assertEquals(0, searchResult.getNumerator());
        assertEquals(0, searchResult.getDenominator());
    }

    @Test
    void testFindUserFamilyNameByImproperFraction(){
        Searches searches = new Searches();
        List<String> familyNameList = Arrays.asList("Fernandez", "Blanco", "López", "Torres");

        Stream<String> searchResult = searches.findUserFamilyNameByImproperFraction();

        assertTrue(familyNameList.containsAll(searchResult.collect(Collectors.toList())));
    }
}
