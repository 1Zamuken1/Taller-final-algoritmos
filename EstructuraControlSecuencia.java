import java.util.Scanner;

// Interfaz para definir el scanner en todos los ejercicios con método ejecutar()
interface ControlSecuencia {
    void ejecutar(Scanner scanner);
}

/**
 * Ejercicio 1: Obtener el promedio de edad de tres personas.
 */
class Ejercicio1 implements ControlSecuencia {
    @Override // Indica al compilador que este método implementa el método ejecutar()
              // declarado en la interfaz ControlSecuencia
    public void ejecutar(Scanner scanner) {
        int edad1, edad2, edad3;
        double promedio;

        System.out.println("Programa que calcula el promedio de 3 edades");
        System.out.println("Ingrese la edad del primer usuario:");
        edad1 = scanner.nextInt();

        System.out.println("Ingrese la edad del segundo usuario:");
        edad2 = scanner.nextInt();

        System.out.println("Ingrese la edad del tercer usuario:");
        edad3 = scanner.nextInt();

        promedio = (edad1 + edad2 + edad3) / 3.0;

        System.out.println("El promedio de las 3 edades ingresadas es: " + promedio);
        
        scanner.nextLine();
    }

}

/**
 * Suponga que un individuo decide invertir su capital en un banco y desea saber
 * cuánto dinero ganará después de un mes si el banco paga a razón de 2%
 * mensual.
 */
class Ejercicio2 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
        float porcentaje;

        System.out.println("Programa que calcula el 2% de un valor");
        System.out.println("Ingrese la cantidad de dinero invertido");
        float dinero = scanner.nextFloat();

        porcentaje = (dinero * 2) / 100;

        System.out.println("Su pago a razón de 2% mensual es de: $" + porcentaje);

        scanner.nextLine();
    }
}

/**
 * Un vendedor recibe un sueldo base, más un 10% extra por comisiones de sus
 * ventas. El vendedor desea saber cuánto dinero obtendrá por concepto de
 * comisiones por las tres ventas que realizó en el mes y el total que recibirá
 * tomando en cuenta su sueldo base y sus comisiones.
 */
class Ejercicio3 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
        float comision, total;

        System.out.println("Programa que calcula sueldo base más comisión");
        System.out.println("Ingrese el monto de su sueldo base");
        float salario = scanner.nextFloat();

        System.out.println("Ingrese el valor de la primer venta");
        float venta1 = scanner.nextInt();

        System.out.println("Ingrese el valor de la segunda venta");
        float venta2 = scanner.nextFloat();

        System.out.println("Ingrese el valor de la tercer venta");
        float venta3 = scanner.nextFloat();

        comision = ((venta1 + venta2 + venta3) * 10) / 100;
        total = (salario + comision);

        System.out.printf("El total de su pago es de: $" + total);

        scanner.nextLine();
    }
}

/**
 * Una tienda ofrece un descuento del 15% sobre el total de la compra y un
 * cliente desea saber cuánto deberá pagar finalmente por su compra.
 */
class Ejercicio4 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
        float contador_compras = 0, total = 0, descuento = 0;
        String entrada;

        System.out.println("Programa para calcular el 15% de sus compras en la tienda");
        // Ciclo para ingresar productos
        do {
            System.out.println("Ingrese el precio del producto o fin para terminar");
            entrada = scanner.next();

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

        scanner.nextLine();

        descuento = (total * 10) / 100;
        System.out.println("Total de compras: $" + total);
        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Total a pagar: $" + (total - descuento));
    }
}

/**
 * Un alumno desea saber cuál será su calificación final en la materia de
 * computación. Dicha calificación se compone de los siguientes porcentajes: 55%
 * del promedio de sus tres calificaciones parciales, 30% de la calificación del
 * examen final y 15% de la calificación de un trabajo final.
 */
