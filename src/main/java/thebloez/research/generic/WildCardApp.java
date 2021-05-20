package thebloez.research.generic;

public class WildCardApp {
    public static void main(String[] args) {
        print(new Data<>("Ini String"));
        print(new Data<>(100));
        print(new Data<>(1000L));
        print(new Data<>(10.23));
    }

    /*
    * Menggunakan simbol ? untuk wildcard
    * */
    public static void print(Data<?> myData){
        System.out.println(myData.getData());
    }
}
