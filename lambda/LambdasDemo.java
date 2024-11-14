package lambda;

public class LambdasDemo {

    public static void main(String[] args) {
        show();
    }

    public static String prefix = "-";

    public static void show() {

        //lambda expression
        greet(message -> System.out.println(prefix + message));

        // Method reference
        // Class/Object::method
        greet(MethodRef::print);

    }

    public static void greet(Printer printer){
        printer.print("Hello World");
    }
}
