package thebloez.research.generic;

public class GenericMethod {

    public <T> int countNonStatic(T[] array){
        return array.length;
    }

    public static <T> int countStatic(T[] array){
        return array.length;
    }
}