class Ejercicio5 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
        Float calificacion_1, calificacion_2, calificacion_3, promedio_calificacion, examen_final,
                calificacion_trabajo_final, calificacion_final;

        System.out.println("Programa que calcula su calificación final de la materia de computación");
        System.out.println("Ingrese sus tres calificaciones parciales");
        System.out.println("Por favor ingrese su calificación número 1:");
        calificacion_1 = scanner.nextFloat();
        System.out.println("Por favor ingrese su calificación número 2:");
        calificacion_2 = scanner.nextFloat();
        System.out.println("Por favor ingrese su calificación número 3:");
        calificacion_3 = scanner.nextFloat();
        promedio_calificacion = ((((calificacion_1 + calificacion_2 + calificacion_3) / 3) * 55) / 100);

        System.out.println("Su promedio es de:" + promedio_calificacion);

        System.out.println("Por favor ingrese su nota del examen final");
        examen_final = scanner.nextFloat();
        examen_final = (examen_final * 30) / 100;

        System.out.println("Por favor ingrese su nota del trabajo final");
        calificacion_trabajo_final = scanner.nextFloat();
        calificacion_trabajo_final = (calificacion_trabajo_final * 15) / 100;

        scanner.nextLine();

        calificacion_final = (promedio_calificacion + examen_final + calificacion_trabajo_final);
        System.out.println("Su calificación final es de:" + calificacion_final);
    }
}

/**
 * Un maestro desea saber qué porcentaje de hombres y qué porcentaje de mujeres
 * hay en un grupo de estudiantes.
 */
class Ejercicio6 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
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
                "El porcentaje de hombres es de: " + porcentaje_hombres + ", mientras que el de las mujeres es de: "
                        + porcentaje_mujeres);
    }
}

/**
 * Dada una cantidad en metros, se requiere que la convierta a pies y pulgadas,
 * considerando lo siguiente: 1 metro = 39.27 pulgadas; 1 pie = 12 pulgadas.
 */
class Ejercicio7 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
        double metros, pies, pulgadas;

        System.out.println("Programa que convierte metros a pies y pulgadas");
        System.out.println("Por favor ingrese los metros a convertir");
        metros = scanner.nextFloat();
        scanner.nextLine();

        pulgadas = (metros * 39.27);
        pies = (metros * 12);

        System.out.println("La conversión es de: \n Pulgadas: " + pulgadas + "\n    Pies: " + pies);
    }
}

/**
 * Calcule el área de un triángulo en función de las longitudes de sus lados,
 * utilizando la fórmula: √p(p­a)(p­b)(p­c) donde p = (a+b+c) / 2
 */
class Ejercicio8 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
        double lado_a = 0, lado_b = 0, lado_c = 0, perimetro, area;

        System.out.println("Programa que calcula el área de un triángulo");
        System.out.print("Por favor ingrese la longitud del lado A: ");
        lado_a = scanner.nextDouble();

        System.out.print("Por favor ingrese la longitud del lado B: ");
        lado_b = scanner.nextDouble();

        System.out.print("Por favor ingrese la longitud del lado C: ");
        lado_c = scanner.nextDouble();

        scanner.nextLine();

        perimetro = (lado_a + lado_b + lado_c) / 2;
        area = Math.sqrt(perimetro * (perimetro - lado_a) * (perimetro - lado_b) * (perimetro - lado_c));
        System.out.println("El área del triángulo es: " + area);
    }
}

/**
 * Calcular el salario neto de un trabajador en función del número de horas
 * trabajadas, el precio de la hora y considerando un descuento fijo al sueldo
 * base por concepto de impuestos del 20%.
 */
class Ejercicio9 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
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

/**
 * El cambio de divisas en la bolsa de Madrid el 25/08/1987 fue el siguiente:
 * 
 * 100 chelines austríacos = 956.871 pesetas
 * 1 dólar EEUU = 122.499 pesetas
 * 100 dracmas griegos = 88.607 pesetas
 * 100 francos belgas = 323.728 pesetas
 * 1 franco francés = 20.110 pesetas
 * 1 libra esterlina = 178.938 pesetas
 * 100 liras italianas = 9.289 pesetas
 * 
 * Lea una cantidad en chelines austriacos e imprima el equivalente en pesetas.
 * Lea una cantidad en dracmas griegos e imprima su equivalente en francos
 * franceses.
 * Finalmente, lea una cantidad en pesetas e imprima su equivalente en dólares y
 * liras italianas.
 */
