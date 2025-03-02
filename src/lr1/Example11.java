package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите Ваше имя: ");
        String name = in.nextLine();

        System.out.print("Введите Ваш год рождения: ");
        int date = in.nextInt();
        int age = Year.now().getValue() - date;

        System.out.printf("%s! Ваш возраст: %s", name, age);
        in.close();
    }
}
