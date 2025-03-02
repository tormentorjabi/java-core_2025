package timus.Timus_1493;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        String p1 = num.substring(0, 3);
        int num1 = Integer.parseInt(p1);

        String p2 = num.substring(3, 6);
        int num2 = Integer.parseInt(p2);

        int sumnum1 = 0;
        while (num1 != 0){
            sumnum1 += num1%10;
            num1 = num1/10;
        }

        int num21 = num2 + 1;
        int sumnum21 = 0;
        while (num21 != 0){
            sumnum21 += num21%10;
            num21 = num21/10;
        }

        num21 = num2 - 1;
        int sumnum22 = 0;
        while (num21 != 0){
            sumnum22 += num21%10;
            num21 = num21/10;
        }

        if(sumnum1 == sumnum21 || sumnum1 == sumnum22)
        {
            System.out.print("Yes");
        }
        else
            System.out.print("No");

        in.close();
    }
}
