package lr7;

import java.io.*;
import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {

        class Person implements Serializable {
            private static final long serialVersionUID = 1L;
            private String name;
            private int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        Person person = new Person(name, age);
        System.out.println("Создан объект: " + person);

        String filename = "person.dat";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(person);
            System.out.println("Объект сохранен в файл: " + filename);
        } catch (IOException e) {
            System.err.println("Ошибка при сериализации: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Person restoredPerson = (Person) ois.readObject();
            System.out.println("\nОбъект восстановлен из файла:");
            System.out.println("Имя: " + restoredPerson.name);
            System.out.println("Возраст: " + restoredPerson.age);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка при десериализации: " + e.getMessage());
        }
    }
}
