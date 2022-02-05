package TaskThree;

import java.io.IOException;
import java.util.Map;

public class NomberWordsTests {
    public static void main(String[] args) throws IOException {
        NumberWords result = new NumberWords ();

        System.out.println("Количество слова: " + result.wordsFile().size());

        result.wordsFile().entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);

    }
}
