import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("eleven");
        hs.add("twelve");
        hs.add("fourteen");
        hs.add("fifteen");
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}
