/*
 Dada una cantidad en metros, se requiere que la convierta a pies y pulgadas, considerando lo
siguiente: 1 metro = 39.27 pulgadas; 1 pie = 12 pulgadas.
 */
package Estructura_Control_De_Secuencia;
import java.util.Scanner;

public class Conversor_metros_pies_pulgadas_07 {
    public static void ejecutar(Scanner scanner) {
        double metros, pies, pulgadas;

        System.out.println("Programa que convierte metros a pies y pulgadas");
        System.out.println("Por favor ingrese los metros a convertir");
        metros = scanner.nextFloat();
        scanner.nextLine();

        pulgadas = (metros * 39.27);
        pies = (metros * 12);

        System.out.println("La conversión es de: \n Pulgadas: "+pulgadas+"\n    Pies: "+pies);
    }
}