class Ejercicio10 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
        int opcion;
        double conversion, chelines, dracmas, pesetas, pesetas_d, pesetas_li;
        char respuesta;

        System.out.println("Programa que calcula la conversión de monedas");
        do {
            System.out.println("╔═══════════════════════════════════════════════════╗");
            System.out.println("║             CONVERSOR DE DIVISAS                  ║");
            System.out.println("╠═══════════════════════════════════════════════════╣");
            System.out.println("║      1. Chelines austriacos a Pesetas             ║");
            System.out.println("║      2. Dracmas Griegos a Francos Franceses       ║");
            System.out.println("║      3. Pesetas a Dólares y Liras Italianas       ║");
            System.out.println("║      4. Salir                                     ║");
            System.out.println("╚═══════════════════════════════════════════════════╝");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("╔══════════════════════════════════╗");
                    System.out.println("║        Chelines a Pesetas        ║");
                    System.out.println("╚══════════════════════════════════╝");
                    System.out.println("Por favor ingrese la cantidad de chelines a convertir");
                    chelines = scanner.nextDouble();

                    conversion = (chelines * 956.871) / 100;
                    System.out.println("La cantidad de pesetas es de: $" + conversion);
                    break;

                case 2:
                    System.out.println("╔══════════════════════════════════╗");
                    System.out.println("║        Dracmas a Francos         ║");
                    System.out.println("╚══════════════════════════════════╝");
                    System.out.println("Por favor ingrese la cantidad de dracmas a convertir");
                    dracmas = scanner.nextDouble();

                    conversion = (dracmas * 88.607) / 100;
                    conversion = (conversion / 20.110);
                    System.out.println("La cantidad de francos es de: $" + conversion);
                    break;

                case 3:
                    System.out.println("╔══════════════════════════════════════════╗");
                    System.out.println("║   Pesetas a Dólares y Liras Italianas    ║");
                    System.out.println("╚══════════════════════════════════════════╝");
                    System.out.println("Por favor ingrese la cantidad de pesetas a convertir");
                    pesetas = scanner.nextDouble();

                    pesetas_d = (pesetas / 122.499);
                    pesetas_li = (pesetas * 100) / 9.289;
                    System.out.println("La cantidad de dólares es de: $" + pesetas_d
                            + "\nLa cantidad de Liras italianas es de: $" + pesetas_li);
                    break;

                case 4:
                    System.out.println("╔═════════════════════════════╗");
                    System.out.println("║  Saliendo del programa...   ║");
                    System.out.println("╚═════════════════════════════╝");
                    break;

                default:
                    System.out.println("¡Opción no válida! Intente de nuevo.\n");
            }

            if (opcion != 4) {
                System.out.print("\n¿Desea realizar otra conversión? (S/N): ");
                respuesta = scanner.next().charAt(0);
                if (respuesta == 'N' || respuesta == 'n') {
                    opcion = 4;
                    System.out.println("╔═════════════════════════════╗");
                    System.out.println("║  Saliendo del programa...   ║");
                    System.out.println("╚═════════════════════════════╝");
                }
            }
        } while (opcion != 4);
        scanner.nextLine();
    }
}

/**
 * Se conoce de un trabajador su nombre, el número de horas normales trabajadas,
 * el pago de una hora normal y el número de horas extras trabajadas. Además,
 * que, cada hora extra se paga 25% más del valor de una hora normal. Si se
 * deducen al trabajador sobre el sueldo base 5% del paro forzoso, 2% de
 * política habitacional y 7% para caja de ahorro. Si se le asignan 25000
 * Bolívares por actualización académica, 17300 Bolívares por cada hijo y una
 * prima por hogar de 18000 Bolívares. Calcule y muestre las asignaciones, las
 * deducciones y el sueldo neto del trabajador.
 */
class Ejercicio11 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
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

/**
 * Calcule y muestre, a un alumno, cuál será su promedio general en las tres
 * materias más difíciles que cursa y cuál será el promedio que obtendrá en cada
 * una de ellas. Estas materias se evalúan como se muestra a continuación:
 * Matemática Examen 90% y 10% del promedio de tres tareas.
 * Física Examen 80% y 20% del promedio de dos tareas.
 * Química Examen 85% y 15% del promedio de tres tareas.
 */
class Ejercicio12 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
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

/**
 * Determine cuánto dinero hay en un banco que contiene N1 billetes de 50000, N2
 * billetes de 20000, N3 billetes de 10000, N4 billetes de 5000, N5 billetes de
 * 2000, N6 billetes 1000, N7 billetes de 500 y N8 billetes de 100.
 */
