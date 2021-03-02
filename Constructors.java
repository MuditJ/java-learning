public class Constructors {
    public static void main(String[] args) {
        var r = new Robot("R2D2");
        System.out.println(r.model);
    }
}

class Robot {
    String name;
    String model;

    public Robot() {
        //No args constructor:
        this.name = "Anon";
        this.model = "Unknown";
    }

    public Robot(String name) {
        //When invoking one constructor inside the body of another constructor, the second constructor call must 
        //be the first statement
        //System.out.println("hi"); - Uncommenting this would give an error
        this(name, "Unknown");
    }

    public Robot(String name, String model) {
        this.name = name;
        this.model = model;
    }
}
