import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

interface EstructuraControlDesicion {
    void ejecutar(Scanner scanner);
}

/**
 * Un hombre desea saber cuánto dinero se generará por concepto de intereses
 * sobre la cantidad que tiene en inversión en el banco. El decidirá reinvertir
 * los intereses siempre y cuando éstos excedan a $7000 y en ese caso, desea
 * saber cuánto dinero tendrá finalmente en su cuenta.
 */
class Ejercicio24 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        System.out.print("Ingrese la cantidad inicial de inversión ($): ");
        double cantidadInicial = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasaInteres = scanner.nextDouble() / 100;

        System.out.print("Ingrese el período de tiempo (años): ");
        int tiempo = scanner.nextInt();

        double intereses = cantidadInicial * tasaInteres * tiempo;

        System.out.println("\nIntereses generados: $" + intereses);

        if (intereses > 7000) {
            double cantidadFinal = cantidadInicial + intereses;
            System.out.println("Los intereses exceden los $7000, por lo tanto serán reinvertidos.");
            System.out.println("Cantidad final en la cuenta: $" + cantidadFinal);
        } else {
            System.out.println("Los intereses no exceden los $7000, por lo tanto no serán reinvertidos.");
            System.out.println("La cantidad en la cuenta sigue siendo: $" + cantidadInicial);
        }

        scanner.nextLine();
    }
}

/**
 * Escriba un algoritmo, que dado como dato el sueldo de un trabajador, le
 * aplique un aumento del 15% si su sueldo es inferior a Bs. 40.000 y 12% en
 * caso contrario. Imprima el nuevo sueldo del trabajador.
 */
class Ejercicio25 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        System.out.println("Por favor ingrese su sueldo (sin puntos ni comas)");
        double sueldo = scanner.nextDouble();

        if (sueldo < 40000) {
            System.out.println("Su sueldo es menor a $40.000, por lo que se le aplicará un aumento de 15%");
            double porcentajeSueldo = sueldo * 0.15;
            sueldo = sueldo + porcentajeSueldo;
        } else {
            System.out.println("Su sueldo es mayor o igual a $40.000, por lo que se le aplicará un aumento de 12%");
            double porcentajeSueldo = sueldo * 0.12;
            sueldo = sueldo + porcentajeSueldo;
        }

        System.out.println("Su sueldo con el aumento es de: " + sueldo);

        scanner.nextLine();
    }
}

/**
 * Dados los datos A, B, C y D que representan números enteros; escriba un
 * algoritmo que calcule el resultado de las siguientes expresiones:
 * Si D=0 (A-C)2
 * Si D>0 (A-B )3
 * D
 */
class Ejercicio26 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        double A, B, C, D, resultado;

        System.out.print("Introduce el valor de A: ");
        A = scanner.nextDouble();

        System.out.print("Introduce el valor de B: ");
        B = scanner.nextDouble();

        System.out.print("Introduce el valor de C: ");
        C = scanner.nextDouble();

        System.out.print("Introduce el valor de D: ");
        D = scanner.nextDouble();

        if (D == 0) {
            System.out.println("D es igual a 0, por lo que se ejecutará (A-C)^2");
            resultado = Math.pow(A - C, 2);
            System.out.println("Resultado: " + resultado);
        } else if (D > 0) {
            System.out.println("D es mayor a 0, por lo que se ejecutará [(A-B)^3/D]");
            resultado = Math.pow(A - B, 3) / D;
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("D es menor que 0, no hay expresión para este caso \n Saliendo del programa . . .");
        }

        scanner.nextLine();
    }
}

/**
 * Un científico desea que un algoritmo le ayude en su trabajo analizándole tres
 * valores que se suministran, para determinar si los dos primeros son las
 * medidas de una figura conocida. Para ello, calcule el área de cada una de las
 * figuras que se mencionan a continuación y compárela con el tercer valor
 * suministrado; si hay coincidencia, imprima un mensaje que indique de qué
 * figura se trata. Las figuras a analizar son:
 * 
 * • Triángulo: b*h Valor1 y Valor2 son base y altura
 * 2
 * • Círculo: pi * r2 Valor1 y Valor2 son radio y pi
 * • Rectángulo: b * h Valor1 y Valor2 son base y altura.
 */
class Ejercicio27 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        System.out.print("Por favor ingrese el primer valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Por favor ingrese el segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Por favor ingrese el área esperada: ");
        double areaEsperada = scanner.nextDouble();

        // Calcular áreas para cada figura
        double areaTriangulo = (valor1 * valor2) / 2;
        double areaCirculo = Math.PI * Math.pow(valor1, 2);
        double areaRectangulo = valor1 * valor2;

        // Comparar con el área esperada y determinar la figura
        boolean esTriangulo = Math.abs(areaTriangulo - areaEsperada) < 0.0001;
        boolean esCirculo = Math.abs(areaCirculo - areaEsperada) < 0.0001;
        boolean esRectangulo = Math.abs(areaRectangulo - areaEsperada) < 0.0001;

        System.out.println("\nResultados:");
        System.out.println("Área calculada del triángulo: " + areaTriangulo);
        System.out.println("Área calculada del círculo: " + areaCirculo);
        System.out.println("Área calculada del rectángulo: " + areaRectangulo);
        System.out.println("Área esperada: " + areaEsperada);

        // Identificar la figura
        if (esTriangulo) {
            System.out.println("\n¡COINCIDENCIA ENCONTRADA!");
            System.out.println("La figura es un TRIÁNGULO donde:");
            System.out.println("Base = " + valor1);
            System.out.println("Altura = " + valor2);
        } else if (esCirculo) {
            System.out.println("\n¡COINCIDENCIA ENCONTRADA!");
            System.out.println("La figura es un CÍRCULO donde:");
            System.out.println("Radio = " + valor1);
            System.out.println("Pi = " + valor2);
        } else if (esRectangulo) {
            System.out.println("\n¡COINCIDENCIA ENCONTRADA!");
            System.out.println("La figura es un RECTÁNGULO donde:");
            System.out.println("Base = " + valor1);
            System.out.println("Altura = " + valor2);
        } else {
            System.out.println("\nNo se encontró coincidencia con ninguna figura conocida.");
        }

        scanner.nextLine();
    }
}

