package area.entities;

public class Rectangle extends GeometricShape {

    public Double base;
    private Double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return base * height;
    }

    @Override
    public String toString() {
        return "RETÂNGULO: " + String.format("%.3f", area());
    }

}
