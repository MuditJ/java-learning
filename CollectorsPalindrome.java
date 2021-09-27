import java.util.*;
import java.util.stream.Collectors;

class CollectorsPalindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Map<Boolean, List<String>> palindromeOrNo = Arrays.stream(words)
                .collect(
                    Collectors.partitioningBy(x -> {
                        StringBuilder rev = new StringBuilder();
                        for (int i = x.length() - 1; i >= 0; i--) {
                            rev.append(x.charAt(i));
                        }
                        System.out.println(rev);
                        return !(rev.toString().equals(x));
                    })
                );

        palindromeOrNo = new LinkedHashMap<>(palindromeOrNo);

        System.out.println(palindromeOrNo);
    }
}