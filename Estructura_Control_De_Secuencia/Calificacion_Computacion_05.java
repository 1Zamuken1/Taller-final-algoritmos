/*
Un alumno desea saber cuál será su calificación final en la materia de computación. Dicha calificación
se compone de los siguientes porcentajes: 55% del promedio de sus tres calificaciones parciales,
30% de la calificación del examen final y 15% de la calificación de un trabajo final.
*/

package Estructura_Control_De_Secuencia;
import java.util.Scanner;

public class Calificacion_Computacion_05 {
    public static void ejecutar(Scanner calificacion) {
        Float calificacion_1, calificacion_2, calificacion_3, promedio_calificacion,
                examen_final,
                calificacion_trabajo_final, calificacion_final;

        System.out.println("Programa que calcula su calificación final de la materia de computación");
        System.out.println("Ingrese sus tres calificaciones parciales");
        System.out.println("Por favor ingrese su calificación número 1:");
        calificacion_1 = calificacion.nextFloat();
        System.out.println("Por favor ingrese su calificación número 2:");
        calificacion_2 = calificacion.nextFloat();
        System.out.println("Por favor ingrese su calificación número 3:");
        calificacion_3 = calificacion.nextFloat();
        promedio_calificacion = ((((calificacion_1 + calificacion_2 + calificacion_3) / 3) * 55) / 100);

        System.out.println("Su promedio es de:" + promedio_calificacion);

        System.out.println("Por favor ingrese su nota del examen final");
        examen_final = calificacion.nextFloat();
        examen_final = (examen_final * 30) / 100;

        System.out.println("Por favor ingrese su nota del trabajo final");
        calificacion_trabajo_final = calificacion.nextFloat();
        calificacion_trabajo_final = (calificacion_trabajo_final * 15) / 100;

        calificacion.nextLine();

        calificacion_final = (promedio_calificacion + examen_final + calificacion_trabajo_final);
        System.out.println("Su calificación final es de:" + calificacion_final);
    }
}