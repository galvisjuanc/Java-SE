package Collections.Set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);


        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }

        HashSet<ArrayList<Integer>> set = new HashSet<>();

        // create ArrayList list1
        ArrayList<Integer> list1 = new ArrayList<>();

        // create ArrayList list2
        ArrayList<Integer> list2 = new ArrayList<>();

        // Add elements using add method
        list1.add(1);
        list1.add(2);
        list1.add(5);
        list1.add(4);
        list1.add(8);
        list1.add(-2);
        list2.add(1);
        list2.add(2);
        list2.add(5);
        list2.add(4);
        list2.add(8);
        list2.add(-2);
        set.add(list1);
        set.add(list2);

        // print the set size to understand the
        // internal storage of ArrayList in Set
        for (ArrayList<Integer> listas:set) {
            System.out.println(listas + " ");
        }
        System.out.println(set.size());

        HashSet<String> h = new HashSet<String>();

        // Adding elements into HashSet
        // using add() method
        h.add("India");
        h.add("Australia");
        h.add("South Africa");

        // Adding duplicate elements
        h.add("India");

        // Displaying the HashSet
        System.out.println(h);
        System.out.println("List contains India and/or not:"
                + h.contains("India"));

        // Removing items from HashSet using remove() method
        h.remove("Australia");
        System.out.println("List after removing Australia:" + h);

        // Display message
        System.out.println("Iterating over list:");

        // Iterating over hashSet items
        Iterator<String> i = h.iterator();

        // Holds true till there is single element remaining
        while (i.hasNext())

            // Iterating over elements using next() method
            System.out.println(i.next());

    }
}
