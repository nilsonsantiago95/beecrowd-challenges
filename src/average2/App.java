package average2;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        double firstGrade = sc.nextDouble();

        System.out.print("Segunda nota: ");
        double secondGrade = sc.nextDouble();

        System.out.print("Terceira nota: ");
        double thirdGrade = sc.nextDouble();

        if (firstGrade <= 10.0 && secondGrade <= 10.0 && thirdGrade <= 10.0) {
            double weight1 = 2.0;
            double weight2 = 3.0;
            double weight3 = 5.0;

            double average = (firstGrade * weight1 + secondGrade * weight2 + thirdGrade * weight3) / (weight1 + weight2 + weight3);

            System.out.printf("MEDIA = %.1f%n", average);
        }

        sc.close();

    }

}
