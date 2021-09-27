//From stackoverflow
//https://stackoverflow.com/questions/6304056/does-instanceof-return-true-if-instance-of-a-parent

class Base {
    public void doSomething() {
        System.out.println("I am the Parent, and I do as I like");
    }
}
 
class ChildA extends Base {
    public void doSomething() {
        System.out.println("I am a child named A, but I have my own ways, different from Parent");
    }
}
 
class ChildB extends Base {
    public void doSomething() {
        System.out.println("I am a child named B, but I have my own ways, different from my Parent and my siblings");
    }
}
 
public class PolymorphismOne {
 
    public static void main(String[] args) {
 
        Base p = new Base();
        p.doSomething();
 
        p = new ChildA();
        System.out.println(p instanceof Base); //true
        System.out.println(p instanceof ChildA); //true
        p.doSomething();
 
        p = new ChildB();
        p.doSomething();
 
    }
 
}