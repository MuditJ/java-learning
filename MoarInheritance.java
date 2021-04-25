public class MoarInheritance {
    public static void main(String[] args) {
        SuperClass obj = new SubClass();
        obj.A();
        obj.B();
        //obj.C(); Gives an error - method C() is undefined for the type SuperClass

    }
    
}

class SuperClass {

    public void A() {

    }

    public void B() {

    }

}

class SubClass extends SuperClass {

    public void C() {

    }

    public void B() {
        System.out.println("Overridden");
    }


}