package thebloez.research.generic;

public class Generic {
    public static void main(String[] args) {
        Data<Integer> testInt = new Data<Integer>(1);
        Data<String> setString = new Data<String>("");
        setString.setData("Tes String");
        System.out.println(testInt.getData());
        System.out.println(setString.getData());

        /*
        *  Multiple Generic Parameter di Class
        * */
        MultipleGeneric<String, Integer> multiple1 = new MultipleGeneric<String, Integer>();
        multiple1.setEntity(20);
        multiple1.setType("Type1");
        System.out.println(multiple1.toString());

        /*
         *  Generic Parameter di Method
         * */
        String[] names = {"Ryan", "Dewi", "Kanaya"};
        Integer[] values = {1,2,3,4,5,6,7};
        System.out.println(GenericMethod.countStatic(names));
        System.out.println(new GenericMethod().countNonStatic(values));
    }
}
