package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите Вашу фамилию: ");
        String surname = in.next();

        System.out.print("Введите Ваше имя: ");
        String name = in.next();

        System.out.print("Введите Ваше отчество: ");
        String patronymic = in.next();

        System.out.print("Hello " + surname + " " + name + " " + patronymic + "!");
        in.close();
    }
}
