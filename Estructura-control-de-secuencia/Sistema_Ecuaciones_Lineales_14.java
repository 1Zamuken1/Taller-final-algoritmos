import java.util.Scanner;

public class Sistema_Ecuaciones_Lineales_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, d, e, f, determinante;

        System.out.print("Ingrese el valor de a: ");
        a = scanner.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        b = scanner.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        c = scanner.nextDouble();
        System.out.print("Ingrese el valor de d: ");
        d = scanner.nextDouble();
        System.out.print("Ingrese el valor de e: ");
        e = scanner.nextDouble();
        System.out.print("Ingrese el valor de f: ");
        f = scanner.nextDouble();
        scanner.close();

        // Calcular el determinante
        determinante = (a * e) - (b * d);

        // Verificar si el sistema tiene solución única
        if (determinante == 0) {
            System.out.println("El sistema no tiene solución única.");
        } else {
            double x = ((c * e) - (b * f)) / determinante;
            double y = ((a * f) - (c * d)) / determinante;

            System.out.println("Valor de X: " + x);
            System.out.println("Valor de Y: " + y);
        }
    }
}
