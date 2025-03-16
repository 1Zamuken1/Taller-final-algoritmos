
/*
 Obtener el promedio de edad de tres personas.
 */
package Estructura_Control_De_Secuencia;
import java.util.Scanner;

public class obtener_edades_01 {
    public static void ejecutar(Scanner edades) {
        int edad_f = 0, edad1, edad2, edad3;

        System.out.println("Programa que suma 3 edades");
        System.out.println("Ingrese la edad del primer usuario");
        edad1 = edades.nextInt();

        System.out.println("Ingrese la edad del segundo usuario");
        edad2 = edades.nextInt();

        System.out.println("Ingrese la edad del tercer usuario");
        edad3 = edades.nextInt();

        edad_f = edad1 + edad2 + edad3;
        System.out.println("La suma de las 3 edades ingresadas es de:" + edad_f);

        edades.nextLine();
    }
}