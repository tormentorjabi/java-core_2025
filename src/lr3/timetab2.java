package lr3;

import java.util.*;

public class timetab2 {

    private static final int ELEMENTS_COUNT = 11000;

    public static void main(String[] args) {

        // Тестирование для ArrayDeque
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayDeque.add(i);
        }
        System.out.println("ArrayDeque:");

        // Время удаления элемента с начала
        long startTime1 = System.nanoTime();
        while (!arrayDeque.isEmpty()) {
            arrayDeque.removeFirst();
        }
        long endTime1 = System.nanoTime();
        System.out.println("Время удаления с начала (ArrayDeque): " + (endTime1 - startTime1) + " нс");

        // Время удаления элемента с конца
        ArrayDeque<Integer> tempDeque = new ArrayDeque<>();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            tempDeque.add(i);
        }
        long startTime2 = System.nanoTime();
        while (!tempDeque.isEmpty()) {
            tempDeque.removeLast();
        }
        long endTime2 = System.nanoTime();
        System.out.println("Время удаления с конца (ArrayDeque): " + (endTime2 - startTime2) + " нс");

        // Время удаления элемента из середины
        ArrayDeque<Integer> tempDeque3 = new ArrayDeque<>(tempDeque);
        long startTime3 = System.nanoTime();
        if (!tempDeque3.isEmpty()) {
            tempDeque3.remove(ELEMENTS_COUNT / 2);  // Удаляем элемент в середине
        }
        long endTime3 = System.nanoTime();
        System.out.println("Время удаления из середины (ArrayDeque): " + (endTime3 - startTime3) + " нс");

        // Тестирование для ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(i);
        }
        System.out.println("ArrayList:");

        // Время удаления элемента с начала
        long startTime4 = System.nanoTime();
        while (!arrayList.isEmpty()) {
            arrayList.remove(0);
        }
        long endTime4 = System.nanoTime();
        System.out.println("Время удаления с начала (ArrayList): " + (endTime4 - startTime4) + " нс");

        // Время удаления элемента с конца
        ArrayList<Integer> tempList = new ArrayList<>(arrayList);
        long startTime5 = System.nanoTime();
        while (!tempList.isEmpty()) {
            tempList.remove(tempList.size() - 1);
        }
        long endTime5 = System.nanoTime();
        System.out.println("Время удаления с конца (ArrayList): " + (endTime5 - startTime5) + " нс");

        // Время удаления элемента из середины
        ArrayList<Integer> tempList2 = new ArrayList<>(arrayList);
        long startTime6 = System.nanoTime();
        if (!tempList2.isEmpty()) {
            tempList2.remove(ELEMENTS_COUNT / 2);  // Удаляем элемент в середине
        }
        long endTime6 = System.nanoTime();
        System.out.println("Время удаления из середины (ArrayList): " + (endTime6 - startTime6) + " нс");

        // Тестирование для SortedMap (TreeMap)
        SortedMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            treeMap.put(i, i);
        }
        System.out.println("SortedMap (TreeMap):");

        // Время удаления элемента с начала
        long startTime7 = System.nanoTime();
        while (!treeMap.isEmpty()) {
            treeMap.remove(treeMap.firstKey());
        }
        long endTime7 = System.nanoTime();
        System.out.println("Время удаления с начала (SortedMap): " + (endTime7 - startTime7) + " нс");

        // Время удаления элемента с конца
        long startTime8 = System.nanoTime();
        if (!treeMap.isEmpty()) {
            treeMap.remove(treeMap.lastKey());
        }
        long endTime8 = System.nanoTime();
        System.out.println("Время удаления с конца (SortedMap): " + (endTime8 - startTime8) + " нс");

        // Время удаления элемента из середины
        long startTime9 = System.nanoTime();
        if (!treeMap.isEmpty()) {
            treeMap.remove(ELEMENTS_COUNT / 2);
        }
        long endTime9 = System.nanoTime();
        System.out.println("Время удаления из середины (SortedMap): " + (endTime9 - startTime9) + " нс");
    }
}