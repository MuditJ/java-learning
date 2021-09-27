public class FunctionalStuffOne {
    public static void main(String[] args) {
        //f is a lambda expression that does nothing
        //A lambda expression is invoked by calling the method of
        //the functional interface that it implements
        CustomFunctionalInterface f = () -> {};
        f.doNothing();
        //s is a lambda expression
        SecondCustomFuncInterface<Integer> s = x -> {System.out.println(x);};
        s.doSomethingElse(10);
    }
}


/*Any interface with a SAM(Single Abstract Method) is a functional interface
It can also have some static and default methods */

//This is an example of a non-generic type
@FunctionalInterface
interface CustomFunctionalInterface {

    void doNothing();

}

//This is an example of a generic type
@FunctionalInterface
interface SecondCustomFuncInterface<S> {

    void doSomethingElse(S s);
}
