package sphere;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor do raio: ");
        double radius = sc.nextDouble();

        final double PI = 3.14159;

        double bulk = (4.0 / 3) * PI * Math.pow(radius, 3);

        System.out.printf("VOLUME = %.3f%n", bulk);

        sc.close();

    }

}
