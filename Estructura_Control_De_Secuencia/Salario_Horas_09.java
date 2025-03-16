/*
 Calcular el salario neto de un trabajador en función del número de horas trabajadas, el precio de la
hora y considerando un descuento fijo al sueldo base por concepto de impuestos del 20%.
 */
package Estructura_Control_De_Secuencia;
import java.util.Scanner;

public class Salario_Horas_09 {
    public static void ejecutar(Scanner scanner) {
        double horas_trabajadas, precio_hora, impuesto, salario_neto;

        System.out.println("Programa que calcula su salario neto en base a horas trabajadas y el precio de la hora");
        System.out.print("Por favor ingrese el número de horas trabajadas: ");
        horas_trabajadas = scanner.nextDouble();

        System.out.print("Por favor ingrese el precio de la hora de trabajo: ");
        precio_hora = scanner.nextDouble();

        scanner.nextLine();

        salario_neto = (horas_trabajadas * precio_hora);
        impuesto = (salario_neto * 20) / 100;
        salario_neto = (salario_neto - impuesto);

        System.out.print("Su salario neto es de: $" + salario_neto);
    }
}
