/*
 * Se conoce de un trabajador su nombre, el número de horas normales trabajadas, el pago de una hora
 *normal y el número de horas extras trabajadas. Además, que, cada hora extra se paga 25% más del
 *valor de una hora normal. Si se deducen al trabajador sobre el sueldo base 5% del paro forzoso, 2%
 *de política habitacional y 7% para caja de ahorro. Si se le asignan 25000 Bolívares por actualización
 *académica, 17300 Bolívares por cada hijo y una prima por hogar de 18000 Bolívares. Calcule y
 *muestre las asignaciones, las deducciones y el sueldo neto del trabajador.
 */
package Estructura_Control_De_Secuencia;
import java.util.Scanner;

public class Salario_Deducibles_11 {
    public static void ejecutar(Scanner scanner) {
        String nombre_trabajador;
        int horas_trabajadas, horas_extra, num_hijos;
        double pago_hora, sueldo_base, sueldo_neto,
                // extras
                pago_extra, total_extras,
                // asignaciones
                asignacion_academica = 25000, prima_hijos, prima_hogar = 18000, total_asignaciones,
                // deducciones
                paro, politica_habitacional, caja, total_deducciones;

        System.out.println("Programa que calcula su sueldo neto con asignaciones y deducciones");
        System.out.println("Por favor ingrese su nombre");
        nombre_trabajador = scanner.next();

        System.out.println("Por favor ingrese el número de horas trabajadas");
        horas_trabajadas = scanner.nextInt();

        System.out.println("Por favor ingrese el pago por hora trabajada");
        pago_hora = scanner.nextDouble();

        System.out.println("Por favor ingrese el número de horas extra trabajadas");
        horas_extra = scanner.nextInt();

        System.out.println("Por favor ingrese el total de hijos");
        num_hijos = scanner.nextInt();

        scanner.nextLine();

        // Sueldo base
        sueldo_base = (horas_trabajadas * pago_hora);

        // Horas extra
        pago_extra = (pago_hora * 25) / 100;
        total_extras = (horas_extra * pago_extra);

        // Asignaciones
        prima_hijos = num_hijos * 17300;
        total_asignaciones = sueldo_base + total_extras + asignacion_academica + prima_hijos + prima_hogar;

        // Deducciones
        paro = (sueldo_base * 5) / 100;
        politica_habitacional = (sueldo_base * 2) / 100;
        caja = (sueldo_base * 7) / 100;
        total_deducciones = paro + politica_habitacional + caja;

        // Sueldo neto
        sueldo_neto = total_asignaciones + total_deducciones;

        System.out.println("\nResumen del Pago:");
        System.out.println("Trabajador: " + nombre_trabajador);
        System.out.println("Sueldo Base: " + sueldo_base);
        System.out.println("Pago por Horas Extras: " + total_extras);
        System.out.println("Asignación Académica: " + asignacion_academica);
        System.out.println("Prima por Hijos: " + prima_hijos);
        System.out.println("Prima por Hogar: " + prima_hogar);
        System.out.println("Total Asignaciones: " + total_asignaciones);
        System.out.println("Deducción Paro Forzoso: " + paro);
        System.out.println("Deducción Política Habitacional: " + politica_habitacional);
        System.out.println("Deducción Caja de Ahorro: " + caja);
        System.out.println("Total Deducciones: " + total_deducciones);
        System.out.println("SUELDO NETO: $" + sueldo_neto);

    }
}
