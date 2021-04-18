package thebloez.research.lambda;

public class SimpleActionApp {
    public static void main(String[] args) {
        // Anon Class umum
        SimpleAction simpleAction = new SimpleAction() {
            @Override
            public String action(String name) {
                return name + " Without lambda";
            }
        };

        // Anon class dengan lambda
        SimpleAction simpleAction1 = (name) -> name + " With lambda";
        SimpleAction simpleAction2 = name -> name + " With Lambda Juga";

        System.out.println(simpleAction.action("Ryan"));
        System.out.println(simpleAction1.action("Ryan"));
        System.out.println(simpleAction2.action("Ryan"));
    }
}
