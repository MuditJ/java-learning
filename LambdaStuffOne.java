import java.util.*;
import java.util.function.Function;  //This is a functional interface


public class LambdaStuffOne {
    public static void main(String[] args) {
        anotherMethod(SomeLambdaFunc.func);
        anotherMethod(s -> s);
    }

    //Making use of a standard functional interface
    public static void anotherMethod(Function<String,String> f) {
        System.out.println(f.apply("ABC"));
        System.out.println(f.getClass().getSimpleName());
    }
}


class SomeLambdaFunc {
    static final String greeting = "Hello";
    //Creating a lambda expression:
    static Function<String, String> func = (name) ->  greeting + " " + name;
}
