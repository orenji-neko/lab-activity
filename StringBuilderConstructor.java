/* Name: Mark Jess Anthony S. Enfermo
 * Date: 11 April 2023
 * Description: String, stringbuilder, and characters.
 */

public class StringBuilderConstructor {
    public static void main(String[] args) {

        StringBuilder buffer1 = new StringBuilder();
        StringBuilder buffer2 = new StringBuilder( 10 );
        StringBuilder buffer3 = new StringBuilder( "hello" );

        System.out.printf( "buffer1 = \"%s\"\n", buffer1);
        System.out.printf( "buffer2 = \"%s\"\n", buffer2);
        System.out.printf( "buffer3 = \"%s\"\n", buffer3);

    }
}