package timus.Timus_1545;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        String[] dictionary = new String[N];

        for (int i = 0; i < N; i++) {
            dictionary[i] = sc.nextLine();
        }

        char letter = sc.nextLine().charAt(0);

        for (String symbol : dictionary) {
            if (symbol.charAt(0) == letter) {
                System.out.println(symbol);
            }
        }
    }
}
