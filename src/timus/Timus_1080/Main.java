package timus.Timus_1080;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) graph.add(new ArrayList<>());

        for (int i = 1; i <= N; i++) {
            String line = sc.nextLine().trim();
            if (line.equals("0")) continue;

            String[] parts = line.split(" ");
            for (String p : parts) {
                int neigh = Integer.parseInt(p);
                if (neigh == 0) break;
                graph.get(i).add(neigh);
                graph.get(neigh).add(i);
            }
        }

        int[] color = new int[N + 1];
        Arrays.fill(color, -1);
        color[1] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);

        boolean possible = true;

        while (!queue.isEmpty() && possible) {
            int u = queue.poll();
            for (int v : graph.get(u)) {
                if (color[v] == -1) {
                    color[v] = 1 - color[u];
                    queue.add(v);
                } else if (color[v] == color[u]) {
                    possible = false;
                    break;
                }
            }
        }

        if (!possible) {
            System.out.println(-1);
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= N; i++) {
                sb.append(color[i]);
            }
            System.out.println(sb);
        }
        sc.close();
    }
}