/**
 * Una empresa quiere hacer una compra de varias piezas de la misma clase a un
 * fabricante de refacciones. La empresa dependiendo del monto total de la
 * compra, decidirá qué hacer para pagar al fabricante. Si el monto total de la
 * compra excede de $500000 la empresa tendrá la capacidad de invertir de su
 * propio dinero un 55% del monto de la compra, pedir presta al banco un 30% y
 * el resto lo pagará solicitando un crédito al fabricante. Si el monto total de
 * la compra no excede de $500000 la empresa tendrá capacidad de invertir de su
 * propio dinero un 70% y el restante 30% lo pagará solicitando crédito al
 * fabricante. El fabricante cobra por concepto de intereses un 20% sobre la
 * cantidad que se le pague a crédito. Calcule y muestre la cantidad a invertir
 * de los fondos de la empresa, la cantidad a pagar a crédito, el monto a pagar
 * por intereses y si es necesario, la cantidad prestada al banco.
 */
class Ejercicio28 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        int cantidadPiezas;
        double precioUnitario, montoTotal, inversionPropia, prestamoBanco, creditoFabricante, intereses;

        System.out.print("Por favor ingrese la cantidad de piezas a comprar: ");
        cantidadPiezas = scanner.nextInt();

        System.out.print("Por favor ingrese el precio unitario de cada pieza: ");
        precioUnitario = scanner.nextDouble();

        montoTotal = cantidadPiezas * precioUnitario;
        System.out.println("\nEl monto total de la compra es: $" + montoTotal);

        if (montoTotal > 500000) {
            inversionPropia = montoTotal * 0.55;
            prestamoBanco = montoTotal * 0.30;
            creditoFabricante = montoTotal * 0.15;
            intereses = creditoFabricante * 0.20;

            System.out.println("\nComo el monto excede $500,000, el pago se realiza de la siguiente manera:");
            System.out.println("Inversión de fondos propios (55%): $" + inversionPropia);
            System.out.println("Préstamo del banco (30%): $" + prestamoBanco);
            System.out.println("Crédito al fabricante (15%): $" + creditoFabricante);
            System.out.println("Intereses a pagar al fabricante (20% sobre el crédito): $" + intereses);
            System.out.println("Monto total a pagar (incluyendo intereses): $" + (montoTotal + intereses));
        } else {
            inversionPropia = montoTotal * 0.70;
            creditoFabricante = montoTotal * 0.30;
            intereses = creditoFabricante * 0.20;
            prestamoBanco = 0;

            System.out.println("\nComo el monto no excede $500,000, el pago se realiza de la siguiente manera:");
            System.out.println("Inversión de fondos propios (70%): $" + inversionPropia);
            System.out.println("Crédito al fabricante (30%): $" + creditoFabricante);
            System.out.println("Intereses a pagar al fabricante (20% sobre el crédito): $" + intereses);
            System.out.println("Monto total a pagar (incluyendo intereses): $" + (montoTotal + intereses));
        }

        scanner.nextLine();
    }
}

/**
 * Una empresa que comercializa cosméticos tiene organizados a sus vendedores en
 * tres departamentos y ha establecido un programa de incentivos para
 * incrementar su productividad. El gerente, al final del mes, pide el importe
 * global de las ventas de los tres departamentos y aquellos que excedan el 33%
 * de las ventas totales se les paga una cantidad extra equivalente al 20% de su
 * salario mensual. Si todos los vendedores ganan lo mismo, determinar cuánto
 * recibirán los vendedores de los tres departamentos al finalizar el mes.
 */
class Ejercicio29 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        double ventasDept1, ventasDept2, ventasDept3, ventasTotales, salarioBase, porcentajeIncentivo = 0.20,
                porcentajeUmbral = 0.33, salarioFinalDept1, salarioFinalDept2, salarioFinalDept3, umbralVentas;

        System.out.print("Por favor ingrese el importe de ventas del departamento 1: $");
        ventasDept1 = scanner.nextDouble();

        System.out.print("Por favor ingrese el importe de ventas del departamento 2: $");
        ventasDept2 = scanner.nextDouble();

        System.out.print("Por favor ingrese el importe de ventas del departamento 3: $");
        ventasDept3 = scanner.nextDouble();

        System.out.print("Por favor ingrese el salario mensual base de cada vendedor: $");
        salarioBase = scanner.nextDouble();

        ventasTotales = ventasDept1 + ventasDept2 + ventasDept3;

        umbralVentas = ventasTotales * porcentajeUmbral;

        if (ventasDept1 > umbralVentas) {
            salarioFinalDept1 = salarioBase + (salarioBase * porcentajeIncentivo);
        } else {
            salarioFinalDept1 = salarioBase;
        }

        if (ventasDept2 > umbralVentas) {
            salarioFinalDept2 = salarioBase + (salarioBase * porcentajeIncentivo);
        } else {
            salarioFinalDept2 = salarioBase;
        }

        if (ventasDept3 > umbralVentas) {
            salarioFinalDept3 = salarioBase + (salarioBase * porcentajeIncentivo);
        } else {
            salarioFinalDept3 = salarioBase;
        }

        System.out.println("\n----- RESULTADOS -----");
        System.out.println("Ventas totales: $" + ventasTotales);
        System.out.println("Umbral para recibir incentivo (33% de ventas totales): $" + umbralVentas);
        System.out.println("\nDetalle por departamento:");
        System.out.println("Departamento 1 - Ventas: $" + ventasDept1 +
                (ventasDept1 > umbralVentas ? " (Supera el umbral)" : " (No supera el umbral)"));
        System.out.println("Departamento 2 - Ventas: $" + ventasDept2 +
                (ventasDept2 > umbralVentas ? " (Supera el umbral)" : " (No supera el umbral)"));
        System.out.println("Departamento 3 - Ventas: $" + ventasDept3 +
                (ventasDept3 > umbralVentas ? " (Supera el umbral)" : " (No supera el umbral)"));

        System.out.println("\nSalarios finales:");
        System.out.println("Vendedores del Departamento 1: $" + salarioFinalDept1 +
                (ventasDept1 > umbralVentas ? " (Incluye incentivo del 20%)" : ""));
        System.out.println("Vendedores del Departamento 2: $" + salarioFinalDept2 +
                (ventasDept2 > umbralVentas ? " (Incluye incentivo del 20%)" : ""));
        System.out.println("Vendedores del Departamento 3: $" + salarioFinalDept3 +
                (ventasDept3 > umbralVentas ? " (Incluye incentivo del 20%)" : ""));

        scanner.nextLine();
    }
}

