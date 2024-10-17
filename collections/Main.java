package collections;

import generic.GenericList;

public class Main {

    public static void main(String[] args) {

        var list = new GenericList<String>();
        var iterator = list.iterator();
        while (iterator.hasNext()) {
            var current = iterator.next();
            System.out.println(current);
        }

        // you can write above as like this => byte code still implements hasNext method.
        for (String current : list) {
            System.out.println(current);
        }

    }
}
