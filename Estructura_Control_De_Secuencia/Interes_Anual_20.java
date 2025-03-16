package Estructura_Control_De_Secuencia;
import java.util.Scanner;

public class Interes_Anual_20 {
    public static void ejecutar(Scanner scanner) {
        double capital, intereses, razon_Interes;

        System.out.print("Por favor ingrese el monto del préstamo (Capital): ");
        capital = scanner.nextDouble();

        System.out.print("Por favor ingrese el total de intereses pagados: ");
        intereses = scanner.nextDouble();

        scanner.nextLine();

        razon_Interes = (intereses * 100) / (capital * 4);

        System.out.println("===== RESULTADO =====");
        System.out.println("Porcentaje de interés anual: " + String.format("%.2f", razon_Interes) + "%");
    }
}
