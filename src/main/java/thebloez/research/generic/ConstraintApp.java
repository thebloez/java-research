package thebloez.research.generic;

public class ConstraintApp {
    public static void main(String[] args) {
        NumberData<Integer> data1 = new NumberData<>(2);


    }

    public static class NumberData<T extends Number>{
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }


    }
}
