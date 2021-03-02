public class PrimitiveandReferenceTypes {
    public static void main(String[] args) {
        //Data types in Java are either primitive or reference types
        //Fixed(8) number of primitives.
        //Reference types can be created by users too
        //Objects are the entities of reference types - they are created with the new keyword
        String s = new String("abc");

        //Strings and arrays are exceptions in that they are reference types which can be
        //instantiated without the new keyword:
        String t = "bye";
        String p = new String("bye");
        int[] x = {1,2,3};
        System.out.println(s + " " + t);
        System.out.println(x); //Doesnt print the actual contents of the array - because the toString method of arrays has some
        //base implementation which prints the hashcode of the object
        
        //Core difference b/w primitives and reference types:
        //A variable of primitive data type stores the actual value/data while a variable of
        //reference data type stores the reference(address) to a heap memory location where the actual value is stored

        System.out.println(t.equals(p));
        System.out.println(t == p);

    }
}