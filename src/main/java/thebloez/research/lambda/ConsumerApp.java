package thebloez.research.lambda;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {
        Consumer<String> consumerWOLambda = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumerWOLambda.accept("From Anon Class");

        Consumer<String> consumerWithLambda = s -> System.out.println(s);
        consumerWithLambda.accept("Hello From Consumer Lambda");

        Consumer<String> consumerWithLambda2 = System.out::println;
        consumerWithLambda2.accept("Hello From Consumer Lambda - 2");
    }
}
