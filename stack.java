import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<String> bookStack = new Stack<String>();

        bookStack.push("fikir eske mekabr");
        bookStack.push("dertogada");
        bookStack.push("oromay");
        Iterator<String> itr = bookStack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
