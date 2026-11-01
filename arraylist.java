import java.util.*;

class arraylist {
    public static void main(String args[]) {
        ArrayList<String> fd = new ArrayList<String>();
        fd.add("Sheger");
        fd.add("Adama");
        fd.add("Hawassa");
        fd.add("BahirDar");
        fd.add("Mekele");
        fd.add("DireDawa");
        fd.add("Asosa");
        System.out.print("\nRetrieving elements in ArrayList using   Iterator:");
        Iterator it = fd.iterator();
        while (it.hasNext())
            System.out.print(it.next() + "\t");
    }
}
