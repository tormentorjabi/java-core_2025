package timus.Timus_1083;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        sc.close();

        String[] parts = line.split(" ");
        int n = Integer.parseInt(parts[0]);
        int k = parts[1].length();

        int mod = n % k;
        int start = n;
        int end = (mod == 0) ? k : mod;

        long result = 1;
        for (int i = start; i >= end; i -= k) {
            result *= i;
        }

        System.out.println(result);
    }
}
