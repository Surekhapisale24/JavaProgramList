package strings.com;
public class StringValidator {
    public static boolean validateString(String input) {
        // Loop through each character in the input string
        for (char c : input.toCharArray()) {
            // Check if the character is not a letter or space
            if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
                return false; // Return false if any character is not a letter or space
            }
        }
        return true; // Return true if all characters are letters or spaces
    }

    public static void main(String[] args) {
        // Example usage
        String inputString = "Surekha Pisale, QA Automation";
        boolean isValid = validateString("Pisale");
        if (isValid) {
            System.out.println("The string is valid.");
        } else {
            System.out.println("The string is invalid.");
        }
    }
}
