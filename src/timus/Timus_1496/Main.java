package timus.Timus_1496;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        Map<String, Integer> submissions = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String teamName = in.nextLine();
            submissions.put(teamName, submissions.getOrDefault(teamName, 0) + 1);
        }

        for (String team : submissions.keySet()) {
            if (submissions.get(team) > 1) {
                System.out.println(team);
            }
        }
    }
}
