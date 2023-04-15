/* Name: Mark Jess Anthony S. Enfermo
 * Date: 16 April 2023
 * Description: String, stringbuilder, and characters.
 */

 public class StringBuilderAppend {
    public static void main(String[] args) {
        Object objectRef = "hello";
        String string = "goodbye";
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 10000000000L;
        float floatValue = 2.5f;
        double doubleValue = 33.333;
        StringBuilder lastBuffer = new StringBuilder("last buffer");
        StringBuilder buffer = new StringBuilder();

        buffer.append(objectRef); buffer.append("\n");
        buffer.append(string); buffer.append("\n");
        buffer.append(charArray); buffer.append("\n");
        buffer.append(booleanValue); buffer.append("\n");
        buffer.append(characterValue); buffer.append("\n");
        buffer.append(integerValue); buffer.append("\n");
        buffer.append(longValue); buffer.append("\n");
        buffer.append(floatValue); buffer.append("\n");
        buffer.append(doubleValue); buffer.append("\n");
        buffer.append(lastBuffer); buffer.append("\n");
        System.out.printf("buffer contains %s\n", buffer.toString());
    }
 }