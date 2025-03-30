package lr3;

import java.util.*;

public class timetab3 {

    private static final int ELEMENTS_COUNT = 11000;

    public static void main(String[] args) {

        // Тестирование для ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(i);
        }
        System.out.println("ArrayList:");

        // Время получения элемента по индексу
        long startTime1 = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.get(i);
        }
        long endTime1 = System.nanoTime();
        System.out.println("Время получения элемента по индексу (ArrayList): " + (endTime1 - startTime1) + " нс");

        // Тестирование для ArrayDeque
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayDeque.add(i);
        }
        System.out.println("ArrayDeque:");

        // Время получения элемента по индексу
        long startTime2 = System.nanoTime();
        Integer element;
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            element = (Integer) arrayDeque.toArray()[i];  // Преобразуем в массив, чтобы получить элемент по индексу
        }
        long endTime2 = System.nanoTime();
        System.out.println("Время получения элемента по индексу (ArrayDeque): " + (endTime2 - startTime2) + " нс");

        // Тестирование для SortedMap (TreeMap)
        SortedMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            treeMap.put(i, i);
        }
        System.out.println("SortedMap:");

        // Время получения элемента по индексу
        long startTime3 = System.nanoTime();
        Integer value;
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            value = treeMap.get(i);  // Получаем значение по ключу (индексу)
        }
        long endTime3 = System.nanoTime();
        System.out.println("Время получения элемента по индексу: " + (endTime3 - startTime3) + " нс");
    }
}

