public class SuperStuff {
    
    private int a = 10;
    int c = 30;
    int getA() {
        return this.a;
    }

    public static void main(String[] args) {
        var s = new SubStuff();
        System.out.println(s.getSum());
    }
}

class SubStuff extends SuperStuff {

    private int b = 20;
    public int getSum() {
        //return this.b + super.a; //Wont work as the field a 
        //of the superclass is not visible outside as it is private
        return this.b + super.c;
    }
}
