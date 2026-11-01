import java.util.*;

class arraylist {
    public static void main(String args[]) {
        ArrayList<String> fd = new ArrayList<String>();
        fd.add("kitfo");
        fd.add("burger");
        fd.add("pizza");
        fd.add("kfc")
        Iterator it = fd.iterator();
        while (it.hasNext())
            System.out.print(it.next() + "\t");
    }
}
