// write the class Complex here
class Complex {
    
    public double real;
    public double imaginary;

    public static void main(String[] args) {
        var c = new Complex(10,12.43);
        System.out.println(c.real);
        System.out.println(c.imaginary);
    }
    
    public Complex (double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
}