/**
 * Se tienen 4 dígitos en las variables A, B, C, D que forman un entero positivo
 * N. Se desea redondear N a la centena más próxima y mostrar el resultado.
 * Considere los siguientes ejemplos: Si A es 2, B es 3, C es 6 y D es 2,
 * entonces N es 2362 y el resultado redondeado es 2400. Si N es 2342, el
 * resultado redondeado será 2300 y si N es 2962, el resultado redondeado será
 * 3000.
 */
class Ejercicio30 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        int A, B, C, D, N, resultado;

        System.out.print("Por favor ingrese el número A: ");
        A = scanner.nextInt();

        System.out.print("Por favor ingrese el número B: ");
        B = scanner.nextInt();

        System.out.print("Por favor ingrese el número C: ");
        C = scanner.nextInt();

        System.out.print("Por favor ingrese el número D: ");
        D = scanner.nextInt();

        // construir el número completo
        N = A * 1000 + B * 100 + C * 10 + D;

        // Evitamos números no validos
        if (A < 0 || A > 9 || B < 0 || B > 9 || C < 0 || C > 9 || D < 0 || D > 9) {
            System.out.println("Error: Los valores deben ser dígitos (0 - 9).");
        } else {
            // redondear centena
            if (C >= 5) {
                // redondear hacia arriba si C > 5
                resultado = ((A * 10) + B + 1) * 100;

                // Si B = 9, incrementamos A
                if (B == 9) {
                    resultado = (A + 1) * 1000;
                }
            } else {
                // Si C<5 redondemaos hacia abajo
                resultado = ((A * 10) + B) * 100;
            }
            System.out.println("\nEl número formado es: " + N);
            System.out.println("El número redondeado a la centena más próxima es: " + resultado);
        }
        scanner.nextLine();
    }
}

/**
 * Una compañía de alquiler de automóviles sin conductor, desea calcular y
 * mostrar lo que debe pagar cada cliente, de acuerdo a las siguientes
 * condiciones:
 * a. Si no se rebasan los 300 km, se cancelan 5000 Bolívares
 * b. Si la distancia recorrida es superior a 300 km
 * - Pero inferior a 1000 se cobran 5000 Bolívares más 200 Bolívares por cada
 * kilómetro superior a 300.
 * - Si es superior a 1000 se cobran 5000 Bolívares más 200 Bolívares por cada
 * kilómetro, para las distancias entre 300 y 1000 kilómetros y 150 Bolívares
 * por cada kilómetro para las distancias mayores a 1000.
 */
class Ejercicio31 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        double distanciaRecorrida, montoPagar, kmAdicionales, kmEntre300Y1000, kmMayoresA1000, costoEntre300Y1000,
                costoMayoresA1000;
        final double TARIFA_BASE = 5000, TARIFA_ADICIONAL_300_1000 = 200, TARIFA_ADICIONAL_MAYOR_1000 = 150,
                LIMITE_INFERIOR = 300, LIMITE_SUPERIOR = 1000;

        System.out.print("Por favor ingrese la distancia recorrida en kilómetros: ");
        distanciaRecorrida = scanner.nextDouble();

        if (distanciaRecorrida <= LIMITE_INFERIOR) {
            // 300 km
            montoPagar = TARIFA_BASE;
            System.out.println("\nComo la distancia no supera los 300 km, se aplica tarifa base.");
        } else if (distanciaRecorrida <= LIMITE_SUPERIOR) {
            // Entre 300 y 1000 km
            kmAdicionales = distanciaRecorrida - LIMITE_INFERIOR;
            montoPagar = TARIFA_BASE + (kmAdicionales * TARIFA_ADICIONAL_300_1000);
            System.out.println("\nComo la distancia está entre 300 y 1000 km:");
            System.out.println("- Tarifa base: " + TARIFA_BASE + " Bolívares");
            System.out
                    .println("- " + kmAdicionales + " km adicionales x " + TARIFA_ADICIONAL_300_1000 + " Bolívares = " +
                            (kmAdicionales * TARIFA_ADICIONAL_300_1000) + " Bolívares");
        } else {
            // Superior a 1000km
            kmEntre300Y1000 = LIMITE_SUPERIOR - LIMITE_INFERIOR;
            kmMayoresA1000 = distanciaRecorrida - LIMITE_SUPERIOR;

            costoEntre300Y1000 = kmEntre300Y1000 * TARIFA_ADICIONAL_300_1000;
            costoMayoresA1000 = kmMayoresA1000 * TARIFA_ADICIONAL_MAYOR_1000;

            montoPagar = TARIFA_BASE + costoEntre300Y1000 + costoMayoresA1000;

            System.out.println("\nComo la distancia es superior a 1000 km:");
            System.out.println("- Tarifa base: " + TARIFA_BASE + " Bolívares");
            System.out.println("- " + kmEntre300Y1000 + " km (entre 300 y 1000) x " + TARIFA_ADICIONAL_300_1000 +
                    " Bolívares = " + costoEntre300Y1000 + " Bolívares");
            System.out.println("- " + kmMayoresA1000 + " km (mayores a 1000) x " + TARIFA_ADICIONAL_MAYOR_1000 +
                    " Bolívares = " + costoMayoresA1000 + " Bolívares");
        }

        // Mostrar resultado final
        System.out.println("\nEl monto total a pagar es: " + montoPagar + " Bolívares");

        scanner.nextLine();
    }
}

