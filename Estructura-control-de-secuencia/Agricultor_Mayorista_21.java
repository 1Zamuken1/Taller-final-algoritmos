import java.util.Scanner;

public class Agricultor_Mayorista_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X;
        double Y, K, costoCompra, porcentajeGanancia;

        System.out.print("Ingrese la cantidad de naranjas: ");
        X = scanner.nextInt();

        System.out.print("Ingrese el precio por docena: ");
        Y = scanner.nextDouble();

        System.out.print("Ingrese el total de ingresos obtenidos: ");
        K = scanner.nextDouble();

        scanner.close();

        costoCompra = (X / 12.0) * Y;
        porcentajeGanancia = ((K - costoCompra) / costoCompra) * 100;

        System.out.println("===== RESULTADO =====");
        System.out.printf("Porcentaje de ganancia: %.2f%%\n", porcentajeGanancia);
    }
}
