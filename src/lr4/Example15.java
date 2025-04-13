package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mass[] = new int[5];
        int counter = 0;
        int mid = 0;
        try{
            for (int i = 0; i < 5; i++) {
                mass[i] = in.nextInt();
                if (mass[i] > 0){
                    counter++;
                    mid += mass[i];
                }
            }
            System.out.print(mid/counter);
        }
        catch (InputMismatchException e){
            System.out.println("Неверный формат ввода: " + e);
        }
        catch (ArithmeticException e){
            System.out.println("Положительные числа отсутствуют: " + e);
        }
        in.close();
    }
}