class Ejercicio13 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
        int n1, n2, n3, n4, n5, n6, n7, n8, total;

        System.out.println("Programa que calcula el dinero basado en a cantidad de billetes");
        System.out.print("Ingrese la cantidad de billetes de 50000: ");
        n1 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 20000: ");
        n2 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 10000: ");
        n3 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 5000: ");
        n4 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 2000: ");
        n5 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 1000: ");
        n6 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 500: ");
        n7 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 100: ");
        n8 = scanner.nextInt();

        scanner.nextLine();

        total = (n1 * 50000) + (n2 * 20000) + (n3 * 10000) + (n4 * 5000) + (n5 * 2000) + (n6 * 1000) + (n7 * 500)
                + (n8 * 100);
        System.out.println("Total en el banco: " + total + " Bolívares");
    }
}

/**
 * El siguiente sistema de ecuaciones lineales:
 * aX + bY = c
 * dX + eY = f
 * 
 * se resuelve con las fórmulas:
 * ce - bf af - cd
 * X = --------- Y = --------- calcule y muestre el valor de X e Y.
 * ae – bd ae – bd
 */
class Ejercicio14 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
        double a, b, c, d, e, f, determinante;

        System.out.print("Ingrese el valor de a: ");
        a = scanner.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        b = scanner.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        c = scanner.nextDouble();
        System.out.print("Ingrese el valor de d: ");
        d = scanner.nextDouble();
        System.out.print("Ingrese el valor de e: ");
        e = scanner.nextDouble();
        System.out.print("Ingrese el valor de f: ");
        f = scanner.nextDouble();
        scanner.nextLine();

        // Calcular el determinante
        determinante = (a * e) - (b * d);

        // Verificar si el sistema tiene solución única
        if (determinante == 0) {
            System.out.println("El sistema no tiene solución única.");
        } else {
            double x = ((c * e) - (b * f)) / determinante;
            double y = ((a * f) - (c * d)) / determinante;

            System.out.println("Valor de X: " + x);
            System.out.println("Valor de Y: " + y);
        }
    }
}

/**
 * Calcular y mostrar el monto total a pagar en un mes de luz eléctrica,
 * teniendo como dato la lectura anterior, la lectura actual y el costo por
 * kilovatio.
 */
class Ejercicio15 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
        double lecturaAnterior, lecturaActual, costoKilovatio, consumo, montoTotal;

        System.out.print("Por favor ingrese la lectura anterior del medidor: ");
        lecturaAnterior = scanner.nextDouble();

        System.out.print("Por favor ingrese la lectura actual del medidor: ");
        lecturaActual = scanner.nextDouble();

        System.out.print("Por favor ingrese el costo por kilovatio: ");
        costoKilovatio = scanner.nextDouble();
        scanner.nextLine();

        consumo = lecturaActual - lecturaAnterior;
        montoTotal = consumo * costoKilovatio;

        System.out.println("===== FACTURA DE LUZ =====");
        System.out.println("Consumo del mes: " + consumo + " kW");
        System.out.println("Monto total a pagar: " + montoTotal + " Bolívares");
    }
}

/**
 * Una empresa X trabaja con láminas de hierro para fabricar una pieza. Se
 * conoce que (a) la lámina mide en promedio 4 metros de largo por 1.5 metros de
 * ancho; (b) la pieza a fabricar consume 0.5 metros en total. Se requiere que
 * calcule y muestre cuántas piezas se fabrican con una lámina y cuánto será el
 * desperdicio.
 */
class Ejercicio16 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
        double largo_Lamina, ancho_Lamina, area_Lamina, area_Pieza, piezas_Fabricadas, desperdicio;

        largo_Lamina = 4.0;
        ancho_Lamina = 1.5;
        area_Lamina = largo_Lamina * ancho_Lamina;
        area_Pieza = 0.5;

        piezas_Fabricadas = Math.floor(area_Lamina / area_Pieza);
        desperdicio = area_Lamina % area_Pieza;

        System.out.println("===== PRODUCCIÓN DE PIEZAS =====");
        System.out.println("Piezas fabricadas por lámina: " + (int) piezas_Fabricadas);
        System.out.println("Desperdicio de material: " + desperdicio + " metros cuadrados");
    }
}

/**
 * Dados como datos el precio final pagado por un producto y su precio de venta
 * al público (PVP), se requiere que calcule y muestre el porcentaje de
 * descuento que le ha sido aplicado.
 */
