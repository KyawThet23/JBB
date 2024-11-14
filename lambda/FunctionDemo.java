package lambda;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        show();
        show1();
    }

    public static void show() {
        Function<String, Integer> countLength = str -> str.length();
        var length = countLength.apply("Hello");
        System.out.println(length);
    }

    public static void show1() {

        Function<String,String> replaceColon = str -> str.replace(":","=");
        Function<String, String> addBraces = str -> "{"+str+"}";

        //Declarative programming
        var result = replaceColon
                .andThen(addBraces)
                .apply("key:value");

         var result1 = addBraces.compose(replaceColon).apply("key:value");

        System.out.println(result+" "+result1);
    }
}
