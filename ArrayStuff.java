import java.util.Arrays;

public class ArrayStuff {
    public static void main(String[] args) {
        //An array is a reference type which is used to store multiple
        //elements (of both primitive and reference types) in contiguous memory locations
        int[] arr = new int[5];
        String[] strArray = {"abc", "def", "pqr"};

        //The utility class Arrays contains some helpful methods for working with arrays
        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(arr));
    }
}