/**
 * Dados como datos los valores enteros P y Q, determine si los mismos
 * satisfacen la siguiente expresión:
 * P3 + Q4 – 2*P2 > 680.
 * En caso afirmativo debe mostrar los valores de P y Q, de lo contrario muestre
 * un mensaje alusivo al hecho.
 */
class Ejercicio32 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        int P, Q;
        double resultado;

        System.out.print("Por favor ingresa el primer número entero: ");
        P = scanner.nextInt();
        System.out.print("Por favor ingresa el segundo número entero: ");
        Q = scanner.nextInt();

        resultado = Math.pow(P, 3) + Math.pow(Q, 4) - 2 * Math.pow(P, 2);

        if (resultado > 680) {
            System.out.println("Los valores son:\nP = " + P + "\nQ = " + Q);
        } else {
            System.out.println("El resultado es menor o igual a 680");
        }

        scanner.nextLine();
    }
}

/**
 * en una tienda efectúan un descuento a los clientes dependiendo del monto de
 * la compra. El
 * descuento se efectúa con base en el siguiente criterio:
 * a. Si el monto es inferior a $500, no hay descuento.
 * b. Si está comprendido entre $500 y $1000 inclusive, se hace un descuento del
 * 5%
 * c. Si está comprendido entre $1000 y $7000 inclusive, se hace un descuento
 * del 11%
 * d. Si está comprendido entre $7000 y $15000 inclusive, el descuento es del
 * 18%
 * e. Si el monto es mayor a $15000, hay un 25% de descuento.
 * Calcule y muestre el nombre del cliente, el monto de la compra, monto a pagar
 * y descuento recibido.
 */
class Ejercicio33 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        String nombreCliente;
        double montoCompra, montoPago, descuento = 0;

        System.out.print("Por favor ingrese su nombre: ");
        nombreCliente = scanner.nextLine();

        System.out.print("Por favor ingrese el monto de la compra sin puntos ni comas: ");
        montoCompra = scanner.nextDouble();

        if (montoCompra < 500) {
            montoPago = montoCompra;
            System.out.println("Estimado cliente " + nombreCliente
                    + ", ya que su compra no supera los $500, no tiene descuento.\nMonto Compra: " + montoCompra
                    + "\nMonto a pagar: " + montoPago + "\nDescuento recibido: $" + descuento);
        } else if (montoCompra >= 500 && montoCompra <= 1000) {
            descuento = montoCompra * 0.05;
            montoPago = montoCompra - descuento;
            System.out.println("Estimado cliente " + nombreCliente
                    + ", ya que su compra es mayor de $500 y menor de $1000, se le realizará un descuento de 5%.\nMonto Compra: "
                    + montoCompra
                    + "\nMonto a pagar: " + montoPago + "\nDescuento recibido: $" + descuento);
        } else if (montoCompra >= 1000 && montoCompra <= 7000) {
            descuento = montoCompra * 0.11;
            montoPago = montoCompra - descuento;
            System.out.println("Estimado cliente " + nombreCliente
                    + ", ya que su compra es mayor de $1000 y menor de $7000, se le realizará un descuento de 11%.\nMonto Compra: "
                    + montoCompra
                    + "\nMonto a pagar: " + montoPago + "\nDescuento recibido: $" + descuento);
        } else if (montoCompra >= 7000 && montoCompra <= 15000) {
            descuento = montoCompra * 0.18;
            montoPago = montoCompra - descuento;
            System.out.println("Estimado cliente " + nombreCliente
                    + ", ya que su compra es mayor de $7000 y menor de $15000, se le realizará un descuento de 18%.\nMonto Compra: "
                    + montoCompra
                    + "\nMonto a pagar: " + montoPago + "\nDescuento recibido: $" + descuento);
        } else if (montoCompra > 15000) {
            descuento = montoCompra * 0.25;
            montoPago = montoCompra - descuento;
            System.out.println("Estimado cliente " + nombreCliente
                    + ", ya que su compra es mayor de $15000, se le realizará un descuento de 25%.\nMonto Compra: "
                    + montoCompra
                    + "\nMonto a pagar: " + montoPago + "\nDescuento recibido: $" + descuento);
        }
        scanner.nextLine();
    }
}

/**
 * Construya un programa que, dados como datos la categoría y el sueldo del
 * trabajador, calcule el aumento correspondiente teniendo en cuenta la
 * siguiente tabla:
 * Categoria | % aumento
 * 1 --> 15%
 * 2 --> 10%
 * 3 --> 8%
 * 4 --> 7%
 * Como salida, mostrar la categoría del trabajador y su nuevo sueldo.
 */
