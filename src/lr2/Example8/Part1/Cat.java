package lr2.Example8.Part1;

public class Cat extends Animal {

    private String favoriteFood;

    public Cat(String name, int age, String favoriteFood) {
        super(name, age);
        this.favoriteFood = favoriteFood;
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу");
    }

    public void displayFavoriteFood() {
        System.out.println("Любимая еда: " + favoriteFood);
    }
}
