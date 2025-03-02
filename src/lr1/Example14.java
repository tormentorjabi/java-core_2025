package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        float num = in.nextFloat();

        System.out.printf(" 1. Число - 1: %s,\n 2. Само число: %s,\n 3. Число + 1: %s,\n 4. Сумма предыдущих чисел в квадрате: %s", num-1, num, num+1, Math.pow((num*3), 2));

        in.close();
    }
}
