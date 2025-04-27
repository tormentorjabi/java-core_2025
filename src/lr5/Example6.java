package lr5;

import java.util.ArrayList;
import java.util.List;

public class Example6 {
    public static List<Integer> filterByDivisor(List<Integer> input, int divisor) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : input) {
            if (number % divisor == 0) {
                result.add(number);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 5, 8, 13, 21);
        int divisor = 3;

        List<Integer> filtered = filterByDivisor(numbers, divisor);
        System.out.println(filtered);
    }
}
