// Name: Mark Jess Anthony S. Enfermo BSIT-1B
// Date: April 11, 2023
// Descrption p32 String Builder Constructors

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