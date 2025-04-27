package lr5;

import java.util.ArrayList;
import java.util.List;

public class Example5 {
    public static List<String> filterBySubstring(List<String> input, String substring) {
        List<String> result = new ArrayList<>();
        for (String str : input) {
            if (str.contains(substring)) {
                result.add(str);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> input = List.of("Работа", "Учеба", "Дом", "Док");
        String substring = "До";

        List<String> filtered = filterBySubstring(input, substring);
        System.out.println(filtered);
    }
}
