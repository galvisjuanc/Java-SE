package Collections.Set.TreeSet;

import java.util.Iterator;
import java.util.NavigableSet;
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

        Set<String> ts2 = new TreeSet<>();

        ts2.add("C");
        ts2.add("G");
        ts2.add("Z");
        ts2.add("A");
        ts2.add("F");
        ts2.add("B");
        ts2.add("Y");
        ts2.add("J");

        System.out.println(ts2);

        NavigableSet<String> navigableSet = new TreeSet<>();

        navigableSet.add("pienso");
        navigableSet.add("luego");
        navigableSet.add("existo");
        navigableSet.add("descartes");

        System.out.println("Tree Set is --> " + navigableSet);

        String checkValidation = "existo";

        System.out.println("Contains the word : < " + checkValidation + " > --> " + navigableSet.contains(checkValidation));
        System.out.println("First value : " + navigableSet.first());
        System.out.println("Last value : " + navigableSet.last());


        String value = "luego";
        System.out.println("Value greater than " + value + " is: " + navigableSet.higher(value));
        System.out.println("Value lower than " + value + " is: " + navigableSet.lower(value));

        navigableSet.add("Helloween");
        navigableSet.add("Motorhead");
        navigableSet.add("Green Day");
        navigableSet.add("Goo Goo Dolls");
        navigableSet.add("Metallica");
        navigableSet.add("oasis");
        navigableSet.add("zz top");

        System.out.println("Initial TreeSet " + navigableSet);

        navigableSet.remove("Green Day");

        System.out.println("After removing element: " + navigableSet);

        navigableSet.pollFirst();

        System.out.println("After removing first: " + navigableSet);

        navigableSet.pollLast();

        System.out.println("After removing last: " + navigableSet);

        for (String valor : navigableSet) {
            System.out.println(valor + ", ");
        }

        Set<StringBuffer> treeSet = new TreeSet<>();

        treeSet.add(new StringBuffer("A"));
        treeSet.add(new StringBuffer("Z"));
        treeSet.add(new StringBuffer("L"));
        treeSet.add(new StringBuffer("B"));
        treeSet.add(new StringBuffer("O"));
        treeSet.add(new StringBuffer(1));

        // Note: StringBuffer implements Comparable
        // interface

        // Printing the elements
        System.out.println(treeSet);

        // Creating an empty TreeSet
        TreeSet<String> set = new TreeSet<String>();

        // Use add() method to add elements into the Set
        set.add("Welcome");
        set.add("To");
        set.add("Geeks");
        set.add("4");
        set.add("Geeks");

        // Displaying the TreeSet
        System.out.println("TreeSet: " + set);

        // Creating an iterator
        Iterator valorcito = set.iterator();

        // Displaying the values after iterating through the set
        System.out.println("The iterator values are: ");
        while (valorcito.hasNext()) {
            System.out.println(valorcito.next());
        }
    }
}
