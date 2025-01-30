package salaryWithBonus.application;

import java.util.Locale;
import java.util.Scanner;

import salaryWithBonus.entities.Seller;

public class App {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do vendedor: ");
        String name = sc.nextLine();

        System.out.print("Salario fixo: ");
        double fixedSalary = sc.nextDouble();

        System.out.print("Total de vendas: ");
        double totalSales = sc.nextDouble();

        Seller seller = new Seller(name, fixedSalary, totalSales);

        System.out.printf("TOTAL = R$ %.2f%n", seller.totalSalary());

        sc.close();

    }

}
