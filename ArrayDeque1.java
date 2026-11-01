import java.util.*;

public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<String>();
        ad.add("mango");
        ad.add("orange");
        ad.add("pineapple");
        ad.add("banana");
        Iterator<String> itr = ad.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
