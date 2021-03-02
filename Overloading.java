import java.util.Arrays;

public class Overloading {

    public static final int[] arr = {1,2,3};
    public static void main(String[] args) {
        
        //Overloading is when there are multiple methods in a class with the same name but a diff method signature
        //A method signature is defined collectively by its name and the parameter list(both the np. of params
        //and their return types)
        //*****THe return type is not considered as part of a method's signature
        

        //Overloading is used when in-built Java classes such as the Math class
        //Certain mathematical operations need to be defined for multiple data types - for e.g. absolute value functionality:
        System.out.println(Math.abs(12));
        System.out.println(Math.abs(-12.22));
        //Two diff methods with the same name exist to work with different kinds of inputs

        //The overloading mechanism allows us not to write different names for methods that perform similar operations.
        //overloading is a form of the static (compile-time) polymorphism.

        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        //When a variable of a reference data type is set as final, it means that the REFERENCE CANNOT BE CHANGED
        //ie that variable will always point/hold a reference to the same memory location. The values in that
        //location however can change if the reference type is not immutable
        
    }    
}
