import java.util.*;

public class RandomPracOne {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        var intScanner = new Scanner(inp);
        List<Integer> li = new ArrayList<>();
        while (intScanner.hasNextInt()) {
            li.add(intScanner.nextInt());
        }
        li.stream().forEach(x -> System.out.print(x + " "));
    }
}
