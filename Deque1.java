import java.util.*;

public class Deque1 {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<Integer>();

        dq.add(50);
        dq.add(10);
        dq.add(40);
        dq.add(20);

        Iterator<Integer> itr = dq.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
