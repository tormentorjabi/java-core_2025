package timus.Timus_1131;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pc = in.nextInt();
        int cabels = in.nextInt();
        int counter = 0;
        int virus = 1;
        while (pc > virus) {
            if (cabels >= virus) {
                virus = virus * 2;
            } else if (cabels < virus) {
                pc = pc - virus;
                double result = (double) pc / cabels;
                counter += (int) Math.ceil(result);
                break;
            }
            counter++;
        }
        System.out.print(counter);
        in.close();
    }
}
