package lr6;

import java.util.concurrent.ThreadLocalRandom;
public class Example6 {

    private static int[] a;
    private static int[] sumValues;
    private static int numThreads;

    public static void main(String[] args) throws InterruptedException {

        a = new int[64];
        for (int i = 0; i < a.length; i++) {
            a[i] = ThreadLocalRandom.current().nextInt(-400, 400);
        }

        numThreads = Runtime.getRuntime().availableProcessors();
        sumValues = new int[numThreads];

        Thread[] threads = new Thread[numThreads];
        int chunkSize = a.length / numThreads;

        for (int i = 0; i < numThreads; i++) {
            final int start = i * chunkSize;
            final int end = (i == numThreads - 1)? a.length : (i + 1) * chunkSize;
            final int index = i;
            threads[i] = new Thread(() -> {
                int sum = 0;
                for (int j = start; j < end; j++) {
                    sum += a[j];
                }
                synchronized (Example5.class) {
                    sumValues[index] = sum;
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        int sum = 0;
        for (int i = 0; i < numThreads; i++) {
            sum += sumValues[i];
        }

        System.out.println("Сумма: " + sum);
    }
}
