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
        return (num1 - num2);
    }

    public static double median(int [] numArray) {
        double median = 0;
        int length = numArray.length;
        Arrays.sort(numArray);
        if (length % 2 != 0) {
            median = (double) numArray[length / 2];
        } else {
            median = ((double) numArray[(length - 1) / 2 ] + (double) numArray[length / 2]) / 2;
        }

        return median;
    }

    public static ArrayList<Cat> uppercaseCatColor(ArrayList<Cat> cats) {

        ArrayList<Cat> output = new ArrayList<>();

        for (Cat cat : cats) {
            String color = cat.getColor();
            if (!color.equals(color.toUpperCase())) {
                cat.setColor(color.toUpperCase());
            }
            output.add(cat);
        }
        return output;
    }
}




//7. On your **AssessmentReview** class create a static method named `uppercaseCatColor`.
//
//        This method should:
//
//        - Receive an `ArrayList` of **Cat** objects as a parameter.
//        - The method should return an `ArrayList` of **Cat** objects, where each **Cat**
//        object's `color` field is in uppercase.
//
//        Sample Input
//
//        ```
//        a Cat object with a color of "black"
//        a Cat object with a color of "orange"
//        a Cat object with a color of "white"
//        ```
//        Sample Output
//
//        ```
//        a Cat object with a color of "BLACK"
//        a Cat object with a color of "ORANGE"
//        a Cat object with a color of "WHITE"
//        ```
//
//        Hints
//
//        - Check to make sure that each **Cat**'s `color` field is already uppercase
//        - If the `color` field is not already uppercase, **_USE THE SETTER_** to change the `color` field to uppercase.