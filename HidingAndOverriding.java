public class HidingAndOverriding {
    public static void main(String[] args) {
        //Method overriding is when a subclass defines a method of the same name, return type
        //and parameter list as its parent class
        //This feature is made available to subclasses which want to slightly tweak some
        //inherited functionality from the parent class

        Mammal m = new Cat();
        System.out.println(m.sayHello()); //Call made to the overriden method sayHello()
        //The method sayHello() is visible to the type Mammal, so the code compiles
        //However, this method is overridden in the instance of class Cat, so a call is made to the overriden method inside Cat
        //class instead of the method in the Mammal class

        Mammal h = new Human();
        System.out.println(h.sayHello());

    }
}

class Mammal {

    public String sayHello() {
        return "ohlllalalalalalaoaoaoa";
    }
}

class Cat extends Mammal {

    @Override
    public String sayHello() {
        return "meow";
    }
}

class Human extends Mammal {

    @Override
    public String sayHello() {
        //The base class method can be invoked using the keyword super:
        System.out.println(super.sayHello());
        return "hello";
    }
}
