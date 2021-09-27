import java.util.stream.*;
import java.util.stream.LongStream;

public class MoreStreamStuff {
    static long a = 10;
    static long b = 10;
    public static void main(String[] args) {
        LongStream.rangeClosed(a,b).forEach(System.out::println);
        System.out.println(LongStream.rangeClosed(a,b).count());
        System.out.println(LongStream.rangeClosed(a,b).distinct().reduce(1,(a,b) -> a * b));
    }
}
