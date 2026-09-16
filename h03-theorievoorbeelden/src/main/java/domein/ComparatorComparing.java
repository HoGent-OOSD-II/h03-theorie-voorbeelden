package domein;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorComparing {
    public static void main(String args[]) 
    {
        List<String> strings = new ArrayList<>();

        strings.add("citroen");
        strings.add("atoom");
        strings.add("bokkewagen");

        // Sorteer strings lexicografisch met String.compareTo
        // als comparator
        strings.sort(String::compareTo);

        for(String s : strings) {
            System.out.println(s);
            /*
            atoom
            bokkewagen
            citroen
             */
        }

        // Sorteer strings met een comparator die hun
        // lengtes vergelijkt
        strings.sort(Comparator.comparing(String::length));

        for(String s : strings) {
            System.out.println(s);
            /*
            atoom
            citroen
            bokkewagen
             */
        }
    }
}
