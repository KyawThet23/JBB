package lambda;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        show();
    }

    public static void show(){
        Supplier<Double> getRandom = () -> Math.random();
        var random = getRandom.get();
        System.out.println(random);
    }
}
