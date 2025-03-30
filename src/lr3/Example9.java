package lr3;

import java.util.HashMap;

public class Example9 {
    public static void main(String[] args) {
        HashMap<Integer, String> qequqeq = new HashMap<Integer, String>();
        qequqeq.put(0, "Anom");
        qequqeq.put(1, "Anomalous Fertilizer");
        qequqeq.put(2, "Anomalous Plant Food");
        qequqeq.put(3, "Antefish Bait");
        qequqeq.put(4, "Antelight Seed");
        qequqeq.put(5, "Anteverse Wheat Seed");
        qequqeq.put(6, "Beehive");
        qequqeq.put(7, "Beeswax");
        qequqeq.put(8, "Blue Antelight Seed");
        qequqeq.put(9, "Greyeb Seed");

        for(Integer i : qequqeq.keySet()) {
            if( i > 5)
                System.out.println(i + ": " + qequqeq.get(i) + " ");
        }

        if (qequqeq.containsKey(0)) {
            System.out.println("Строка с ключем 0: " + qequqeq.get(0));
        }

        int count = 1;
        for (Integer i : qequqeq.keySet()) {
            if (qequqeq.get(i).length() > 5) {
                count *= i;
            }
        }
        System.out.println("Произведение: " + count);
    }
}
