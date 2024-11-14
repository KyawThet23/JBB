package lambda;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

    }

    public static void show() {
        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        var sky = isLongerThan5.test("sky");
        var hello1 = isLongerThan5.test("hello1");
    }
}
