package simpleCalculation.appication;

import java.util.Locale;
import java.util.Scanner;

import simpleCalculation.entities.Piece;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Piece[] pieces = new Piece[2];

        for (int i = 0; i < pieces.length; i++) {

            System.out.print("Código da peça: ");
            int code = sc.nextInt();

            System.out.print("Número de peças: ");
            int quantity = sc.nextInt();

            System.out.print("Valor unitário: ");
            double unitValue = sc.nextDouble();

            System.out.println();

            pieces[i] = new Piece(code, quantity, unitValue);

        }

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", pieces[0].totalValue() + pieces[1].totalValue());

        sc.close();

    }

}
