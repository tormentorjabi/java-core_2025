package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите название месяца: ");
        String month = in.nextLine();

        System.out.print("Введите количество дней: ");
        int days = in.nextInt();

        System.out.printf("В месяце: %s, %s день", month, days);
        in.close();
    }
}
