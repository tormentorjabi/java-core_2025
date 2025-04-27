package timus.Timus_1567;

import java.util.*;
public class Main{
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char c [] = s.toCharArray();
        int sum = 0;
        for(int i=0;i<s.length();i++){
            switch(c[i]){
                case 'a':case'd':case 'g':case 'j':case 'm':case 'p':case 's':case 'v':case 'y':case '.':case ' ':sum=sum+1;break;
                case 'b':case'e':case 'h':case 'k':case 'n':case 'q':case 't':case 'w':case 'z':case ',':sum=sum+2;break;
                case 'c':case'f':case 'i':case 'l':case 'o':case 'r':case 'u':case 'x':case '!':sum=sum+3;break;
            }
        }
        System.out.println(sum);
    }
}
