package testsHomework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class isLeapYearTest extends  TestCommon{
    /**
     * Обычные годы
     * Високосные (2020, 2000, 1600)
     * Года, которые делятся на 100, но не на 400 (1900, 2100)
     * Positive:
     *      2020 - >true
     *  Negative:
     *      2021 -> false
     *  Corner case:
     *      2100 - > false
     *
     *
     */
    @ParameterizedTest
    @ValueSource(ints = {2020, 2100})
    public void userCanCheckIfYearIfYearIsLeap(int YearToCheck) {
        boolean actualResult = testingCode.isLeapYear(YearToCheck);
        assertTrue(actualResult);
    }

    @Test
    public void userCanCheckIfYearIfYearIsNotLeap() {
        boolean actualResult = testingCode.isLeapYear(2021);
        assertFalse(actualResult);
    }
}
