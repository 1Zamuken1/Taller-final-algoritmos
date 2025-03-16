package Estructura_Control_De_Secuencia;
import java.util.Scanner;

public class Recargo_Computador_22 {
    public static void ejecutar(Scanner scanner) {
        double P, T, precioCuotas, recargo;

        System.out.print("Ingrese el precio de contado del computador (P): ");
        P = scanner.nextDouble();

        System.out.print("Ingrese el monto de cada cuota mensual (T): ");
        T = scanner.nextDouble();

        scanner.nextLine();

        precioCuotas = T * 12;
        recargo = ((precioCuotas - P) / P) * 100;
        
        System.out.println("===== RESULTADO =====");
        System.out.printf("Porcentaje de recargo por pago en cuotas: %.2f%%\n", recargo);
    }
}