class Ejercicio34 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        int categoria;
        double sueldo, aumento;

        System.out.print("Por favor ingrese su categoría (1 - 4): ");
        categoria = scanner.nextInt();
        System.out.print("Por favor ingrese su sueldo: ");
        sueldo = scanner.nextDouble();

        if (categoria == 1) {
            aumento = sueldo * 0.15;
            sueldo = sueldo + aumento;

            System.out.println("ya que su categoría es " + categoria + ", su nuevo sueldo es de: " + sueldo);
        } else if (categoria == 2) {
            aumento = sueldo * 0.10;
            sueldo = sueldo + aumento;
            System.out.println("ya que su categoría es " + categoria + ", su nuevo sueldo es de: " + sueldo);
        } else if (categoria == 3) {
            aumento = sueldo * 0.08;
            sueldo = sueldo + aumento;
            System.out.println("ya que su categoría es " + categoria + ", su nuevo sueldo es de: " + sueldo);
        } else if (categoria == 4) {
            aumento = sueldo * 0.07;
            sueldo = sueldo + aumento;
            System.out.println("ya que su categoría es " + categoria + ", su nuevo sueldo es de: " + sueldo);
        } else {
            System.out.println("La categoría ingresada no es válida.");
        }
        scanner.nextLine();
    }
}

/**
 * Desarrolle un algoritmo, que dado como dato una temperatura en grados
 * Fahrenheit, determine el deporte que es apropiado practicar a esa
 * temperatura, teniendo en cuenta la siguiente tabla:
 * Deporte | Temperatura
 * Natación --> Temp > 85
 * Tenis --> 70 < Temp < 85
 * Golf --> 32 < Temp < 70
 * Esquí --> 10 < Temp < 32
 * Marcha --> Temp <= 10
 */
class Ejercicio35 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        int temperatura;

        System.out.print("Por favor ingrese la temperatura: ");
        temperatura = scanner.nextInt();

        if (temperatura > 85) {
            System.out.println("El deporte idóneo a esta temperatura es la natación");
        } else if (70 < temperatura && temperatura <= 85) {
            System.out.println("El deporte idóneo a esta temperatura es el tenis");
        } else if (32 < temperatura && temperatura <= 70) {
            System.out.println("El deporte idóneo a esta temperatura es el golf");
        } else if (10 < temperatura && temperatura <= 32) {
            System.out.println("El deporte idóneo a esta temperatura es el esquí");
        } else if (temperatura <= 10) {
            System.out.println("El deporte idóneo a esta temperatura es la marcha");
        }
        scanner.nextLine();
    }
}

/**
 * Dada una cantidad entera de Bolívares, desarrolle un algoritmo que permita
 * desglosar dicha cantidad en los billetes de curso legal en el País. Recuerde
 * que estos son: 50000, 20000, 10000, 5000, 2000, 1000, 500, 100, 50, 20, 10.
 */
class Ejercicio36 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        int[] billetes = { 50000, 20000, 10000, 5000, 2000, 1000, 500, 100, 50, 20, 10 };
        int cantidad;

        System.out.print("Ingrese la cantidad en Bolívares: ");
        cantidad = scanner.nextInt();

        System.out.println("\nDesglose en billetes:");

        for (int billete : billetes) {
            if (cantidad >= billete) {
                int cantidadBilletes = cantidad / billete;
                cantidad %= billete;
                System.out.println("Bs " + billete + " x " + cantidadBilletes);
            }
        }

        if (cantidad > 0) {
            System.out.println("Cantidad restante no desglosada: Bs " + cantidad);
        }
        scanner.nextLine();
    }
}

/**
 * Dados tres datos enteros positivos, que representan las longitudes de los
 * lados de un probable triángulo, desarrolle un algoritmo que determine si los
 * datos corresponden a un triángulo. En caso de que sí correspondan, escriba si
 * el triángulo es equilátero, isósceles o escaleno. Calcule además su área.
 * Considere que es triángulo si se cumple que la suma de los dos lados menores
 * es mayor que la del lado mayor. Tome en cuenta además que el área de un
 * triángulo la calculamos como:
 * area = √S(S­A)(S­B)(S­C) donde S es la mitad de la suma de los lados A, B y
 * C.
 * Recuerde:
 * Equilátero: todos los lados son iguales.
 * Isósceles: 2 lados iguales y 1 diferente.
 * Escaleno: Todos los lados diferentes.
 */
class Ejercicio37 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        int ladoA, ladoB, ladoC;
        double semiperimetro, area;
        String tipoTriangulo;
        boolean esTriangulo;

        System.out.print("Por favor ingrese la longitud del primer lado: ");
        ladoA = scanner.nextInt();

        System.out.print("Por favor ingrese la longitud del segundo lado: ");
        ladoB = scanner.nextInt();

        System.out.print("Por favor ingrese la longitud del tercer lado: ");
        ladoC = scanner.nextInt();

        // Verificar si puede formar un triángulo
        esTriangulo = (ladoA + ladoB > ladoC) &&
                (ladoA + ladoC > ladoB) &&
                (ladoB + ladoC > ladoA);

        if (!esTriangulo) {
            System.out.println("Los lados ingresados NO pueden formar un triángulo.");
        } else {
            // Determinar tipo de triángulo
            if (ladoA == ladoB && ladoB == ladoC) {
                tipoTriangulo = "Equilátero";
            } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
                tipoTriangulo = "Isósceles";
            } else {
                tipoTriangulo = "Escaleno";
            }

            // Calcular semiperimetro
            semiperimetro = (ladoA + ladoB + ladoC) / 2.0;

            // Calcular área
            area = Math.sqrt(semiperimetro *
                    (semiperimetro - ladoA) *
                    (semiperimetro - ladoB) *
                    (semiperimetro - ladoC));

            System.out.println("\nResultados:");
            System.out.print("Tipo de triángulo: " + tipoTriangulo);
            System.out.print("Área del triángulo: " + area);
        }
        scanner.nextLine();
    }
}

