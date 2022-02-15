package Lab8.Exercise1.LetterB;

import java.util.function.Supplier;

public class MyRandom implements Supplier<Double> {
    @Override
    public Double get() {
        return Math.random();
    }

    public static void main(String[] args) {
        MyRandom random = new MyRandom();
        System.out.println(random.get());
    }
}
