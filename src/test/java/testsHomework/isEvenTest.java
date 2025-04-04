package testsHomework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class isEvenTest extends TestCommon {
    /**
     *  Positive tests:
     * 4-> true
     *
     * Corner cases:
     *  0->true
     *  -4 ->true
     * Negative test:
     * 3->false;
     * */

    @ParameterizedTest
    @ValueSource (ints =  {4, 0,-4})
   public void userCanCheckIfNumberIsEven(int num){
       boolean actualResult = testingCode.isEven(num);
       assertTrue(actualResult);
   }

   @Test
    public void userCanCheckIfNumberIsOdd(){
        int num = -3;
       boolean actualResult = testingCode.isEven(num);
       assertFalse(actualResult);
   }
}
