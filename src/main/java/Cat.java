public class Cat extends Pet implements Meowable {

    private String color;

    public Cat(int age, boolean isRescue, String name, String color) {
        super(age, isRescue, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void meow() {
        System.out.println("This is a meow!");
    }

    public int getVowelCountInColor() {
        int vowelCount = 0;
        for (int i = 0; i < color.length(); i++) {
            if (color.toUpperCase().charAt(i) == 'A' || color.toUpperCase().charAt(i) == 'E' ||
                color.toUpperCase().charAt(i) == 'I' || color.toUpperCase().charAt(i) == 'O' ||
                color.toUpperCase().charAt(i) == 'U') {
                vowelCount += 1;
            }
        }
        return vowelCount;
    }

}

//8. In your **Cat** class create a method named `getVowelCountInColor`.
//
//        This method should:
//
//        - Have no parameters.
//        - The method returns an `int` that is the number of vowels in the cat's color. Valid vowels are a, e, i, o, and u.
//
//        Sample Input
//
//        ```
//        System.out.println(cat1.getVowelCountInColor()); // cat1's color is black
//        System.out.println(cat1.getVowelCountInColor()); // cat2's color is ORaNGE
//        System.out.println(cat1.getVowelCountInColor()); // cat3's color is whIte
//        ```
//        Sample Output
//
//        ```
//        1
//        3
//        2
//        ```

//3. Create a class named **Cat** inside of `java` that inherits from **Pet**.
//
//        - Add a private field named `color` that is a String. This
//        field represents the color of each instance of **Cat**.
//        - Write the constructor on **Cat** that has 4 parameters: the age
//        of the cat, a boolean indicating whether the cat is a rescue, what the cat's name is, and the color of the cat.
//        The corresponding fields of the object
//        should be set based on the arguments passed to the constructor.
//        (Hint: use of the super constructor may be useful here)
//        - Write a getter and setter on the **Cat** class for the `color` field.
