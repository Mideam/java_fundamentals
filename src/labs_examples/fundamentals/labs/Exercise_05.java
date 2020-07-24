package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        String str2 = "hello";

        // please declare an int variable below, and set it to the value of the length of "str"
        int length = str.length();

        // please initialize a boolean variable and test whether str is equal to str2
        boolean equal = str.equals(str2);
        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = "Good morning!, " + str + str2 + "goodbye";
        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        int search = "hello".indexOf("l");
        System.out.println(length);
        System.out.println(equal);
        System.out.println(str3);
        System.out.println(search);


    }


}