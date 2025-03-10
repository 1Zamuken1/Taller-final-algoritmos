import java.util.Scanner;

public class PVP_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio_Final, precio_PVP, porcentaje_Descuento;

        System.out.print("Por favor ingrese el precio de venta al público (PVP): ");
        precio_PVP = scanner.nextDouble();

        System.out.print("Por favor ingrese el precio final pagado: ");
        precio_Final = scanner.nextDouble();
        scanner.close();

        porcentaje_Descuento = ((precio_PVP - precio_Final) / precio_PVP) * 100;

        System.out.println("===== CÁLCULO DE DESCUENTO =====");
        System.out.println("Precio de venta al público (PVP): $" + precio_PVP);
        System.out.println("Precio final pagado: $" + precio_Final);
        System.out.println("Descuento aplicado: " + String.format("%.2f", porcentaje_Descuento) + "%");

    }
}
