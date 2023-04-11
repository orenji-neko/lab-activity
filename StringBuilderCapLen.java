// Name: Mark Jess Anthony S. Enfermo
// Date: April 11, 2023
// Description p34 String Builder Cap Length

public class StringBuilderCapLen {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("hello, how are you?");

        System.out.printf("buffer = %s\nlength = %d\ncapacity = %d\n\n", buffer.toString(), buffer.length(), buffer.capacity());
        
        buffer.ensureCapacity(75);
        System.out.printf("New Capacity = %d\n\n", buffer.capacity());

        buffer.setLength(10);
        System.out.printf("New length = %d\nbuffer = %s\n", buffer.length(), buffer.toString());
    }
}