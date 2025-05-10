package timus.Timus_2012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        int count = 12 - f;
        if(45*count > 4*60){
            System.out.print("NO");
        }
        else {
            System.out.printf("YES");
        }
        in.close();
    }
}
