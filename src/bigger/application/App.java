package bigger.application;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int bigger = calcTheBigger(a, b);

        bigger = calcTheBigger(bigger, c);

        System.out.println(bigger + " eh o maior");

        sc.close();

    }

    public static int calcTheBigger(int a, int b) {
        return (a + b + Math.abs(a - b)) / 2;
    }

}
