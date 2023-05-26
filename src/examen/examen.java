package examen;

import java.util.HashSet;

public class examen {
    public static void main(String[] args) {
        int i = 7;
        char c = 'w';
        System.out.println((i>=6) && (c == 'w'));

        int x = 1;
        while(x <=10) {
            System.out.println(++x);
        }

        int a = 1, b = 2, d = 3, f = 2;
        System.out.println((b >= a) || (d == f));

        System.out.println('j' + 'a' + 'v' + 'a');

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(4);
        set.add(2);
        set.add(null);
        System.out.println(set);
    }
}
