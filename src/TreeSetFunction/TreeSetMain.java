package TreeSetFunction;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {

        Set<String> ts1 = new TreeSet<>();

        // Elements are added using add() method
        ts1.add("A");
        ts1.add("B");
        ts1.add("C");

        // Duplicates will not get insert
        ts1.add("C");

        // Elements get stored in default natural
        // Sorting Order(Ascending)
        System.out.println(ts1);
    }
}