class Ejercicio17 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
        double precio_Final, precio_PVP, porcentaje_Descuento;

        System.out.print("Por favor ingrese el precio de venta al público (PVP): ");
        precio_PVP = scanner.nextDouble();

        System.out.print("Por favor ingrese el precio final pagado: ");
        precio_Final = scanner.nextDouble();
        scanner.nextLine();

        porcentaje_Descuento = ((precio_PVP - precio_Final) / precio_PVP) * 100;

        System.out.println("===== CÁLCULO DE DESCUENTO =====");
        System.out.println("Precio de venta al público (PVP): $" + precio_PVP);
        System.out.println("Precio final pagado: $" + precio_Final);
        System.out.println("Descuento aplicado: " + String.format("%.2f", porcentaje_Descuento) + "%");
    }
}

/**
 * Resuelva el problema que tienen en una gasolinera. Los surtidores de la misma
 * registran lo que surten en galones, pero el precio de la gasolina está fijado
 * en litros. Se requiere que calcule y muestre lo que hay que cobrarle a un
 * cliente, considerando que: (a) cada galón tiene 3.785 litros; (b) el precio
 * del litro es de 100 Bolívares.
 */
class Ejercicio18 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
        double galones_Surtidos, litros_Equivalentes, total_Pagar;
        final double litros_Por_Galon = 3.785;
        final double precio_Por_Litro = 100;

        System.out.print("Por favor ingrese la cantidad de galones surtidos: ");
        galones_Surtidos = scanner.nextDouble();

        scanner.nextLine();

        litros_Equivalentes = galones_Surtidos * litros_Por_Galon;
        total_Pagar = litros_Equivalentes * precio_Por_Litro;

        System.out.println("===== FACTURA DE GASOLINA =====");
        System.out.println("Galones surtidos: " + galones_Surtidos);
        System.out.println("Equivalente en litros: " + String.format("%.2f", litros_Equivalentes));
        System.out.println("Total a pagar: " + String.format("%.2f", total_Pagar) + " Bolívares");
    }
}

/**
 * En un hospital rural existen tres áreas: Ginecología, Pediatría y
 * Traumatología. El presupuesto anual del hospital se reparte conforme a la
 * siguiente tabla:
 * Área Porcentaje del presupuesto
 * Ginecología 40%
 * Traumatología 30%
 * Pediatría 30%
 * 
 * Obtener la cantidad de dinero que recibirá cada área, para cualquier monto
 * presupuestado.
 */
class Ejercicio19 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
        System.out.print("Por favor ingrese el monto total del presupuesto anual: ");
        double presupuesto_Total = scanner.nextDouble();

        scanner.nextLine();

        final double porcentaje_Ginecologia = 0.40;
        final double porcentaje_Traumatologia = 0.30;
        final double porcentaje_Pediatria = 0.30;

        double monto_Ginecologia = presupuesto_Total * porcentaje_Ginecologia;
        double monto_Traumatologia = presupuesto_Total * porcentaje_Traumatologia;
        double monto_Pediatria = presupuesto_Total * porcentaje_Pediatria;

        System.out.println("Distribución del presupuesto:");
        System.out.println("Ginecología: " + monto_Ginecologia + " bolívares");
        System.out.println("Traumatología: " + monto_Traumatologia + " bolívares");
        System.out.println("Pediatría: " + monto_Pediatria + " bolívares");
    }
}

/**
 * Calcule qué tanto por ciento anual cobraron por un préstamo de Bolívares X,
 * si se pagaron Bolívares Y de intereses en 4 años. La fórmula del interés es:
 * Capital * Tiempo * Razón
 * I = ------------------------------
 * 100
 */
class Ejercicio20 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
        double capital, intereses, razon_Interes;

        System.out.print("Por favor ingrese el monto del préstamo (Capital): ");
        capital = scanner.nextDouble();

        System.out.print("Por favor ingrese el total de intereses pagados: ");
        intereses = scanner.nextDouble();

        scanner.nextLine();

        razon_Interes = (intereses * 100) / (capital * 4);

        System.out.println("===== RESULTADO =====");
        System.out.println("Porcentaje de interés anual: " + String.format("%.2f", razon_Interes) + "%");
    }
}

