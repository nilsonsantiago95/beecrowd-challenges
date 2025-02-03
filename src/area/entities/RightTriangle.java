package area.entities;

public class RightTriangle extends GeometricShape {

    private Double base;
    private Double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return "TRIÂNGULO: " + String.format("%.3f", area());
    }

}
