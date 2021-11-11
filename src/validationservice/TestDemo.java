package validationservice;

public class TestDemo {

    public static void main(String[] args) {
        System.out.println("TEST REPORT:");
        UserValidationServiceTest.firstNameMinLengthRuleFailTest();
        UserValidationServiceTest.firstNameMinLengthRuleSuccessTest();
        UserValidationServiceTest.errorMinLengthPatternTest();
    }

}
