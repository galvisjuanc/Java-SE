package Collections.Set.EnumSet;

import java.util.EnumSet;
import java.util.Iterator;

enum Gfg { CODE, LEARN, CONTRIBUTE, QUIZ, MCQ }
enum Game { CRICKET, HOCKEY, TENNIS }

public class EnumSetMain {
    public static void main(String[] args) {
        EnumSet<Gfg> set1;
        EnumSet<Gfg> set2;
        EnumSet<Gfg> set3;
        EnumSet<Gfg> set4;

        // Adding elements
        set1 = EnumSet.of(Gfg.QUIZ, Gfg.CONTRIBUTE,Gfg.LEARN, Gfg.CODE);
        set2 = EnumSet.complementOf(set1);
        set3 = EnumSet.allOf(Gfg.class);
        set4 = EnumSet.range(Gfg.CODE, Gfg.CONTRIBUTE);

        System.out.println("Set 1 --> " + set1);
        System.out.println("Set 2 --> " + set2);
        System.out.println("Set 3 --> " + set3);
        System.out.println("Set 4 --> " + set4);

        // Creating an EnumSet using allOf()
        EnumSet<Game> games = EnumSet.allOf(Game.class);

        // Creating an iterator on games
        Iterator<Game> iterate = games.iterator();

        // Display message
        System.out.print("EnumSet selected:: --> ");

        while (iterate.hasNext()) {

            // Iterating and printing elements to
            // the console using next() method
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        // Creating EnumSet using allOf()
        EnumSet<Game> enumGames = EnumSet.allOf(Game.class);

        // Printing the EnumSet
        System.out.println("EnumSet: " + enumGames);

        // Using remove()
        boolean value1 = enumGames.remove(Game.CRICKET);

        // Printing elements to the console
        System.out.println("Is CRICKET removed? " + value1);

        // Using removeAll() and storing the boolean result
        boolean value2 = games.removeAll(enumGames);

        // Printing elements to the console
        System.out.println("Are all elements removed? "
                + value2);
    }
}
