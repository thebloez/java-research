package thebloez.research.lambda;

import java.util.List;
import java.util.function.Consumer;

public class IterableApps {
    public static void main(String[] args) {
        List<String> person = List.of("Ryan", "Dewi", "Kanaya");
        // for loop
        for (String item : person) {
            System.out.println(item);
        }
        // forEach Anon Class
        person.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });
        person.forEach(System.out::print);
    }


}
