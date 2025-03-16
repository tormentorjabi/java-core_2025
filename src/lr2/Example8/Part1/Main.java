package lr2.Example8.Part1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Валли", 8, "Ретривер");
        Cat cat = new Cat("Ева", 6, "Сухой корм");
        Bird bird = new Bird("Чирик", 2, true);

        System.out.println("Собака");
        dog.displayInfo();
        dog.makeSound();
        dog.displayBreed();

        System.out.println("Кошка");
        cat.displayInfo();
        cat.makeSound();
        cat.displayFavoriteFood();

        System.out.println("Птица");
        bird.displayInfo();
        bird.makeSound();
        bird.displayFlightAbility();
    }
}
