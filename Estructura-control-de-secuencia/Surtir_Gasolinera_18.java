import java.util.Scanner;

public class Surtir_Gasolinera_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double galones_Surtidos, litros_Equivalentes, total_Pagar;
        final double litros_Por_Galon = 3.785;
        final double precio_Por_Litro = 100;

        System.out.print("Por favor ingrese la cantidad de galones surtidos: ");
        galones_Surtidos = scanner.nextDouble();

        scanner.close();

        litros_Equivalentes = galones_Surtidos * litros_Por_Galon;
        total_Pagar = litros_Equivalentes * precio_Por_Litro;

        System.out.println("===== FACTURA DE GASOLINA =====");
        System.out.println("Galones surtidos: " + galones_Surtidos);
        System.out.println("Equivalente en litros: " + String.format("%.2f", litros_Equivalentes));
        System.out.println("Total a pagar: " + String.format("%.2f", total_Pagar) + " Bolívares");
    }
}
