package thebloez.research.generic;

public class MultipleConstraintApp {
    public static void main(String[] args) {
        Data<WildBirds> manukGalak = new Data<>(new WildBirds());
        System.out.println(manukGalak.getData());
    }

    public static interface CanASing {
        void sing(String singAlong);
    }

    public static abstract class Animal {

    }

    public static class Birds extends Animal {

    }

    public static class WildBirds extends Birds implements CanASing {
        @Override
        public void sing(String singAlong) {
            System.out.println("Lalala " + singAlong);
        }
    }

    public static class Data<T extends Birds & CanASing>{
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
            this.data.sing("TEST");
        }
    }
}
