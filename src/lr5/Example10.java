package lr5;

import java.util.ArrayList;
import java.util.List;

public class Example10 {
    public static List<Integer> filterLessThan(List<Integer> input, int threshold) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : input) {
            if (number < threshold) {
                result.add(number);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 5, 8, 13, 21);
        int threshold = 14;

        List<Integer> filtered = filterLessThan(numbers, threshold);
        System.out.println(filtered);
    }
}
