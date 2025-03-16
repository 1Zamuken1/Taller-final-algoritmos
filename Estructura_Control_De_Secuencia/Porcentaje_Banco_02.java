
/*
 Suponga que un individuo decide invertir su capital en un banco y desea saber cuánto dinero ganará
después de un mes si el banco paga a razón de 2% mensual.
 */
package Estructura_Control_De_Secuencia;
import java.util.Scanner;

public class Porcentaje_Banco_02 {
    public static void ejecutar(Scanner capital){
        float porcentaje;

        System.out.println("Programa que calcula el 2% de un valor");
        System.out.println("Ingrese la cantidad de dinero invertido");
        float dinero = capital.nextInt();

        porcentaje = (dinero * 2) / 100;

        System.out.println("Su pago a razón de 2% mensual es de: $" + porcentaje);

        capital.nextLine();

    }
}