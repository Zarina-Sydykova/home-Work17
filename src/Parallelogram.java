public class Parallelogram extends Shape {
    private byte a;
    private byte b;

    public Parallelogram(byte a, byte b) {
        this.a = a;
        this.b = b;
    }

    public byte getA() {
        return a;
    }

    public void setA(byte a) {
        this.a = a;
    }

    public byte getB() {
        return b;
    }

    public void setB(byte b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public void getPerimeter() {
        int c = 2*(a+b);
        System.out.println("Perimeter of a parallelogram: "+c);

    }
}
