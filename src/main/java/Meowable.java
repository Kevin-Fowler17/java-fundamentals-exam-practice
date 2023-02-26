import javax.swing.plaf.metal.MetalBorders;

public interface Meowable {

    public abstract void meow ();

}

//5. Create an interface named **Meowable** inside of `java`.
//
//        - The **Meowable** interface should specify a public abstract method named `meow`
//        that accepts no arguments and returns nothing.
//        - Change your **Cat** class so that it implements the **Meowable** interface.
//        - The implementation of the `meow` method on Cat class should print the following message:
//        ```
//        This is a meow!
//        ```