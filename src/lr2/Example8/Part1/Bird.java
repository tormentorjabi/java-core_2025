package lr2.Example8.Part1;

public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Чирик");
    }

    public void displayFlightAbility() {
        if (canFly) {
            System.out.println("Может летать");
        } else {
            System.out.println("Летать не может");
        }
    }
}