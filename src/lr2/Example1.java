package lr2;

import java.util.Scanner;
import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");

        int size = in.nextInt();
        int[] nums = new int[size];
        Random random = new Random();

        for(int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(1,8);

            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }
        System.out.println(" ");

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < min){
                min = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == min){
                System.out.println("Минимальное занчение "+nums[i]+", имеет индекс "+i+"");
            }
        }
    }
}

