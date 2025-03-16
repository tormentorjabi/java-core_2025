package timus.Timus_1313;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] image = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                image[i][j] = sc.nextInt();
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int j = 0;
            int k = 0;
            k=i;
            while(k >= 0){
                j=i-k;
                result.add(image[k][j]);
                k--;
            }

        }
        for (int i = 1; i < N; i++) {
            int j = 0;
            int k = 0;
            int q = 1;
            k=i;
            while(k < N){
                j = N-q;
                result.add(image[j][k]);
                k++;
                q++;
            }

        }

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