/**
 * Desarrolle un algoritmo que reciba como dato de entrada la fecha de
 * nacimiento de una persona y a continuación escriba el nombre del signo del
 * zodiaco correspondiente; así como su edad.
 */
class Ejercicio38 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        int diaNacimiento, mesNacimiento, anoNacimiento;
        String signo = "";

        System.out.print("Por favor ingrese el día de nacimiento: ");
        diaNacimiento = scanner.nextInt();

        System.out.print("Por favor ingrese el mes de nacimiento (1-12): ");
        mesNacimiento = scanner.nextInt();

        System.out.print("Por favor ingrese el año de nacimiento: ");
        anoNacimiento = scanner.nextInt();

        // Operador ternario, si día = 25 = Acuario || si día = 15 = Capricornio
        switch (mesNacimiento) {
            case 1:
                signo = (diaNacimiento >= 20) ? "Acuario" : "Capricornio";
                break;
            case 2:
                signo = (diaNacimiento >= 19) ? "Piscis" : "Acuario";
                break;
            case 3:
                signo = (diaNacimiento >= 21) ? "Aries" : "Piscis";
                break;
            case 4:
                signo = (diaNacimiento >= 20) ? "Tauro" : "Aries";
                break;
            case 5:
                signo = (diaNacimiento >= 21) ? "Géminis" : "Tauro";
                break;
            case 6:
                signo = (diaNacimiento >= 21) ? "Cáncer" : "Géminis";
                break;
            case 7:
                signo = (diaNacimiento >= 23) ? "Leo" : "Cáncer";
                break;
            case 8:
                signo = (diaNacimiento >= 23) ? "Virgo" : "Leo";
                break;
            case 9:
                signo = (diaNacimiento >= 23) ? "Libra" : "Virgo";
                break;
            case 10:
                signo = (diaNacimiento >= 23) ? "Escorpio" : "Libra";
                break;
            case 11:
                signo = (diaNacimiento >= 22) ? "Sagitario" : "Escorpio";
                break;
            case 12:
                signo = (diaNacimiento >= 22) ? "Capricornio" : "Sagitario";
                break;
        }

        LocalDate fechaNacimiento = LocalDate.of(anoNacimiento, mesNacimiento, diaNacimiento);
        LocalDate fechaActual = LocalDate.now();
        Period edad = Period.between(fechaNacimiento, fechaActual);

        System.out.println("\nInformación de la persona:");
        System.out.print("Su signo zodiacal es: " + signo);
        System.out.print("Su edad es: " + edad.getYears() + " años");

        scanner.nextLine();
    }
}

/**
 * Una persona se encuentra en la disyuntiva de comprar un automóvil o un
 * terreno, los cuales cuestan exactamente la misma cantidad de dinero. Sabe que
 * mientras el automóvil se devalúa, con el terreno sucede lo contrario. Esta
 * persona comprará el automóvil si al cabo de tres años la devaluación de éste
 * no es mayor que la mitad del incremento del valor del terreno. Ayúdele a esta
 * persona a determinar si debe o no comprar el automóvil.
 */
class Ejercicio39 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        double valorAutomovil, valorTerreno, tasaDevaluacionAutomovil, tasaApreciacionTerreno, devaluacionAutomovil,
                apreciacionTerreno;

        System.out.println("Ingrese el valor del automóvil y del terreno:");
        valorAutomovil = scanner.nextDouble();
        valorTerreno = scanner.nextDouble();

        System.out.println("Ingrese la tasa anual de devaluación del automóvil (en porcentaje):");
        tasaDevaluacionAutomovil = scanner.nextDouble();
        System.out.println("Ingrese la tasa anual de apreciación del terreno (en porcentaje):");
        tasaApreciacionTerreno = scanner.nextDouble();

        // Calcular devaluación del automóvil en 3 años
        devaluacionAutomovil = valorAutomovil * (tasaDevaluacionAutomovil / 100.0 * 3);

        // Calcular apreciación del terreno en 3 años
        apreciacionTerreno = valorTerreno * (tasaApreciacionTerreno / 100.0 * 3);

        if (devaluacionAutomovil <= (apreciacionTerreno / 2)) {
            System.out.println("Comprar el automóvil");
        } else {
            System.out.println("No comprar el automóvil");
        }

        scanner.nextLine();
    }
}

/**
 * Desarrolle un programa que calcule y muestre el monto que debe pagar un
 * suscriptor por concepto de consumo de luz eléctrica y servicio de aseo
 * urbano. Dicho monto se calcula multiplicando la diferencia de la lectura
 * anterior y la lectura actual por el costo de cada Kilovatio hora, según la
 * siguiente escala:
 * 0 - 100 2.622,00 Bs.
 * 101 - 300 79,78 Bs. / Kwh
 * 301 – 500 89,52 Bs. /Kwh
 * 501 – en adelante 97,95 Bs. / Khw
 */
class Ejercicio40 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        double lecturaAnterior, lecturaActual, consumoKwh, costoTotal = 0, costoKwh = 0;

        System.out.println("Ingrese la lectura anterior:");
        lecturaAnterior = scanner.nextDouble();
        System.out.println("Ingrese la lectura actual:");
        lecturaActual = scanner.nextDouble();

        consumoKwh = lecturaActual - lecturaAnterior;

        if (consumoKwh >= 0 && consumoKwh <= 100) {
            costoKwh = 2.622;
            costoTotal = consumoKwh * costoKwh;
        } else if (consumoKwh > 100 && consumoKwh <= 300) {
            costoKwh = 79.78;
            costoTotal = (100 * 2.622) + ((consumoKwh - 100) * costoKwh);
        } else if (consumoKwh > 300 && consumoKwh <= 500) {
            costoKwh = 89.52;
            costoTotal = (100 * 2.622) + (200 * 79.78) + ((consumoKwh - 300) * costoKwh);
        } else if (consumoKwh > 500) {
            costoKwh = 97.95;
            costoTotal = (100 * 2.622) + (200 * 79.78) + (200 * 89.52) + ((consumoKwh - 500) * costoKwh);
        }

        System.out.println("Consumo de KWh: " + consumoKwh);
        System.out.println("Costo total a pagar: " + costoTotal + " Bs.");

        scanner.nextLine();
    }
}

