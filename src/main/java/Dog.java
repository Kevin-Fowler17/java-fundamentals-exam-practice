public class Dog extends Pet implements Barkable {

    private String breed;

    public Dog(int age, boolean isRescue, String name, String breed) {
        super(age, isRescue, name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Bork bork!");
    }
}

//4. Create a class named **Dog** inside of `java` that also inherits from **Pet**.
//
//        - Add a private field named `breed` that is a String. This
//        field represents the breed of each instance of **Dog**.
//        - Write the constructor on **Dog** that has 4 parameters: the age
//        of the dog, a boolean indicating whether the dog is a rescue, what the dog's name is, and the breed of the dog.
//        The corresponding fields of the object
//        should be set based on the arguments passed to the constructor.
//        (Hint: use of the super constructor may be useful here)
//        - Write a getter and setter on the **Dog** class for the `breed` property.