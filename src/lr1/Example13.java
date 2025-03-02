package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите перво число: ");
        float first = in.nextFloat();

        System.out.print("Введите второе число: ");
        float second = in.nextFloat();

        System.out.printf("Результатом сложения чисел %s и %s, является: %s",first, second, first+second);
        in.close();
    }
}
