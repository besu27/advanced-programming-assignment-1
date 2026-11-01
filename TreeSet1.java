import java.util.*;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(15);
        ts.add(11);
        ts.add(14);
        ts.add(12);

        Iterator<Integer> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
