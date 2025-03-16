package lr2.Example6;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5.0);
        System.out.println("Круг");
        System.out.println("Радиус: " + circle.getRadius());
        System.out.println("Площадь: " + circle.Area());
        System.out.println("Периметр: " + circle.Perimeter());


        Square square = new Square(4.0);
        System.out.println("Квадрат");
        System.out.println("Сторона: " + square.getSide());
        System.out.println("Площадь: " + square.Area());
        System.out.println("Периметр: " + square.Perimeter());
    }
}