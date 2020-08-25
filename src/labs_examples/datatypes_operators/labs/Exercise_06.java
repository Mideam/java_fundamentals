package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        int height = 5;
        double pi = 3.14;
        double radius = 3.14;
        double volume = pi * radius * radius * height;
        double surfaceArea = (2 * pi * radius * radius) + (2 * pi * height);
        System.out.println(volume);
        System.out.println(surfaceArea);

    }
}