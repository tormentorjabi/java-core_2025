package timus.Timus_1068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        in.close();
        int sum = 0;
        if (input < 0){
            while (input <= 1){
                sum += input;
                input++;
            }
        }
        else if (input > 1) {
            while (input >= 1){
                sum += input;
                input--;
            }
        }
        else{
            sum = 1;
        }
        System.out.print(sum);
    }
}
