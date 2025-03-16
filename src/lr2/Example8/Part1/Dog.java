package lr2.Example8.Part1;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Гав");
    }

    public void displayBreed() {
        System.out.println("Порода: " + breed);
    }
}
