public class Pet {

    private int age;
    private boolean isRescue;
    private String name;

    public Pet(int age, boolean isRescue, String name) {
        this.age = age;
        this.isRescue = isRescue;
        if (name == null) {
            throw new IllegalArgumentException("Parameters can't be null");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isRescue() {
        return isRescue;
    }

    public void setRescue(boolean rescue) {
        isRescue = rescue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Parameters can't be null");
        } else {
            this.name = name;
        }
    }

}

//2. Create a class named **Pet** inside of `java`.
//
//        - The class should define three fields. One of type `int` named
//        `age`, one of type `boolean` named `isRescue`, and one of type `String` named `name`.
//        These fields should not be accessible
//        outside the **Pet** class.
//        - Add a constructor method that has three parameters of the types above and sets `age`
//        ,`isRescue`, and `name` properties based on the respective parameters.
//        - If the passed `name` argument is `null`,
//        the constructor should throw an `IllegalArgumentException`.
//        - Write getters and setters for all three fields.