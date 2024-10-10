package exception;

public class ExceptionDemo {

    public static void main(String[] args) {
        show();
    }

    public static void show(){
        say(null);
    }

    public static void say(String input){
        System.out.println(input.toUpperCase());
    }
}
