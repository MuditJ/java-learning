import java.util.Arrays;

public class StringStuff {
    public static void main(String[] args) {
        //Strings are a sequence of characters stored together in memory like array
        //Unlike arrays, strings are immutable so the chars that it stores cant be changed

        //As strings are reference type, two strings cant be compared using == or != 

        //To be able to manipulate/change the individual chars of a string, we can convert
        //the string to a char array (and then convert it back to string)
        String s = "abcd";
        char[] arr = s.toCharArray();
        arr[arr.length - 1] = 'X';
        String p = String.valueOf(arr);
        System.out.println(p);

        //The split method can also be used to convert a String into an array BUT
        //it converts it into an ARRAY OF STRINGS
        //char[] array = s.split(" "); //Gives error: char cannot be converted to String
        String[] array = s.split("");
        String[] array2 = s.split(" ");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}