/*
 * Determine cuánto dinero hay en un banco que contiene N1 billetes de 50000, N2 billetes de 20000,
 * N3 billetes de 10000, N4 billetes de 5000, N5 billetes de 2000, N6 billetes 1000, N7 billetes de 500 y
 * N8 billetes de 100.
 */

package Estructura_Control_De_Secuencia;
import java.util.Scanner;

public class Bancos_N_Billetes_13 {

    public static void ejecutar(Scanner scanner) {
        int n1, n2, n3, n4, n5, n6, n7, n8, total;

        System.out.println("Programa que calcula el dinero basado en a cantidad de billetes");
        System.out.print("Ingrese la cantidad de billetes de 50000: ");
        n1 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 20000: ");
        n2 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 10000: ");
        n3 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 5000: ");
        n4 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 2000: ");
        n5 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 1000: ");
        n6 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 500: ");
        n7 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 100: ");
        n8 = scanner.nextInt();

        scanner.nextLine();

        total = (n1 * 50000) + (n2 * 20000) + (n3 * 10000) + (n4 * 5000) + (n5 * 2000) + (n6 * 1000) + (n7 * 500) + (n8 * 100);
        System.out.println("Total en el banco: " + total + " Bolívares");

    }
}