/**
 * El gobierno del estado de México desea reforestar un bosque que mide
 * determinado número de hectáreas. Si la superficie del terreno excede a 1
 * millón de metros cuadrados, entonces decidirá sembrar de la siguiente manera:
 * PORCENTAJE DE LA SUPERFICIE DEL BOSQUE TIPO DE ÁRBOL
 * 70% Pino
 * 20% Oyamel
 * 10% Cedro
 * 
 * Si la superficie del terreno es menor o igual a un millón de metros
 * cuadrados, entonces decidirá sembrar de la siguiente manera:
 * PORCENTAJE DE LA SUPERFICIE DEL BOSQUE TIPO DE ÁRBOL
 * 50% Pino
 * 30% Oyamel
 * 20% Cedro
 * El gobierno desea saber el número de pinos, oyameles y cedros que tendrá que
 * sembrar en el bosque, si se sabe que en 10 metros cuadrados caben 8 pinos, en
 * 15 metros cuadrados caben 15 oyameles y en 18 metros cuadrados caben 10
 * cedros. También se sabe que una hectárea equivale a 10 mil metros cuadrados.
 */
class Ejercicio41 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        double superficieTerreno, superficieBosque, hectareas, pinosPorArea, oyamelesPorArea, cedrosPorArea, totalPinos,
                totalOyameles, totalCedros;
        final int PINOS_POR_10_METROS = 8, OYAMELES_POR_15_METROS = 15, CEDROS_POR_18_METROS = 10;
        final double METROS_POR_HECTAREA = 10000;

        System.out.println("Ingrese la superficie total del terreno en metros cuadrados:");
        superficieTerreno = scanner.nextDouble();

        if (superficieTerreno > 1000000) {
            superficieBosque = superficieTerreno * 0.7;
            hectareas = superficieBosque / METROS_POR_HECTAREA;

            // Calcular número de árboles
            totalPinos = (int) ((hectareas * METROS_POR_HECTAREA * 0.7 / 10) * PINOS_POR_10_METROS);
            totalOyameles = (int) ((hectareas * METROS_POR_HECTAREA * 0.2 / 15) * OYAMELES_POR_15_METROS);
            totalCedros = (int) ((hectareas * METROS_POR_HECTAREA * 0.1 / 18) * CEDROS_POR_18_METROS);
        } else {
            superficieBosque = superficieTerreno * 0.5;
            hectareas = superficieBosque / METROS_POR_HECTAREA;

            // Calcular número de árboles
            totalPinos = (int) ((hectareas * METROS_POR_HECTAREA * 0.5 / 10) * PINOS_POR_10_METROS);
            totalOyameles = (int) ((hectareas * METROS_POR_HECTAREA * 0.3 / 15) * OYAMELES_POR_15_METROS);
            totalCedros = (int) ((hectareas * METROS_POR_HECTAREA * 0.2 / 18) * CEDROS_POR_18_METROS);
        }

        System.out.println("Número de Pinos: " + totalPinos);
        System.out.println("Número de Oyameles: " + totalOyameles);
        System.out.println("Número de Cedros: " + totalCedros);

        scanner.nextLine();
    }
}

/**
 * Tomando como base los resultados obtenidos en un laboratorio de análisis
 * clínicos, un médico determina si una persona tiene anemia o no, lo cual
 * depende de su nivel de hemoglobina en la sangre, de su edad y de su sexo. Si
 * el nivel de hemoglobina que tiene una persona es menor que el rango que le
 * corresponde, se determina su resultado como positivo y en caso contrario como
 * negativo. La tabla en la que el médico se basa para obtener el resultado es
 * la siguiente:
 * EDAD NIVEL DE HEMOGLOBINA
 * 0 - 1 mes 13 - 26 g%
 * Mayor de 1 y menor o igual de 6 meses 10 - 18 g%
 * Mayor de 6 y menor o igual de 12 meses 11 - 15 g%
 * Mayor de 1 y menor o igual que 5 años 11.5 - 15 g%
 * Mayor de 5 y menor o igual que 10 años 12.6 – 15.5 g%
 * Mayor de 10 y menor o igual que 15 años 13 - 15.5 g%
 * Mujeres mayores de 15 años 12 - 16 g%
 * Hombres mayores de 15 años 14 - 18 g%
 * Desarrolle un algoritmo que indique, si una persona tiene Anemia o no.
 */
class Ejercicio42 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        int edad, meses;
        double nivelHemoglobina;
        String sexo;
        boolean tieneAnemia = false;

        System.out.println("Ingrese la edad en meses:");
        edad = scanner.nextInt();

        System.out.println("Ingrese el nivel de hemoglobina:");
        nivelHemoglobina = scanner.nextDouble();

        System.out.println("Ingrese el sexo (Hombre/Mujer):");
        sexo = scanner.next();

        if (edad >= 0 && edad <= 1) {
            tieneAnemia = nivelHemoglobina < 13 || nivelHemoglobina > 26;
        } else if (edad > 1 && edad <= 6) {
            tieneAnemia = nivelHemoglobina < 10 || nivelHemoglobina > 18;
        } else if (edad > 6 && edad <= 12) {
            tieneAnemia = nivelHemoglobina < 11 || nivelHemoglobina > 15;
        } else if (edad > 12 && edad <= 60) {
            tieneAnemia = nivelHemoglobina < 11.5 || nivelHemoglobina > 15;
        } else if (edad > 60 && edad <= 120) {
            tieneAnemia = nivelHemoglobina < 12.6 || nivelHemoglobina > 15.5;
        } else if (edad > 120 && edad <= 180) {
            tieneAnemia = nivelHemoglobina < 13 || nivelHemoglobina > 15.5;
        } else if (edad > 180) {
            if (sexo.equalsIgnoreCase("Mujer")) {
                tieneAnemia = nivelHemoglobina < 12 || nivelHemoglobina > 16;
            } else {
                tieneAnemia = nivelHemoglobina < 14 || nivelHemoglobina > 18;
            }
        }

        if (tieneAnemia) {
            System.out.println("Positivo: La persona tiene anemia");
        } else {
            System.out.println("Negativo: La persona NO tiene anemia");
        }

        scanner.nextLine();
    }
}

