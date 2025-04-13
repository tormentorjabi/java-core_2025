package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        int mass[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                counter++;
                mass[i][j] = counter;
            }
        }
        try {
            int num = in.nextInt();
            for (int i = 0; i < 3; i++) {
                System.out.println(mass[i][num]);
            }
        }
        catch (InputMismatchException e){
            System.out.println("Ошибка ввода: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Индекс за границей: " + e);
        }
        in.close();
    }
}
