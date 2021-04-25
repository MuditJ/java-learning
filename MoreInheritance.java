public class MoreInheritance {
    public static void main(String[] args) {
        Parent c = new Child();
        c.B();
        System.out.println("***");
        c.A();
        //c.P();

    }
}


class Parent {
    int x;
    int y;

    public void A() {
        System.out.println("Inside method A of Parent class");
        System.out.println("This method has been called with an instance of class" +  this.getClass());
    }

    public void B() {
        System.out.println("Inside method B of Parent class");
        
    }

    private void C() {
        System.out.println("This method cannot be inherited so it cant be overridden");
    }
}

class Child extends Parent {
    
    int i;
    int j;

    public void B() {
        System.out.println("Currently in " + this.getClass());
        super.A();
        System.out.println("Inside method B of Child class");
    }

    public void Q() {
        super.B();
        System.out.println("Inside method Q of child class");
    }

    //Using the Overridde annotation with this method would give compile time errors
    public void C() {
        System.out.println("Not overridden");
    }

}