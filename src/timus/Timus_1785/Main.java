package timus.Timus_1785;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        in.close();
        if (input >= 1 & input <=4){
            System.out.print("few");
        } else if (input >= 5 & input <= 9) {
            System.out.print("several");
        }
        else if (input >= 10 & input <= 19) {
            System.out.print("pack");
        }
        else if (input >= 20 & input <= 49) {
            System.out.print("lots");
        }
        else if (input >= 50 & input <= 99) {
            System.out.print("horde");
        }
        else if (input >= 100 & input <= 249) {
            System.out.print("throng");
        }
        else if (input >= 250  & input <= 499) {
            System.out.print("swarm");
        }
        else if (input >= 500   & input <= 999) {
            System.out.print("zounds");
        }
        else{
            System.out.print("legion");
        }
    }
}
