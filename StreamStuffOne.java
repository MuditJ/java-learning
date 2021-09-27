import java.util.stream.*;
import java.util.*;

public class StreamStuffOne {
    
    public static void main(String[] args) {
        //Count the number of entries in the list > 5
        List<Integer> nums = new ArrayList<>(List.of(1,7,8,2,5,6,9,2));

        //General procedure for using streams:
        //1. Obtain a 'stream' from a source
        Stream<Integer> s = nums.stream();

        //2. Apply the operations on the stream
        long res = s.filter(num -> num > 5).count();
        System.out.println(res);
        //The above can be combined/concatenated:
        System.out.println("Count of even numbers is: " + nums.stream().filter(x -> x % 2 == 0).count());
    }
}
