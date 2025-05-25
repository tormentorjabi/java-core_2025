package lr7;

import java.io.*;
import java.util.Scanner;

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Example7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите возраст:");
        int age = scanner.nextInt();

        Person person = new Person(name, age);

        try (FileOutputStream fileOut = new FileOutputStream("src/lr7/person.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(person);
            System.out.println("Данные сохранены");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}