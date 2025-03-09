/*
 Dada una cantidad en metros, se requiere que la convierta a pies y pulgadas, considerando lo
siguiente: 1 metro = 39.27 pulgadas; 1 pie = 12 pulgadas.
 */
import java.util.Scanner;

public class Conversor_metros_pies_pulgadas_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double metros, pies, pulgadas;

        System.out.println("Programa que convierte metros a pies y pulgadas");
        System.out.println("Por favor ingrese los metros a convertir");
        metros = scanner.nextFloat();
        scanner.close();

        pulgadas = (metros * 39.27);
        pies = (metros * 12);

        System.out.println("La conversión es de: \n Pulgadas: "+pulgadas+"\n    Pies: "+pies);
    }
}
