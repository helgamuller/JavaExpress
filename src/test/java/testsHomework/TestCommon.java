package testsHomework;

import org.junit.jupiter.api.BeforeEach;

public class TestCommon {
    protected TestingCode testingCode;

    @BeforeEach
    public void setupTests(){
        testingCode = new TestingCode();
    }
}
