package area.application;

import java.util.Locale;
import java.util.Scanner;

import area.entities.Circle;
import area.entities.Rectangle;
import area.entities.RightTriangle;
import area.entities.Square;
import area.entities.Trapeze;

public class App {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor A: ");
        double a = sc.nextDouble();

        System.out.print("Valor B: ");
        double b = sc.nextDouble();

        System.out.print("Valor C: ");
        double c = sc.nextDouble();

        System.out.println(new RightTriangle(b, c));
        System.out.println(new Circle(c));
        System.out.println(new Trapeze(a, b, c));
        System.out.println(new Square(b));
        System.out.println(new Rectangle(a, b));

        sc.close();

    }

}   
