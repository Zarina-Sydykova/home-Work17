public class Circle extends Shape {
    private int a;
    private double PI;

    public Circle(int a, double PI) {
        this.a = a;
        this.PI = PI;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "a=" + a +
                ", PI=" + PI +
                '}';
    }

    @Override
    public void getPerimeter() {
        double b = 2 * a * PI;
        System.out.println("Circumference of a circle: "+b);

    }
}
