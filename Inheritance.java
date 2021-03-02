public class Inheritance {
    //Inheritance is the mechanism of deriving a new class from an existing 'base' class
    //The new child class will be a more specialised version of the base class

    //In this way, inheritance promotes code reuse - when there are multiple 'similar' classes
    //with slight differences in their functionality, we can implement a base class(which can be abstract)
    //and have the slightly different classes be its subclasses, with the common functionality being
    //defined in the base class, and inherited in the child classes


    //A subclass inherits all the public and protected methods and fields from its parent class

    //Constructors are not inherited, but the child class can INVOKE the constructor of its parent
    //using super()

    //If the class is declared with the keyword final, it cannot have subclasses at all.
    public static void main(String[] args) {
        //var a = new A();
        var b = new B();
        b.printInt();

    }    
}

class A {
    int someField;
    char someOtherField;

    public void printInt() {
        this.someField = 42;
        this.someOtherField = 21;
        //System.out.println(this.someNewField); Error: someNewField cannot be resolved
        System.out.println("Inside A");
        System.out.println("This is: " + this);
        System.out.println(this.hashCode());
        System.out.println(this.someField);
    }

    private void randomMethod() {
        System.out.println("Hi");
    }

    protected void anotherRandomMethod() {
        System.out.println("valueof someField is: " + this.someField);
        System.out.println("Hii");
    }
}

class B extends A {
    
    int someNewField;
    int someField;

    public void printInt() {
        super.printInt();
        System.out.println(super.someOtherField);
        System.out.println("Inside B");
        System.out.println("This is: " + this);
        System.out.println(this.hashCode());
        System.out.println(this.someField);
        super.anotherRandomMethod();
        this.anotherRandomMethod();
    }
}

//Use super to call the parent class constructor or to call a method which has been overridden 
//in the child class


