package thebloez.research.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class IterableApp {
    public static void main(String[] args) {
        iterable();

        collection();

        System.out.println(Arrays.toString(test()));
    }

    public static int[] test(){
        int[] ints = {4,1,3,7,6,8,5,2,10,9};
        int k = 7;

        List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
        int a = list.get(k-1);
        list.remove(k-1);
        list.add(0, a);

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void iterable(){
        Iterable<String> strings = List.of("Ryan", "Dewi", "Kanaya");

        for (String name : strings) {
            System.out.println(name);
        }
    }

    public static void collection(){
        Collection<Integer>  collection = List.of(1,2,3);

        for (var a : collection) {
            System.out.println(a);
        }
    }
}
