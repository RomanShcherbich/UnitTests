package validationservice;

import validationservice.model.User;

public class UserValidationService {


    public String[] validate(User user) {
        String[] result = new String[6];
        if (!validateNameMinLength(user.getFirstName(), 3)) {
            String error = String.format(UserValidationException.MIN_NAME_LENGTH_ERROR_PATTERN, "first name");
            result[0] = error;
//            System.out.printf(UserValidationException.MIN_NAME_LENGTH_ERROR_PATTERN, "first name");
        };

        if (!validateNameMinLength(user.getLastName(), 3)) {
            String error = String.format(UserValidationException.MIN_NAME_LENGTH_ERROR_PATTERN, "last name");
            result[1] = error;
//            System.out.printf(UserValidationException.MIN_NAME_LENGTH_ERROR_PATTERN, "last name");
        };
        return result;
    }

    public boolean validateNameMinLength(String name, int minLength) {
        if (name.length() > minLength) {
            return true;
        } else {
            return false;
        }
    }


}