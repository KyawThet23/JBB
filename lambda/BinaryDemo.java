package lambda;

import java.util.function.BinaryOperator;

public class BinaryDemo {
    public static void main(String[] args) {

    }

    //nothing , I just want to add github commit history

    public static void show(){
        BinaryOperator<Integer> add = (a,b) -> a+b;
        var result = add.apply(1,2);
    }
}
