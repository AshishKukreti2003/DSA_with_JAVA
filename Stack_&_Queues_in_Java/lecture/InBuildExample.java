import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InBuildExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<3;i++){
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(4);
        queue.add(3);
        queue.add(9);
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.addFirst(4);
        deque.addLast(8);
        deque.add(5);
        System.out.println(deque);
        System.out.println(deque.remove());
        System.out.println(deque.removeLast());
        System.out.println(deque);
    }
}