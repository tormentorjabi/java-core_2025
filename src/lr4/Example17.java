package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte mass[] = new byte[5];
        int sum = 0;
        try{
            for (int i = 0; i < 5; i++) {
                mass[i] = in.nextByte();
                sum += mass[i];
            }
        }
        catch (InputMismatchException e){
            System.out.println("Неверный формат ввода: " + e);
        }
        System.out.println("Сумма элементов массива: " + sum);
        in.close();
    }
}
