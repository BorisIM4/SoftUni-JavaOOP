package L2_Encapsulation_Exercise.P3_Shopping_Spree;

public class Validator {
    public static void validName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    public static void validMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }

    private Validator () {

    }

}
