package circleArea;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        double raid = sc.nextDouble();

        double area = 3.14159 * Math.pow(raid, 2);

        System.out.printf("A=%.4f%n", area);

        sc.close();

    }

}
