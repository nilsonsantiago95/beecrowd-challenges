package difference;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int difference = a * b - c * d;

        System.out.println("DIFERENÇA = " + difference);

        sc.close();

    }

}
