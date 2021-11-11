package validationservice;

import validationservice.model.User;

public class UserValidationDemo {

    public static void main(String[] args) {
        UserValidationService service = new UserValidationService();
        User olgaUser = new User("Olga", "Petrova", 29);
        service.validate(olgaUser); // empty result
        User liUser = new User("Li", "Bruce", 33);
        service.validate(liUser); // ERROR name should not be less than 3 symbols
    }

}
