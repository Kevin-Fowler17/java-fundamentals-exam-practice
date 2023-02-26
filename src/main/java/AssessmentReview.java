import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class AssessmentReview {

    public static int cubed(int num) {
        return (int) Math.pow(num, 3);
    }

    public static int difference(int num1, int num2) {
        return num1 - num2;
    }

    public static double difference(double num1, double num2) {
        return num1 - num2;
    }
    
    public static double median(int [] array) {
        Arrays.sort(array);
        double median = 0;
        if (array.length % 2 == 0) {
            return ((double) array[array.length / 2] + (double) array[array.length / 2 - 1]) / 2;
        } else {
            return (double) array[array.length / 2];
        }
        
    }

    public static ArrayList<Cat> uppercaseCatColor(ArrayList<Cat> cats) {
        ArrayList<Cat> uppercaseColor = new ArrayList<>();

        for (Cat cat : cats) {
            if (!cat.getColor().equals(cat.getColor().toUpperCase())) {
                cat.setColor(cat.getColor().toUpperCase());
            }
            uppercaseColor.add(cat);
        }
        return uppercaseColor;
    }

}

//7. On your **AssessmentReview** class create a static method named `uppercaseCatColor`.
//
//        This method should:
//
//        - Receive an `ArrayList` of **Cat** objects as a parameter.
//        - The method should return an `ArrayList` of **Cat** objects, where each **Cat**
//        object's `color` field is in uppercase.

//    - Check to make sure that each **Cat**'s `color` field is already uppercase
//    - If the `color` field is not already uppercase, **_USE THE SETTER_** to change the `color` field to uppercase.




//1. In the **AssessmentReview** class inside the `java` directory.
//
//        - Write a public static method named `cubed` that accepts an integer as
//        an argument and returns that integer to the third power.
//        - Write a public static method named `difference` that accepts two arguments and
//        that works with both integers and doubles (use method overloading). Both variations of the method
//        should return the result of subtracting the second argument from the first argument.
//        - Write a public static method named `median` that receives an array of
//        `int`s (please use an array, not a `Collection`) and returns the median as a `double`.
//        - (Hint: there are examples of how to find median of an array in Java all over the internet)
//        - (Hint: the sort method on the Arrays class may be very helpful here)
//        - (Hint: make sure the median of `[1, 3, 4, 2, 6, 5, 8, 7]` is `4.5`)
