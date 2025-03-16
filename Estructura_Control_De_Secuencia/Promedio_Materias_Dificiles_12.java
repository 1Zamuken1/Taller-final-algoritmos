package Estructura_Control_De_Secuencia;
import java.util.Scanner;

public class Promedio_Materias_Dificiles_12 {
    public static void ejecutar(Scanner scanner) {
        double
        // calificaciones examen matematicas
        tareaM1, tareaM2, tareaM3,
                // calificaciones fisica
                examenFisica, tareaF1, tareaF2,
                // calificaiones quimica
                examenQuimica, tareaQ1, tareaQ2, tareaQ3,
                // promedios tareas
                promedio_tareas_matematica, promedio_tareas_fisica, promedio_tareas_quimica,
                // nota final por materia
                notaFinalMatematica, notaFinalFisica, notaFinalQuimica,
                // promedio general
                promedioGeneral;

        System.out.println("Programa que calcula el promedio de Matemáticas, Física y Química");
        System.out.print("Ingrese la nota del examen de Matemática: ");
        double examenMatematica = scanner.nextDouble();
        System.out.print("Ingrese las 3 notas de tareas de Matemática: ");
        tareaM1 = scanner.nextDouble();
        tareaM2 = scanner.nextDouble();
        tareaM3 = scanner.nextDouble();

        System.out.print("Ingrese la nota del examen de Física: ");
        examenFisica = scanner.nextDouble();
        System.out.print("Ingrese las 2 notas de tareas de Física: ");
        tareaF1 = scanner.nextDouble();
        tareaF2 = scanner.nextDouble();

        System.out.print("Ingrese la nota del examen de Química: ");
        examenQuimica = scanner.nextDouble();
        System.out.print("Ingrese las 3 notas de tareas de Química: ");
        tareaQ1 = scanner.nextDouble();
        tareaQ2 = scanner.nextDouble();
        tareaQ3 = scanner.nextDouble();

        // Calcular promedios de tareas
        promedio_tareas_matematica = (tareaM1 + tareaM2 + tareaM3) / 3;
        promedio_tareas_fisica = (tareaF1 + tareaF2) / 2;
        promedio_tareas_quimica = (tareaQ1 + tareaQ2 + tareaQ3) / 3;

        // Calcular nota final de cada materia
        notaFinalMatematica = ((examenMatematica * 90) / 100) + ((promedio_tareas_matematica * 10) / 100);
        notaFinalFisica = ((examenFisica * 80) / 100) + ((promedio_tareas_fisica * 20) / 100);
        notaFinalQuimica = ((examenQuimica * 85) / 100) + ((promedio_tareas_quimica * 15) / 100);

        // Calcular promedio general
        promedioGeneral = (notaFinalMatematica + notaFinalFisica + notaFinalQuimica) / 3;

        System.out.println("===== RESULTADOS =====");
        System.out.println("Nota final en Matemática: " + notaFinalMatematica);
        System.out.println("Nota final en Física: " + notaFinalFisica);
        System.out.println("Nota final en Química: " + notaFinalQuimica);
        System.out.println("Promedio general: " + promedioGeneral);

        scanner.nextLine();
    }
}
