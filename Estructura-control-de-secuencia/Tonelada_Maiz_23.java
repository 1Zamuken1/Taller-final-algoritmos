import java.util.Scanner;

public class Tonelada_Maiz_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M, N, bultos_Harina, harina_Suelta, cajas_Aceite, aceite_Suelto;
        double B1, B2, B3, B4, ingreso_Harina, ingreso_Aceite, ingreso_Total;

        System.out.print("Ingrese la cantidad de kilogramos de harina (M): ");
        M = scanner.nextInt();
        
        System.out.print("Ingrese la cantidad de litros de aceite (N): ");
        N = scanner.nextInt();
        
        System.out.print("Ingrese el precio por bulto de harina (B1): ");
        B1 = scanner.nextDouble();
        
        System.out.print("Ingrese el precio por caja de aceite (B2): ");
        B2 = scanner.nextDouble();
        
        System.out.print("Ingrese el precio de venta por kilogramo de harina (B3): ");
        B3 = scanner.nextDouble();
        
        System.out.print("Ingrese el precio de venta por litro de aceite (B4): ");
        B4 = scanner.nextDouble();
        
        scanner.close();

        // Calcular ingresos por harina
        bultos_Harina = M / 24;
        harina_Suelta = M % 24;
        ingreso_Harina = (bultos_Harina * B1) + (harina_Suelta * B3);

        // Calcular ingresos por aceite
        cajas_Aceite = N / 15;
        aceite_Suelto = N % 15;
        ingreso_Aceite = (cajas_Aceite * B2) + (aceite_Suelto * B4);

        // Calcular ingreso total
        ingreso_Total = ingreso_Harina + ingreso_Aceite;

        System.out.println("===== RESULTADO =====");
        System.out.printf("Ingreso total por tonelada de maíz: %.2f Bs\n", ingreso_Total);
    }
}
