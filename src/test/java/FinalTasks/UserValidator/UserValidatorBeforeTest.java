package FinalTasks.UserValidator;

import org.junit.jupiter.api.BeforeEach;


public class UserValidatorBeforeTest {
    protected static final String userValidatedConfirmation="User was validated! Congratulations!";
    @BeforeEach
    public void main() {
        UserValidator.enableValidation();


    }

}
