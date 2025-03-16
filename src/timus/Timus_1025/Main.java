package timus.Timus_1025;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int[] groupSizes = new int[K];
        int[] votesNeeded = new int[K];

        for (int i = 0; i < K; i++) {
            groupSizes[i] = scanner.nextInt();
            votesNeeded[i] = (groupSizes[i] / 2) + 1;
        }

        Arrays.sort(votesNeeded);

        int majorityGroups = (K / 2) + 1;
        int totalVotes = 0;

        for (int i = 0; i < majorityGroups; i++) {
            totalVotes += votesNeeded[i];
        }

        System.out.println(totalVotes);
    }
}
