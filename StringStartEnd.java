/* Name: Mark Jess Anthony S. Enfermo
 * Date: 11 April 2023
 * Description: String, stringbuilder, and characters.
 */

public class StringStartEnd {
    public static void main(String[] args) {
        String[] strings = {"started", "starting", "ended", "ending"};

        // test method startsWith
        for(String str : strings)
            if(str.startsWith("st"))
                System.out.printf("\"%s\" starts with \"st\"\n", str);
        System.out.println();

        // test method startsWith starting from pos 2 of string
        for(String str : strings)
            if(str.startsWith("art", 2))
                System.out.printf("\"%s\" starts with \"art\" at position 2\n", str);
        System.out.println();

        // test method endsWith
        for(String str : strings)
            if(str.endsWith("ed"))
                System.out.printf("\"%s\" ends with \"ed\"\n", str);
        System.out.println();


    }
}