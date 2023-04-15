/* Name: Mark Jess Anthony S. Enfermo
 * Date: 11 April 2023
 * Description: String, stringbuilder, and characters.
 */

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