/**
 * Un mayorista compra a un agricultor un lote de X naranjas a Bs. Y la docena.
 * Después de vender todas las naranjas a los detallistas, obtiene Bs. K.
 * Calcular el porcentaje de ganancia obtenida en la inversión. Pruebe su
 * programa con los siguientes valores: X=48000, Y=6, K=42000 para obtener 75%
 * como resultado.
 */
class Ejercicio21 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
        int X;
        double Y, K, costoCompra, porcentajeGanancia;

        System.out.print("Ingrese la cantidad de naranjas: ");
        X = scanner.nextInt();

        System.out.print("Ingrese el precio por docena: ");
        Y = scanner.nextDouble();

        System.out.print("Ingrese el total de ingresos obtenidos: ");
        K = scanner.nextDouble();

        scanner.nextLine();

        costoCompra = (X / 12.0) * Y;
        porcentajeGanancia = ((K - costoCompra) / costoCompra) * 100;

        System.out.println("===== RESULTADO =====");
        System.out.printf("Porcentaje de ganancia: %.2f%%\n", porcentajeGanancia);
    }
}

/**
 * Un comerciante de computadores ofrece P precio por compra al contado ó 12
 * cuotas de T Bolívares cada una. Desarrolle un programa para calcular y
 * mostrar cuál es el porcentaje que se cobra por el recargo en el pago del
 * computador por cuotas.
 */
class Ejercicio22 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
        double P, T, precioCuotas, recargo;

        System.out.print("Ingrese el precio de contado del computador (P): ");
        P = scanner.nextDouble();

        System.out.print("Ingrese el monto de cada cuota mensual (T): ");
        T = scanner.nextDouble();

        scanner.nextLine();

        precioCuotas = T * 12;
        recargo = ((precioCuotas - P) / P) * 100;

        System.out.println("===== RESULTADO =====");
        System.out.printf("Porcentaje de recargo por pago en cuotas: %.2f%%\n", recargo);
    }
}

/**
 * Suponga que a partir de una Tonelada de maíz una planta productora obtiene M
 * kilogramos de harina y N litros de aceite. La planta vende cada bulto de 24
 * paquetes de un kilogramo de harina en Bs. B1 y cada caja de 15 envases de
 * aceite en Bs. B2. Suponiendo que la planta vende todo lo que produce,
 * calcular el ingreso total por la venta de cada tonelada de maíz, sabiendo
 * además que cada kilogramo de harina y cada litro de aceite que restan del
 * embalaje se venden al detal a los precios de Bs. B3 y Bs. B4 respectivamente.
 * Pruebe su algoritmo o programa con los sig. Valores: M=452, N=197, B1=132,
 * B2= 180, B3= 7,50 y B4= 14,50. Respuesta: 4895
 */
class Ejercicio23 implements ControlSecuencia {
    @Override
    public void ejecutar(Scanner scanner) {
        int M, N, bultos_Harina, harina_Suelta, cajas_Aceite, aceite_Suelto;
        double B1, B2, B3, B4, ingreso_Harina, ingreso_Aceite, ingreso_Total;

        System.out.print("Ingrese la cantidad de kilogramos de harina (M): ");
        M = scanner.nextInt();

        System.out.print("Ingrese la cantidad de litros de aceite (N): ");
        N = scanner.nextInt();

        System.out.print("Ingrese el precio por bulto de harina (B1): ");
        B1 = scanner.nextDouble();

        System.out.print("Ingrese el precio por caja de aceite (B2): ");
        B2 = scanner.nextDouble();

        System.out.print("Ingrese el precio de venta por kilogramo de harina (B3): ");
        B3 = scanner.nextDouble();

        System.out.print("Ingrese el precio de venta por litro de aceite (B4): ");
        B4 = scanner.nextDouble();

        scanner.nextLine();

        // Calcular ingresos por harina
        bultos_Harina = M / 24;
        harina_Suelta = M % 24;
        ingreso_Harina = (bultos_Harina * B1) + (harina_Suelta * B3);

        // Calcular ingresos por aceite
        cajas_Aceite = N / 15;
        aceite_Suelto = N % 15;
        ingreso_Aceite = (cajas_Aceite * B2) + (aceite_Suelto * B4);

        // Calcular ingreso total
        ingreso_Total = ingreso_Harina + ingreso_Aceite;

        System.out.println("===== RESULTADO =====");
        System.out.printf("Ingreso total por tonelada de maíz: %.2f Bs\n", ingreso_Total);
    }
}