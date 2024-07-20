import java.util.*;

public class QUsingJavaCollectionFeamework {

    public static void main(String[] args) {
        //Queue is an interface so cant create objects from it. so we are creating queue using LinkedList or ArrayDqueue.

        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);//O(1)
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());//O(1)
            q.remove();//O(1)
        }
    }
}