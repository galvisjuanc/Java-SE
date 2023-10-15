package Collections.Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetMain {
    public static void main(String[] args) {
        // Creating an empty LinkedHashSet of string type
        LinkedHashSet<String> linkedset
                = new LinkedHashSet<String>();

        // Adding element to LinkedHashSet
        // using add() method
        linkedset.add("A");
        linkedset.add("B");
        linkedset.add("C");
        linkedset.add("D");

        // Note: This will not add new element
        // as A already exists
        linkedset.add("A");
        linkedset.add("E");

        // Getting size of LinkedHashSet
        // using size() method
        System.out.println("Size of LinkedHashSet = "
                + linkedset.size());

        System.out.println("Original LinkedHashSet:"
                + linkedset);
    }
}
