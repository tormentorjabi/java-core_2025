package timus.Timus_1820;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        if (k > n) {
            System.out.println(2);
        } else {
            if ((2 * n) % k >= 1) {
                System.out.println((2 * n) / k + 1);
            } else {
                System.out.println((2 * n) / k);
            }
        }
    }
}
