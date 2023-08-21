public class Validator {
    // Method to validate a string is not empty
    public static boolean isValidString(String input) {
        return input != null && !input.trim().isEmpty();
    }

    // Method to validate a positive integer
    public static boolean isValidPositiveInteger(int number) {
        return number > 0;
    }

    // Method to validate a non-negative double
    public static boolean isValidNonNegativeDouble(double number) {
        return number >= 0;
    }

    // Method to validate a positive double
    public static boolean isValidPositiveDouble(double number) {
        return number > 0;
    }
}
