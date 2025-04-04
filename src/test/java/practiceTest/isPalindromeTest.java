package practiceTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class isPalindromeTest extends StringProcessorTest{

    /**
     * Test for checking if the string is palindrome
     * positive casse:
     *  - even number: "abba"-> true
     *  - odd number: "madam"-> true
     *  negative case:
     *   - "olga"-> false
     *  corner cases:
     *   - "a"->true
     *   - ""-> true
     *    - null - > IllegalArgumentException
      */

    @ParameterizedTest
    @ValueSource(strings = {
            //positive cases
            "abba",
            "madam",
            //corner cases
            "a",
            ""})
    public void userCanCheckIfValidStringIsPalindrome(String initialString){
        boolean actualResult = stringProcessor.isPalindrome(initialString);
        assertTrue(actualResult);

    }
    @Test
    public void userCanCheckIfValidStringIsNotPalindrome(){
        String initialString = "jhon";
        boolean actualResult = stringProcessor.isPalindrome(initialString);
        assertFalse(actualResult);
    }
    @Test
    public void userCanNotCheckIfPalindromtForNullString() {
        assertThrows(IllegalArgumentException.class, ()->{
                    stringProcessor.reverse(null);

                },
                "Checking if null string is Palindrome leads to IllegalArgumentException");
    }
}
