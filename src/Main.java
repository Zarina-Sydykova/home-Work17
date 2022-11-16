import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers of shapes");
        Shape triangle = new Triangle(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        triangle.getPerimeter();
        Shape circle = new Circle(scanner.nextInt(), Math.PI);
        circle.getPerimeter();
        Shape rectangle = new Rectangle(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        rectangle.getPerimeter();
        Shape square = new Square(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        square.getPerimeter();
        Shape parallelogram = new Parallelogram(scanner.nextByte(), scanner.nextByte());
        parallelogram.getPerimeter();



    }
}
