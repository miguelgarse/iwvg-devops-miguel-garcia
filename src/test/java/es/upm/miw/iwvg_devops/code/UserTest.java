package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testConstructorEmptyUser() {
        User user = new User();
        assertNotNull(user.getFractions());
        assertTrue(user.getFractions().isEmpty());
    }

    @Test
    void testConstructorUser() {
        User user = new User("1234", "Miguel", "Garcia Serrano", new ArrayList<>());

        assertNotNull(user.getId());
        assertNotNull(user.getName());
        assertNotNull(user.getFamilyName());
        assertNotNull(user.getFractions());
        assertEquals("1234", user.getId());
        assertEquals("Miguel", user.getName());
        assertEquals("Garcia Serrano", user.getFamilyName());

        assertTrue(user.getFractions().isEmpty());
    }

    @Test
    void testFullNameUser() {
        User user = new User("1234", "Miguel", "Garcia Serrano", new ArrayList<>());
        String fullName = user.fullName();

        assertNotNull(fullname);
        assertEquals("Miguel Garcia Serrano", fullname);
    }

    @Test
    void testInitialsUser() {
        User user = new User("1234", "Miguel", "Garcia Serrano", new ArrayList<>());
        String initials = user.initials();

        assertNotNull(initials);
        assertEquals("M.", initials);
    }

    @Test
    void testToStringUser() {
        User user = new User("1234", "Miguel", "Garcia Serrano", new ArrayList<>());
        String objectToString = user.toString();

        assertNotNull(objectToString);
        assertEquals("User{id='1234', name='Miguel', familyName='Garcia Serrano', fractions=[]}", objectToString);
    }

}
