package lr3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        bin(in.nextInt());
        in.close();
    }
    public static void bin(int x){
        int  b = 0;
        if (x > 0){
            if(x % 2 != 0){
                b = 1;
            }
            else
                b = 0;
            bin(x / 2);
            System.out.print(b);
        }
    }
}
