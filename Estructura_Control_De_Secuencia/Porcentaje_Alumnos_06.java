/*
 Un maestro desea saber qué porcentaje de hombres y qué porcentaje de mujeres hay en un grupo
de estudiantes.
 */
package Estructura_Control_De_Secuencia;
import java.util.Scanner;

public class Porcentaje_Alumnos_06 {
    public static void ejecutar(Scanner scanner) {
        int hombres = 0, mujeres = 0, suma;
        float porcentaje_hombres, porcentaje_mujeres;

        System.out.println("Programa para definir el porcentaje de hombres y mujeres en un grupo");

        System.out.println("Por favor ingrese el número de hombres en el grupo");
        hombres = scanner.nextInt();
        while (hombres == 0) {
            System.out.println("El número no puede ser menor o igual a 0, por favor intente de nuevo");
            hombres = scanner.nextInt();
        }

        System.out.println("Por favor ingrese el número de mujeres en el grupo");
        mujeres = scanner.nextInt();
        while (mujeres == 0) {
            System.out.println("El número no puede ser menor o igual a 0, por favor intente de nuevo");
            mujeres = scanner.nextInt();
        }
        scanner.nextLine();

        suma = hombres + mujeres;
        porcentaje_hombres = (hombres * 100) / suma;
        porcentaje_mujeres = (mujeres * 100) / suma;

        System.out.println(
                "El porcentaje de hombres es de: " + porcentaje_hombres + 
                ", mientras que el de las mujeres es de: "+ porcentaje_mujeres);

    }
}