package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите названия дня недели: ");
        String dayString = in.nextLine();

        System.out.print("Введите названия месяца: ");
        String month = in.nextLine();

        System.out.print("Введите число месяца: ");
        int dayInt = in.nextInt();

        System.out.printf("%s, %s, %s", dayString, dayInt, month);
        in.close();
    }
}
