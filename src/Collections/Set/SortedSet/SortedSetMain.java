package Collections.Set.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetMain {
    public static void main(String[] args) {
        SortedSet<String> ts = new TreeSet<>();

        // Adding elements into the TreeSet
        // using add()
        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");

        // Adding the duplicate
        // element
        ts.add("India");

        // Displaying the TreeSet
        System.out.println(ts);
    }
}
