package lr2;

import java.util.Scanner;
import java.util.Random;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");

        int vert = in.nextInt();
        int horz = in.nextInt();
        int[][] nums = new int[vert][horz];
        Random random = new Random();
        boolean  counter =  true;

        for(int i = 0; i < vert; i++){
            if (counter){
                for (int j = 0; j < horz; j++) {
                    nums[i][j] = random.nextInt(1,8);
                    System.out.println("Элемент массива ["+i+"]["+j+"] = " + nums[i][j]);
                }
                counter = false;
            }
            else {
                for (int j = horz-1; j >= 0; j--) {
                    nums[i][j] = random.nextInt(1,8);
                    System.out.println("Элемент массива ["+i+"]["+j+"] = " + nums[i][j]);
                }
                counter = true;
            }
        }
    }
}