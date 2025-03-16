
/*
 Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuánto
deberá pagar finalmente por su compra.
 */
package Estructura_Control_De_Secuencia;
import java.util.Scanner;

public class Descuento_Tienda_04 {
    public static void ejecutar(Scanner compras) {
        float contador_compras = 0, total = 0, descuento = 0;
        String entrada;

        System.out.println("Programa para calcular el 15% de sus compras en la tienda");
        // Ciclo para ingresar productos
        do {
            System.out.println("Ingrese el precio del producto o fin para terminar");
            entrada = compras.next();

            // equalsIgnoreCase() compara lo ingresado con lo que hay dentro del paréntesis
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            // Float.parseFloat() convierte lo ingresado en dato tipo float
            try {
                contador_compras = Float.parseFloat(entrada);

                if (contador_compras < 0) {
                    System.out.println("Precio ingresado es negativo, por favor intente de nuevo");
                    continue;
                }
                total += contador_compras;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Ingrese un número o 'fin'.");
            }

        } while (!entrada.equalsIgnoreCase("fin"));

        compras.nextLine();

        descuento = (total * 10) / 100;
        System.out.println("Total de compras: $" + total);
        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Total a pagar: $" + (total - descuento));
    }
}
