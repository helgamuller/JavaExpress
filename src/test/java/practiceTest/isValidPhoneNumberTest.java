package practiceTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import testsHomework.TestCommon;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class isValidPhoneNumberTest extends TestCommon {
    /**
     * Корректные номера ("+1 1234567890")
     * Некорректные номера ("12345", "invalid")
     *
     * Positive case:
     *      +1 1234567890 - > true
     * Negative cases:
     *       "12345" -> false
     *       "invalid" - false
     *
     */

    @Test
    public void userCanCheckIfPhoneNUmberIsValid(){
        boolean actualResult = (testingCode.isValidPhoneNumber("+1 1234567890"));
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {"invalid", "12345"})
    public void userCanCheckIfPhoneNUmberIsInValid(String phoneNumber){
        boolean actualResult = (testingCode.isValidPhoneNumber(phoneNumber));
        assertFalse(actualResult);
    }
}
