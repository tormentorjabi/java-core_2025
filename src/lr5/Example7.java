package lr5;

import java.util.ArrayList;
import java.util.List;

public class Example7 {
    public static List<String> filterByLength(List<String> input, int minLength) {
        List<String> result = new ArrayList<>();
        for (String str : input) {
            if (str.length() > minLength) {
                result.add(str);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of("Работа", "Учеба", "Дом", "Док");
        int minLength = 4;

        List<String> filtered = filterByLength(words, minLength);
        System.out.println(filtered);
    }
}