package Lab8.Exercise4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Car");
        words.add("Air");
        words.add("Bag");
        words.add("Clap");

        Main myMain = new Main();
        System.out.println(myMain.countWords(words, 'a', 'b', 3));
    }

    public int countWords(List<String> words, char c, char d, int len) {
        return (int) words.stream()
                .filter(word -> word.contains(c + "") && !word.contains(d + ""))
                .filter(word -> word.length() == len)
                .count();
    }
}
