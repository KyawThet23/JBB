package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("b");
        queue.add("c");
        queue.add("a");
        var front = queue.peek();
        System.out.println(front);
    }
}
