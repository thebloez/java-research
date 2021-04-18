package thebloez.research.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateApp {

    public static void main(String[] args) {
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isEmpty();
            }
        };

        Predicate<String> predicateWithLambda = String::isEmpty;
        Predicate<String> predicateWithLambda2 = s -> s.isEmpty();

        System.out.println(predicate.test(""));
        System.out.println(predicateWithLambda.test(""));
        System.out.println(predicateWithLambda2.test(""));


        // test
        List<Integer> integerList = new ArrayList<>();
        for (int i = 4; i < 10; i++){
           integerList.add(i);
        }

        Predicate<List<Integer>> anyEven = list -> {
            for (Integer integer : list) {
                if (integer % 2 == 0) return true;
            }
            return false;
        };

        Predicate<List<Integer>> anyOdds = list -> {
            for (Integer integer : list) {
                if (integer % 2 != 0) return true;
            }
            return false;
        };

        System.out.println(anyEven.test(integerList));
        System.out.println(anyOdds.test(integerList));
    }
}