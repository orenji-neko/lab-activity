/* Name: Mark Jess Anthony S. Enfermo
 * Date: 16 April 2023
 * Description: String, stringbuilder, and characters.
 */

import java.util.Scanner;

public class StaticCharMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character and press Enter");
        String input = scanner.next();
        char c = input.charAt(0);

        System.out.printf("is defined: %b\n", Character.isDefined(c));
        System.out.printf("is digit: %b\n", Character.isDigit(c));
        System.out.printf("is first character in a Java identifier: %b\n", Character.isJavaIdentifierStart(c));
        System.out.printf("is part of a Java identifier: %b\n", Character.isLetter(c));
        System.out.printf("is letter: %b\n", Character.isLetter(c));
        System.out.printf("is letter of digit: %b\n", Character.isLetterOrDigit(c));
        System.out.printf("is lowercase: %b\n", Character.isLowerCase(c));
        System.out.printf("is uppercase: %b\n", Character.isUpperCase(c));
        System.out.printf("to uppercase: %c\n", Character.toUpperCase(c));
        System.out.printf("to lowercase: %c\n", Character.toLowerCase(c));
    }
}
