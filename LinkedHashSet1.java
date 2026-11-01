import java.util.*;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<String> lh = new LinkedHashSet();
        lh.add("new york");
        lh.add("addis abeba");
        lh.add("hawwasa");
        lh.add("london");
        Iterator<String> it = lh.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }

}
