package thebloez.research.lambda;

import thebloez.research.util.StringUtils;

import java.util.function.Predicate;

public class MethodRefferenceApp {

    public static void main(String[] args) {
        // method reference for static method
        Predicate<String> mustLower = StringUtils::isLowerCase;
        System.out.println(mustLower.test("Ryan Safary Hidayat"));

        MethodRefferenceApp app = new MethodRefferenceApp();
        app.run();
    }

    // method reference for non-static method
    public void run(){
        StringUtils utils = new StringUtils();
        Predicate<String> mustLower = utils::isLower;
        System.out.println(mustLower.test("ryan safary hidayat"));
    }
}
