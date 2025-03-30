package lr3;

import java.util.*;

public class timetab1 {

    private static final int ELEMENTS_COUNT = 11000;

    public static void main(String[] args) {

        // Тестирование для ArrayDeque
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        System.out.println("ArrayDeque:");

        // Время добавления элемента в начало
        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayDeque.addFirst(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Время добавления в начало (ArrayDeque): " + (endTime - startTime) + " нс");

        // Время добавления элемента в конец
        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayDeque.addLast(i);
        }
        endTime = System.nanoTime();
        System.out.println("Время добавления в конец (ArrayDeque): " + (endTime - startTime) + " нс");

        // Время добавления элемента в середину
        startTime = System.nanoTime();
        LinkedList<Integer> list = new LinkedList<>(arrayDeque);
        list.add(ELEMENTS_COUNT / 2, 0);
        endTime = System.nanoTime();
        System.out.println("Время добавления в середину (ArrayDeque): " + (endTime - startTime) + " нс");

        // Тестирование для ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("ArrayList:");

        // Время добавления элемента в начало
        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(0, i);
        }
        endTime = System.nanoTime();
        System.out.println("Время добавления в начало (ArrayList): " + (endTime - startTime) + " нс");

        // Время добавления элемента в конец
        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Время добавления в конец (ArrayList): " + (endTime - startTime) + " нс");

        // Время добавления элемента в середину
        startTime = System.nanoTime();
        arrayList.add(ELEMENTS_COUNT / 2, 0);
        endTime = System.nanoTime();
        System.out.println("Время добавления в середину (ArrayList): " + (endTime - startTime) + " нс");

        // Тестирование для SortedMap (TreeMap)
        SortedMap<Integer, Integer> treeMap = new TreeMap<>();
        System.out.println("SortedMap (TreeMap):");

        // Время добавления элемента в начало
        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            treeMap.put(i, i);
        }
        endTime = System.nanoTime();
        System.out.println("Время добавления в начало (SortedMap): " + (endTime - startTime) + " нс");

        // Время добавления элемента в конец
        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            treeMap.put(i, i);
        }
        endTime = System.nanoTime();
        System.out.println("Время добавления в конец (SortedMap): " + (endTime - startTime) + " нс");


        startTime = System.nanoTime();
        treeMap.put(ELEMENTS_COUNT / 2, 0);
        endTime = System.nanoTime();
        System.out.println("Время добавления в середину (SortedMap): " + (endTime - startTime) + " нс");
    }
}