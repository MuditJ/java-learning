public class Gotchas {
    public static void main(String[] args) {
        System.out.println("nifty".getClass().getSimpleName());
        System.out.println(Boolean.parseBoolean("hello"));
        System.out.println(Boolean.parseBoolean("2"));
        System.out.println(Boolean.parseBoolean("1"));
    }
}
