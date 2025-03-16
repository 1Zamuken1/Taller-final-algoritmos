package Estructura_Control_De_Secuencia;
import java.util.Scanner;

public class Presupuesto_Hospital_19 {
    public static void ejecutar(Scanner scanner) {

        System.out.print("Por favor ingrese el monto total del presupuesto anual: ");
        double presupuesto_Total = scanner.nextDouble();

        scanner.nextLine();

        final double porcentaje_Ginecologia = 0.40;
        final double porcentaje_Traumatologia = 0.30;
        final double porcentaje_Pediatria = 0.30;

        double monto_Ginecologia = presupuesto_Total * porcentaje_Ginecologia;
        double monto_Traumatologia = presupuesto_Total * porcentaje_Traumatologia;
        double monto_Pediatria = presupuesto_Total * porcentaje_Pediatria;

        System.out.println("Distribución del presupuesto:");
        System.out.println("Ginecología: " + monto_Ginecologia + " bolívares");
        System.out.println("Traumatología: " + monto_Traumatologia + " bolívares");
        System.out.println("Pediatría: " + monto_Pediatria + " bolívares");
    }
}
