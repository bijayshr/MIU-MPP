package Lab8.Exercise1.LetterB;

import java.util.function.Supplier;

public class Part2 {
    public static void main(String[] args) {
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println(randomNumber.get());
//        Supplier<Double> randomNumber = Math::random;
//        System.out.println(randomNumber.get());
    }
}
