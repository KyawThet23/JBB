package collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","c");
//        System.out.println(list);
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
        Set<String> set2 = new HashSet<>(Arrays.asList("c","d","e","f"));

        //Union
        set.addAll(set2);
        System.out.println(set);

        //Intersection
        set.retainAll(set2);
        System.out.println(set);

        //Difference
        set.retainAll(set2);
        System.out.println(set2);
    }
}
