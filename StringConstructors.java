// StringConstructors
// Mark Jess Anthony S. Enfermo BSIT-1B

public class StringConstructors {

    public static void main(String[] args) {
        char[] charr = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
        String str = new String("hello");

        String s1 = new String();
        String s2 = new String(str);
        String s3 = new String(charr);
        String s4 = new String(charr, 6, 3);

        System.out.printf("s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n", s1, s2, s3, s4);
    }
}