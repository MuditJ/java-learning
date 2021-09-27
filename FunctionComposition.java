import java.util.*;
import java.util.function.*;

public class FunctionComposition {
    public static void main(String[] args) {
        Function<Integer, Integer> add = x -> x + 10;
        Function<Integer, Integer> mul = x -> x * 10;
        BiFunction<Integer,Integer,Integer> mult = (x,y) -> x * y;

        //Composing the two functions using default methods defined for
        //the Function functional interface
        System.out.println(add.compose(mul).apply(2));
        System.out.println(add.andThen(mul).apply(2));
    }
}
