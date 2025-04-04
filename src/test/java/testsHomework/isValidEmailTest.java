package testsHomework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class isValidEmailTest extends  TestCommon{
    /**
     * Корректные и некорректные email ("test@example.com", "bad@.com", "no-at-symbol")
     * null
     * Positive case:
     *      "test@example.com" - > true
     * Negative case:
     *      "bad@.com" - false
     *      "no-at-symbol" - false
     *      null -> false
     */

    @Test
    public void userCanCheckIfEmailIsValid(){
        assertTrue(testingCode.isValidEmail("test@example.com"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"bad@.com", "no-at-symbol"})
    public void userCanCheckIfEmailIsInvalid(String invalidEmail) {
        assertFalse(testingCode.isValidEmail(invalidEmail)|| testingCode.isValidEmail(null));
    }

}
