public class Super {
    public static void main(String[] args) {
        var d = new D();
        System.out.println(d.hashCode());
        d.getVal();
        var c = new C();
        System.out.println(c.hashCode());
        c.getVal();

    }
}

class C {
    
    private int someVal = 20;

    public void getVal() {
        System.out.println("Inside class C's getVal");
        System.out.println(this.hashCode());
        System.out.println(getClass());
        System.out.println(this.someVal);
        System.out.println("Leaving class C");
        //System.out.println(this.extraVal); extraVal name doesnt resolve - can think of super as a means of
        //getting the child class object to access and operate within the scope of the super class
        
    }

}

class D extends C {
    int someVal = 30;
    int extraVal = 40;

    public void getVal() {
        System.out.println(this.someVal);
        super.getVal();
    }
}
