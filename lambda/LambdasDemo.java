package lambda;

public class LambdasDemo {

    public static void main(String[] args) {
        show();
    }

    public static void show() {

        //lambda expression
        greet((String message) -> {
            System.out.println(message);
        });

        //Anonymous inner class
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }

    public static void greet(Printer printer){
        printer.print("Hello World");
    }
}
