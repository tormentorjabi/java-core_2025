package lr2.Example8.Part1;

public class Animal {
    protected String name;
    protected int age;

    // Конструктор
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод для издания звука (общий)
    public void makeSound() {
        System.out.println("Животное издаёт звуки");
    }

    // Метод для вывода информации
    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}
