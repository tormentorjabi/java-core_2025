package timus.Timus_1409;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short garry = in.nextShort();
        short larry = in.nextShort();
        System.out.println((garry+larry-1)-garry);
        System.out.println((garry+larry-1)-larry);
        in.close();
    }
}
