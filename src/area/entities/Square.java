package area.entities;

public class Square extends GeometricShape {

    private Double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "QUADRADO: " + String.format("%.3f", area());
    }

}
