package timus.Timus_1327;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int count = 0;

        for (int i = A; i <= B; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}

