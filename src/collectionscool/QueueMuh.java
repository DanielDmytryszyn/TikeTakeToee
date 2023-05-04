package collectionscool;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueMuh {

    public static void main(String[] args) {

        // FIFO

        // FIRST IN FIRST OUT

        Queue<String> queue = new LinkedList<>();

        System.out.println("Queue");
        System.out.println();

        queue.offer("jakob");
        queue.offer("daniel");
        queue.offer("jonathan");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

////////////////////////////////////////////////////////////////////

        //LIFO

        // LAST IN FIRST OUT

        System.out.println();
        System.out.println("Stack");
        System.out.println();

        Stack<String> stack = new Stack<>();

        stack.add("jakob");
        stack.add("daniel");
        stack.add("jonathan");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
