package thebloez.research.generic;

import java.util.Arrays;

public class ComparableApp {

    public static void main(String[] args) {
        Person[] people = {
                new Person("Ryan","Jakarta"),
                new Person("Dewi","Kuningan")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
