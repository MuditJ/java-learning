import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamStuffTwo {
    public static void main(String[] args) {
        
        List<Book> javaBooks = List.of(
        new Book("Java EE 7 Essentials", 2013, List.of("Arun Gupta")),
        new Book("Algorithms", 2011, List.of("Robert Sedgewick", "Kevin Wayne")),
        new Book("Clean code", 2014, List.of("Robert Martin"))
    );
    //How to get a list of authors from here?
    List<String> allAuthors = javaBooks.stream().flatMap(book -> book.getAuthors().stream()).collect(Collectors.toList());
    //Print out the authors:
    allAuthors.stream().forEach(System.out::println);
    
    //When to use flatMap?
    //book -> book.getAuthors() converts a single Book item to a List<String>
    //then doing stream() ends up giving us a Stream<List<String>>
    //This can be 'flattened' into a Stream<String> using a flatMap

    //Eg 2
    List<List<Integer>> integers = List.of(List.of(1,2), List.of(3,4));
    System.out.println(integers);
    integers.stream().forEach(System.out::println);
    System.out.println("After applying flatMap:");
    integers.stream().flatMap(x -> x.stream()).forEach(System.out::println);
    List<String> names = List.of("Costa Rica", "Puerto Rico", "New Zealand", "United States Of America","India");
    List<String> newList = names.stream().map(x -> x.split("\\s+")).flatMap(Arrays::stream).collect(Collectors.toList());
    System.out.println(newList);
    IntStream s = IntStream.of();
    IntStream p = IntStream.of();
    System.out.println(s.max() + " " + p.count());
    }

}

class Book {
    String name;
    int year;
    List<String> authors;

    public Book(String name, int year, List<String> authors) {
        this.name = name;
        this.year = year;
        this.authors = authors;
    }

    public List<String> getAuthors() {
        return this.authors;
    }
}

