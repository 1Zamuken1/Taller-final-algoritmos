import java.util.Scanner;

public class Mes_Luz_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lecturaAnterior, lecturaActual, costoKilovatio, consumo, montoTotal;

        System.out.print("Por favor ingrese la lectura anterior del medidor: ");
        lecturaAnterior = scanner.nextDouble();

        System.out.print("Por favor ingrese la lectura actual del medidor: ");
        lecturaActual = scanner.nextDouble();

        System.out.print("Por favor ingrese el costo por kilovatio: ");
        costoKilovatio = scanner.nextDouble();
        scanner.close();

        consumo = lecturaActual - lecturaAnterior;
        montoTotal = consumo * costoKilovatio;

        System.out.println("===== FACTURA DE LUZ =====");
        System.out.println("Consumo del mes: " + consumo + " kW");
        System.out.println("Monto total a pagar: " + montoTotal + " Bolívares");

    }
}
