package salary.application;

import java.util.Locale;
import java.util.Scanner;

import salary.entities.Employee;

public class App {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Número do funcionário: ");
        int number = sc.nextInt();

        System.out.print("Horas trabalhadas: ");
        int hoursWorked = sc.nextInt();

        System.out.print("Valor por hora: ");
        double valuePerHour = sc.nextDouble();

        Employee employee = new Employee(number, hoursWorked, valuePerHour);

        System.out.println(employee);

        sc.close();

    }

}
