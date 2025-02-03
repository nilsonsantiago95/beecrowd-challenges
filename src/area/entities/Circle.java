package area.entities;

public class Circle extends GeometricShape {

    private final Double PI = 3.14159;
    private Double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "CÍRCULO: " + String.format("%.3f", area());
    }

}
