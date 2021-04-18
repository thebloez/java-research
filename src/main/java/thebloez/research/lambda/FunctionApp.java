package thebloez.research.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        // Function<Input,Output>
        Function<String, Integer> functionLambda = s -> s.length();
        Function<String, Integer> functionLambda2 = String::length;

        System.out.println(function.apply("Kokomdotcom"));
        System.out.println(functionLambda.apply("Kokomdotcom"));
        System.out.println(functionLambda2.apply("Kokomdotcom"));
        System.out.println("-------------------");

        Function<List<Integer>, List<Integer>> evenOnly = integerList -> {
            for (int i = 0; i < integerList.size(); i++) {
                if (integerList.get(i) % 2 != 0){
                    integerList.remove(i);
                }
            }
            return integerList;
        };

        Integer[] arr = {1,2,3,4,5,6};
        List<Integer> myList = new ArrayList<>(Arrays.asList(arr));


        System.out.println(evenOnly.apply(myList));
    }
}
