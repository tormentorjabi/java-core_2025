package lr5;

import java.util.ArrayList;
import java.util.List;

public class Example9 {
    public static List<String> filterOnlyLetters(List<String> input) {
        List<String> result = new ArrayList<>();
        for (String str : input) {
            if (str.matches("[а-яА-ЯёЁ]+")) {
                result.add(str);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of("Работа14", "Учеба!;!ЦЫ", "Дом", "Док");

        List<String> filtered = filterOnlyLetters(words);
        System.out.println(filtered);
    }
}
