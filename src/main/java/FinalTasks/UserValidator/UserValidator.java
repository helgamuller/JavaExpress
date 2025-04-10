package FinalTasks.UserValidator;

import FinalTasks.UserValidator.exeption.InvalidUserException;

public class UserValidator {
    private static boolean isValidationEnabled;

    public static boolean isValidationEnabled(){
        if(!isValidationEnabled){
            return false;
        }
       return isValidationEnabled;
    }

    public static void enableValidation(){
        isValidationEnabled = true;
        System.out.println("Validation is active!");
    }

    public static void disableValidation(){
        isValidationEnabled = false;
        System.out.println("Validation has been deactivated!");
    }

    public static boolean isNameValid(User user)  {
        if
            (user.getName() == null || user.getName().trim().isEmpty()) {
              //  throw new InvalidUserException("User name can not be empty");
            return false;
        }
            char firstChar = user.getName().trim().charAt(0);
            if (!Character.isUpperCase(firstChar)) {
               // throw new InvalidUserException("User's name must start with a capital letter");
                return false;
            }

        else {return true;}
    };

    public static boolean isAgeInValidRange(User user) {
        if(user.getAge()<18 || user.getAge()>100) {
           // throw  new InvalidUserException("User's age must be between 18 and 100 years");
            return false;
        }
        else{
            return true;
            //System.out.println("User's name  was successfully validated");
        }
    }

    public static boolean isEmailValid(User user){
        return user.getEmail() != null && user.getEmail().matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }

    public static boolean validateUser(User user) {
        try {
            if (!isValidationEnabled) {
                System.out.println("Validation isn't accessible at the moment, turn it on or try it out later");
                return false;


            } if ((!isAgeInValidRange(user)) || (!isEmailValid(user)) || (!isNameValid(user))) {
                throw new InvalidUserException("User's date is not valid! validation failed!");
            }
                System.out.println("User was validated! Congratulations!");
            return true;

        } catch (InvalidUserException e) {
            System.err.println("Exception! User wasn't validated! Check user's data " + e.getMessage());
        }
        return false;
    }

    public static void main(String[] args) {
        User userWithInvalidAge = new User(10, "valid_email@gmail.com", "Valid name");
        User userWithInvalidName = new User(20, "valid_email@gmail.com", "invalid name");
        User userWithInvalidEmail = new User(25, "invalid_email@gmail", "Valid name");
        User validUser = new User(25, "valid_email@gmail.com", "Valid name");

        System.out.println(isValidationEnabled());
        enableValidation();
        validateUser(validUser);
        System.out.println();

        validateUser(userWithInvalidName);
        System.out.println();
        validateUser(userWithInvalidAge);
        System.out.println();
        validateUser(userWithInvalidEmail);
        System.out.println();

       //**

        // disableValidation();
        //System.out.println(isValidationEnabled());
        //validateUser(validUser);




    }
}


