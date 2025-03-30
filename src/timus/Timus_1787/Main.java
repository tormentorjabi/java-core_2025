package timus.Timus_1787;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            counter += in.nextInt() - k;
            if (counter < 0){
                counter = 0;
            }
        }
        System.out.print(counter);
        in.close();
    }
}