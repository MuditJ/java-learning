public class PrimitivesandReferenceTypes {
    //All data types in Java are either primitive type or a reference type
    //THere are 8 pre-defined primitive types in Java
    //All other types(including user created types) are reference types
    //Each of the 8 primitive types also has a corresponding reference type (that allows for operations/methods to be performed on the data)
    //String, Scanner, arrays are reference types present in the standard library

    //Other important points:
    //1. How primitive and reference types vary in terms of assignment - this is because the memory location that a variable refers to
    //for primitive types stores the actual value while in the case of reference types, it stores the address of the location in
    //heap memory where the data actually is
    //2. Use the equals method and not the == operator to compare values for reference types(when an equals method is defined for that type)
    //Source: https://hyperskill.org/learn/step/5035
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        int c = 10;
        System.out.println(b == c);
        String f = "java";
        String g = "java";
        System.out.println(f == g); //Some string optimizations made by JVM result in this being true
        System.out.println(f.equals(g));
        var p = new NewPerson("M",22);
        var q = new NewPerson("M",22);
        System.out.println(p == q);
        System.out.println(p.equals(q)); //No equals() method defined for class NewPerson. The default behaviour,
        //inherited from the Object class, which simply uses the == operator, is used
        

    }


}

class NewPerson {
    private String name;
    private int age;

    public NewPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
