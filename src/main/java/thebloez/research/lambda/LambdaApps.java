package thebloez.research.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaApps {
    public static void main(String[] args) {
        //printForEach();
        //functionUtil("Bismillah");
        //predicateUtil("Not Blank");
        //supplierUtil("Ryan");
        //contohMethodReferenceStatic();

        // Contoh Non Static MethodReference
        //LambdaApps apps = new LambdaApps();
        //apps.methodReferenceNonStatic();
        contohRemoveIf();
    }

    public static void printForEach(){
        List<String> person = List.of("Ryan", "Dewi", "Kanaya");

        // print dengan for each biasa
        for (String p : person) {
            System.out.println(p);
        }

        // print for each dengan anonymous class
        person.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // print foreach dengan lambda
        person.forEach(s -> System.out.println(s));

        // print foreach dengan lambda dan method reference
        person.forEach(System.out::println);
    }

    public static void functionUtil(String val){
        // Function<Input, Output>
        Function<String, Integer> function = String::length;

        Integer len = function.apply(val);
        System.out.println(len);
    }

    public static void predicateUtil(String val){
        // Predicate<InputType> -> Output boolean
        Predicate<String> predicate = String::isEmpty;
        boolean isBlank = predicate.test(val);
        System.out.println(isBlank);
    }

    public static void supplierUtil(String val){
        Supplier<String> supplier = () -> val;
        String name = supplier.get();

        System.out.println(name);
    }

    public static void contohMethodReferenceStatic(){
        Predicate<String> val = StringUtil::isLowerCase;
        System.out.println(val.test("Ryan"));
        System.out.println(val.test("ryan"));
    }

    // Contoh penggunaan Method Reference static
    public static class StringUtil{
        public static boolean isLowerCase(String value){
            for (char c : value.toCharArray()){
                if (!Character.isLowerCase(c)) return false;
            }
            return true;
        }
    }

    // Contoh penggunaan Method Reference non-static
    public void methodReferenceNonStatic(){
        Predicate<String> val = this::isLowerCase;

        System.out.println(val.test("Ryan"));
        System.out.println(val.test("ryan"));
    }
    public boolean isLowerCase(String val){
        for (char c : val.toCharArray()){
            if (!Character.isLowerCase(c)) return false;
        }
        return true;
    }

    // lamda class Collection removeIf
    public static void contohRemoveIf(){
        List<String> nama = new ArrayList<>(List.of("Ryan", "Safary", "Hidayat"));

        nama.removeIf(s -> s.length() > 5);
        System.out.println(nama);
    }
}
