package testsHomework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class isValidPhoneNumberTest extends TestCommon{
    /**
     * Корректные номера ("+1 1234567890")
     * Некорректные номера ("12345", "invalid")
     *
     * Positive case:
     *          "+1 1234567890" ->true
     *
     * Negative cases:
     *          "12345" - false
     *          "invalid" - false
     *
     */

    @Test
    @DisplayName("Correct phone number validation")
    public void userCanCheckCorrectPhoneNumber(){
        boolean actualResult = testingCode.isValidPhoneNumber("+1 1234567890");
        assertTrue(actualResult);
    }



    @ParameterizedTest
    @ValueSource(strings = {"12345","invalid"})
    @DisplayName("Incorrect phone number validation")
    public void userCanCheckIfPhoneNumberIsIncorrect(String phoneNumber){
        boolean actualResult = testingCode.isValidPhoneNumber(phoneNumber);
        assertFalse(actualResult);
    }
}
