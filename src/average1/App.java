package average1;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        double firstGrade = sc.nextDouble();

        System.out.print("Segunda nota: ");
        double secondeGrade = sc.nextDouble();

        double weight1 = 3.5;
        double weight2 = 7.5;

        double average = (firstGrade * weight1 + secondeGrade * weight2) / (weight1 + weight2);

        System.out.printf("MEDIA = %.5f%n", average);

        sc.close();

    }

}
