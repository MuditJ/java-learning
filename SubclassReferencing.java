public class SubclassReferencing {

    public static void main(String[] args) {
     
            //Referencing an object through the same type as the class of the object:
    Person p = new Person();

    //Referencing an object through the type of its superclass 
    Person e = new Employee();

    System.out.println(p);

    // For object e, since the reference type is of the super class, only those methods and fields can be accessed
    //which are visible to the superclass:

    e.setName("Mudit");
    e.setAge(23);
    System.out.println(e);
    

    //The below gives an error: the method setSalary() is undefined for the type Person
    //e.setSalary(); 

    //This also gives an error - salary cannot be resolved or is not a field
    //System.out.println(e.salary);
    //Thus accessing of methods and fields of an object depends on the reference type assigned to that object
    //If a superclass reference is being used, then the methods and fields defined in the sub class are not visible 

    //Typecasting:
    Employee x = (Employee) e;
    System.out.println(x.name);
    x.setSalary(500);
    System.out.println(x);

    }
    
}

class Person {

    protected String name;
    protected int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Name: " + name + " age: " + age; 
    }
}

class Employee extends Person {

    protected long salary;
    protected int yearsOfExperience;

    public long getSalary() {
        return this.salary;
    }

    public void setSalary(long sal) {
        this.salary = sal;
    }

    public void setYearsOfExperience(int years) {
        this.yearsOfExperience = years;
    } 

    public int getYearsOfExperience() {
        return this.yearsOfExperience;
    }

    public String toString() {
        return super.toString() + " salary: " + salary;
    }
}
