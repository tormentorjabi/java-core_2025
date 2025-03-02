package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Введите Ваше имя: ");
        name = in.nextLine();

        System.out.print("Введите Ваш возраст: ");
        age = in.nextInt();

        System.out.printf("Вас зовут: %s, Ваш возраст: %s", name, age);
        in.close();
    }
}
