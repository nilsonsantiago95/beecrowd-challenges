package area.entities;

public class Trapeze extends GeometricShape {

    private Double base1;
    private Double base2;
    private Double height;

    public Trapeze(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double area() {
        return ((base1 + base2) * height) / 2;
    }

    @Override
    public String toString() {
        return "TRAPÉZIO: " + String.format("%.3f", area());
    }

}
