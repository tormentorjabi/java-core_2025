package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите сколько вам полных лет: ");
        int age = in.nextInt();

        System.out.print("Вы родились в: " + (Year.now().getValue() - age));
        in.close();
    }
}
