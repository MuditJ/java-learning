public class SuperEg {
    public static void main(String[] args) {
        var y = new Y();
        y.someMethod();
    }

}


class X {
    int a = 10;

    protected void someMethod() {
        System.out.println(this);
        System.out.println(this.hashCode());
        //System.out.println(this.b); This gives an error

    }
}

class Y extends X {
    int b = 20;

    protected void someMethod() {
        super.someMethod();
        System.out.println(super.equals(this)); //This returns True - so super also refers to the same object as this??
        System.out.println(this);
        System.out.println(this.hashCode());

    }
}