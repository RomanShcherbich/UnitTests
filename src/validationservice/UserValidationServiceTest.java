package validationservice;

import validationservice.model.User;

import java.util.Arrays;

public class UserValidationServiceTest {

    public static void firstNameMinLengthRuleFailTest() {
        String invalidUserName = "Li";
        UserValidationService service = new UserValidationService();

        boolean expectedResult = false;
        boolean actualResult = service.validateNameMinLength(invalidUserName, 3);

        if (expectedResult == actualResult) {
            System.out.println("PASSED. FAIL Validation feature - min length for name works correctly");
        } else {
            System.out.println("FAILED. FAIL Validation feature - min length for name works correctly");
        }
    }


    public static void firstNameMinLengthRuleSuccessTest() {
        String validUserName = "Tanya";
        UserValidationService service = new UserValidationService();

        boolean expectedResult = true;
        boolean actualResult = service.validateNameMinLength(validUserName, 3);

        if (expectedResult == actualResult) {
            System.out.println("PASSED. SUCCESS Validation feature - min length for name works correctly");
        } else {
            System.out.println("FAILED. SUCCESS Validation feature - min length for name works correctly");
        }
    }

    public static void errorMinLengthPatternTest() {
        User liUser = new User("Li", "Br", 33);
        UserValidationService service = new UserValidationService();

        String[] expectedResult = {
                "ERROR first name should not be less than 3 symbols\n",
                "ERROR last name should not be less than 3 symbols\n",
        };
        String[] actualResult = service.validate(liUser);

        for (int i = 0; i < expectedResult.length; i++) {
            String expectedVal = expectedResult[i];
            String actualVal = actualResult[i];
            if (expectedVal.equals(actualVal)) {
                System.out.println("PASSED. SUCCESS Validation feature - min length for name works correctly");
            } else {
                System.out.printf("FAILED. failed message is not:\n %s\n", expectedVal);
                System.out.printf("Actual was:\n %s\n", actualVal);
            }
        }

    }

}