/**
 * El dueño de una empresa desea planificar las decisiones financieras que
 * tomará en el siguiente año. La manera de planificarlas depende de lo
 * siguiente: Si actualmente su capital se encuentra con saldo negativo, pedirá
 * un préstamo bancario para que su nuevo saldo sea de $10000. si su capital
 * tiene actualmente un saldo positivo pedirá un préstamo bancario para tener un
 * nuevo saldo de $20000, pero si su capital tiene actualmente un saldo superior
 * a los $20000 no pedirá ningún préstamo. Posteriormente repartirá su
 * presupuesto de la siguiente manera:
 * $5000 para equipo de cómputo
 * $2000 para mobiliario y del resto la mitad será para la compra de insumos y
 * la otra para otorgar incentivos al personal.
 * Desplegar qué cantidades se destinarán para la compra de insumos e incentivos
 * al personal y, en caso de que fuera necesario, a cuánto ascendería la
 * cantidad que se pediría al banco.
 */
class Ejercicio43 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        double capitalActual, prestamo = 0, saldoFinal, equipoComputo, insumos, incentivos;

        System.out.println("Ingrese el capital actual:");
        capitalActual = scanner.nextDouble();

        if (capitalActual < 0) {
            prestamo = 10000;
            saldoFinal = capitalActual + prestamo;
        } else if (capitalActual >= 0 && capitalActual < 20000) {
            prestamo = 20000;
            saldoFinal = capitalActual + prestamo;
        } else {
            saldoFinal = capitalActual;
        }

        equipoComputo = 5000;
        insumos = (saldoFinal - equipoComputo) / 2;
        incentivos = (saldoFinal - equipoComputo) / 2;

        System.out.println("Préstamo solicitado: $" + prestamo);
        System.out.println("Saldo final: $" + saldoFinal);
        System.out.println("Equipo de cómputo: $" + equipoComputo);
        System.out.println("Insumos: $" + insumos);
        System.out.println("Incentivos al personal: $" + incentivos);

        scanner.nextLine();
    }
}

/**
 * Una persona desea iniciar un negocio, para lo cual piensa verificar cuánto
 * dinero le prestaría el banco por hipotecar su casa. Tiene una cuenta
 * bancaria, pero no quiere disponer de ella a menos que el monto por hipotecar
 * su casa sea muy pequeño. Si el monto de la hipoteca es menor que $1.000.000
 * entonces invertirá el 50% de la inversión total, y un socio invertirá el otro
 * 50%. Si el monto de la hipoteca es de $1.000.000 o más, entonces invertirá el
 * monto total de la hipoteca y el resto del dinero que se necesite para cubrir
 * la inversión total se repartirá a partes iguales entre el socio y él.
 */
class Ejercicio44 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        double montoHipoteca, inversionPersonal, inversionSocio, inversionTotal;

        System.out.println("Ingrese el monto de la hipoteca:");
        montoHipoteca = scanner.nextDouble();

        if (montoHipoteca < 1000000) {
            // Invierte 50% del total
            inversionPersonal = montoHipoteca * 0.5;
            inversionSocio = montoHipoteca * 0.5;
            inversionTotal = montoHipoteca;
        } else {
            // Invierte el total de la hipoteca
            inversionPersonal = montoHipoteca;
            inversionSocio = 0;
            inversionTotal = montoHipoteca;
        }

        System.out.println("Monto de la hipoteca: $" + montoHipoteca);
        System.out.println("Inversión personal: $" + inversionPersonal);
        System.out.println("Inversión del socio: $" + inversionSocio);
        System.out.println("Inversión total: $" + inversionTotal);

        scanner.nextLine();
    }
}

/**
 * Confeccionar un algoritmo que permita resolver una ecuación de segundo grado,
 * de la forma: AX2+BX+C = 0, sabiendo que el discriminante (D) se calcula con
 * la fórmula: D= Bˆ2­4*A*C. El valor obtenido se evalúa y se aplica la fórmula
 * correspondiente, según muestra la siguiente tabla:
 */
class Ejercicio45 implements EstructuraControlDesicion {
    @Override
    public void ejecutar(Scanner scanner) {
        double a, b, c, discriminante, x1, x2;

        System.out.println("Ingrese el valor de A:");
        a = scanner.nextDouble();

        System.out.println("Ingrese el valor de B:");
        b = scanner.nextDouble();

        System.out.println("Ingrese el valor de C:");
        c = scanner.nextDouble();

        // Calcular discriminante
        discriminante = Math.pow(b, 2) - (4 * a * c);

        if (discriminante > 0) {
            // Dos soluciones reales
            x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        } else if (discriminante == 0) {
            // Una solución real
            x1 = -b / (2 * a);
            System.out.println("X1 = X2 = " + x1);
        } else {
            // No tiene solución en los reales
            System.out.println("No tiene solución en los Reales");
        }

        scanner.nextLine();
    }
}
