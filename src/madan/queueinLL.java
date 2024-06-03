package madan;
import java.util.Queue;
import java.util.LinkedList;

public class queueinLL {
    public static void main(String[] args) {
        Queue<Integer> friends = new LinkedList<>();
        friends.offer(99);
       // System.out.println(friends.offer(66));
        friends.offer(43);
        friends.offer(75);
      //  System.out.println(friends.peek());
        System.out.println(friends.poll());
        System.out.println(friends);
        friends.remove();
        System.out.println(friends);
        friends.remove();
        System.out.println(friends.poll());
        System.out.println(friends.peek());

    }
}
