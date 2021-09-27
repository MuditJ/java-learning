import java.util.Date;

public class SuperStuffTwo {
    
    public static void main(String[] args) {
        var e = new Employei("ABC", 2010, "123 Road", new Date(), 2000L);
        System.out.println(e.getName());
    }
}

class Personne {

    protected String name;
    protected int yearOfBirth;
    protected String address;

    public Personne(String name, int yearOfBirth, String address) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        System.out.println(this.getClass());
        System.out.println(this.hashCode());
    }

    public String getName() {
        System.out.println(this.getClass());
        return this.name;
    }

    // getters and setters
}

class Employei extends Personne {

    protected Date startDate;
    protected Long salary;

    public Employei(String name, int yearOfBirth, String address, Date startDate, Long salary) {
        super(name, yearOfBirth, address); // invoking a constructor of the superclass
        
        this.startDate = startDate;
        this.salary = salary;
        System.out.println(this.getClass());
        System.out.println(this.hashCode());
        super.name = "Hi";
        //super.salary = 500L; This will give an error as the name 'salary' cannot be resolved from the scope of the parent class Personne
        
    }

    // getters and setters
}
