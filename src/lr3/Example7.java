package lr3;

import java.util.Scanner;

public class Example7 {

    public static void main(String[] args) {
        int i = 0;
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        massin(arr, i);
        massout(arr, i);
    }

    public static void massin(int[] arr, int i){
        Scanner in = new Scanner(System.in);
        if(arr.length > i){
            arr[i] = in.nextInt();
            i++;
            massin(arr, i);
        }
    }
    public static void massout(int[] arr, int i){
        if(arr.length > i){
            System.out.println(arr[i]);
            i++;
            massout(arr, i);
        }
    }
}
