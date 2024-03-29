import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

public class TestCheckMailZwei {

    @Test
    public void testClassCheckMailZwei() {
        CheckMailTwo myMailChecker = new CheckMailTwo();
        assertTrue(myMailChecker instanceof CheckMailTwo);
    }

    @Test
    public void testClassCheckMailZweiNoInput() {
        CheckMailTwo myMailChecker = new CheckMailTwo();
        assertFalse(myMailChecker.isValidMailadress(null));
        String address = "";
        assertFalse(myMailChecker.isValidMailadress(address));
    }

    @Test
    public void testClassCheckMailZweiCorrectInput() {
        CheckMailTwo myMailChecker = new CheckMailTwo();
        assertTrue(myMailChecker.isValidMailadress("jonas@test.abc.de"));
    }

    @Test
    public void testClassCheckMailZweiCheckForAts() {
        CheckMailTwo myMailChecker = new CheckMailTwo();
        assertFalse(myMailChecker.isValidMailadress("jonastest.de"));
    }
    
    @Test
    public void testClassCheckMailZweiCheckForTectBeforeAt() {
        CheckMailTwo myMailChecker = new CheckMailTwo();
        assertFalse(myMailChecker.isValidMailadress("@jonastest.de"));
        assertTrue(myMailChecker.isValidMailadress("a@test.de"));
    }

    @Test
    public void testClassCheckMailZweiCheckForDot() {
        CheckMailTwo myMailChecker = new CheckMailTwo();
        assertFalse(myMailChecker.isValidMailadress("jonas@testde"));
    }

}
