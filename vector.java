import java.util.*;

public class vector {
    public static void main(String args[]) {
        Vector<String> an = new Vector<String>();
        an.add("cat");
        an.add("dog");
        an.add("ox");
        an.add("sheep");
        Iterator<String> itr = an.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
