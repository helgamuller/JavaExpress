package FinalTasks.UserValidator;

import FinalTasks.UserValidator.exeption.InvalidUserException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static FinalTasks.UserValidator.UserValidator.validateUser;
import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTest extends UserValidatorBeforeTest {
    /**
     * validateUser checks:
     * Positive cases:
     *  User validUser = new User(25, "valid_email@gmail.com", "Valid name") - > valid
     *
     *  Corner cases:
     *      ValidUser = new User(18, "valid_email@gmail.com", "Valid name") - > valid
     *      ValidUser = new User(100, "valid_email@gmail.com", "Valid name") - > valid
     *      ValidUser = new User(25, "valid_email@gmail.com", "V") - > valid
     *      ValidUser = new User(25, "vl@gmail.co", "Valid") - > valid
     * Negative cases:
     *      InValidUser = new User(19, "invalid_email@gmail.", "Valid name") - > invalid
     *      InValidUser = new User(125, "valid_email@gmail.com", "Valid name") - > invalid
     *      InValidUser = new User(50, "valid_email@gmail.com", "invalid name") - > invalid
     *      InValidUser = new User(50, "valid_email@gmail.com", "") - > invalid
     *
     */

    public static Stream<Arguments> validDataForUserValidation(){
        return Stream.of(
                Arguments.of(new User(25, "valid_email@gmail.com", "Valid name")),
                Arguments.of(new User(18, "valid_email@gmail.com", "Valid name")),
                Arguments.of(new User(100, "valid_email@gmail.com", "Valid name")),
                Arguments.of(new User(25, "valid_email@gmail.com", "V")),
                Arguments.of(new User(25, "v@gmail.co", "Valid"))
        );
    }

    @ParameterizedTest
    @DisplayName("User with valid Name, Age and Email can be validated")
    @MethodSource("validDataForUserValidation")
    public void valisUserCanBeValidated(User user){
        boolean actualResult = UserValidator.validateUser(user);
        assertTrue(actualResult);
    }
    public static Stream<Arguments> inValidDataForUserValidation(){
        return Stream.of(
                Arguments.of(new User(19, "invalid_email@gmail.", "Valid name")),
                Arguments.of(new User(125, "valid_email@gmail.com", "Valid name")),
                Arguments.of(new User(50, "valid_email@gmail.com", "invalid name")),
                Arguments.of(new User(50, "valid_email@gmail.com", ""))

        );
    }

    @ParameterizedTest
    @DisplayName("User with invalid Name, Age and Email can NOT be validated")
    @MethodSource("inValidDataForUserValidation")
    public void invalidUserCanNotBeValidated (User user){
        assertFalse(UserValidator.validateUser(user));
    }
}
