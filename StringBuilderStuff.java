import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class StringBuilderStuff {
    public static void main(String[] args) {
        // StringBuilder is a class that allows users to create mutable string objects
        StringBuilder s = new StringBuilder("abc");
        System.out.println(s);
        s.setCharAt(0, 'x');
        System.out.println(s);
    }
}