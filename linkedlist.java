import java.util.*;

public class linkedlist {
    public static void main(String args[]) {
        LinkedList<String> cl = new LinkedList<String>();
        cl.add("red");
        cl.add("blue");
        cl.add("yellow");
        cl.add("green");
        Iterator<String> itr = cl.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
