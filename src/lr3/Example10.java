package lr3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество человек: ");
        int N = in.nextInt();
        in.close();

        // ArrayList
        ArrayList<Integer> peopleArrayList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            peopleArrayList.add(i);
        }

        long startTimeArrayList = System.nanoTime();
        int indexArrayList = 0;
        while (peopleArrayList.size() > 1) {
            indexArrayList = (indexArrayList + 1) % peopleArrayList.size();
            peopleArrayList.remove(indexArrayList);
        }
        long endTimeArrayList = System.nanoTime();

        // LinkedList
        LinkedList<Integer> peopleLinkedList = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            peopleLinkedList.add(i);
        }

        long startTimeLinkedList = System.nanoTime();
        int indexLinkedList = 0;
        while (peopleLinkedList.size() > 1) {
            indexLinkedList = (indexLinkedList + 1) % peopleLinkedList.size();
            peopleLinkedList.remove(indexLinkedList);
        }
        long endTimeLinkedList = System.nanoTime();

        System.out.println("ArrayList");
        System.out.println("Человек осталось: " + peopleArrayList.get(0));
        System.out.println("Время выполнения: " + (endTimeArrayList - startTimeArrayList));

        System.out.println("LinkedList:");
        System.out.println("Человек осталось: " + peopleLinkedList.get(0));
        System.out.println("Время выполнения: " + (endTimeLinkedList - startTimeLinkedList));
    }
}

