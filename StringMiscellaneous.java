// StringMiscellaneous
// Mark Jess Anthony S. Enfermo BSIT-1B

public class StringMiscellaneous {
    public static void main(String[] args) {
        String s1 = "hello world";
        char[] charr = new char[5];
        System.out.printf("s1: %s\n", s1);

        // test length method
        System.out.printf("Length of s1: %d\n", s1.length());

        // loop through characters reversed
        System.out.print("The string reversed is: ");

        for(int cnt = s1.length() - 1; cnt >= 0; cnt--) {
            System.out.print(s1.charAt(cnt));
        }

        s1.getChars(0, 5, charr, 0);
        System.out.print("\nThe character array is: ");

        for(char ch : charr) System.out.print(ch);
        System.out.println();
    }
}