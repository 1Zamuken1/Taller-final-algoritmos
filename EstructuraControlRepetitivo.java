import java.util.Scanner;

interface EstructuraControlRepetitivo {
    void ejecutar(Scanner scanner);
}

/**
 * Sea N y K dos enteros positivos, con K < N. Se desea escribir un programa que
 * escriba el valor de N,N-1,N-2,..., y así sucesivamente hasta llegar al valor
 * de K.
 */
class Ejercicio46 implements EstructuraControlRepetitivo {
    private int N;
    private int K;

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

    public int getK() {
        return K;
    }

    public void setK(int K) {
        this.K = K;
    }

    @Override
    public void ejecutar(Scanner scanner) {
        System.out.print("Por favor ingrese el valor de N: ");
        N = scanner.nextInt();

        System.out.print("Por favor ingrese el valor de K: ");
        K = scanner.nextInt();

        if (K >= N) {
            System.out.println("Error: K debe ser menor que N.");
        }

        for (int i = N; i >= K; i--) {
            System.out.println(i + "");
        }
        scanner.nextLine();
    }
}

/**
 * Escriba un programa que imprima todos los enteros positivos impares menores
 * que 100 omitiéndose aquellos que sean divisibles por 7.
 */

class Ejercicio47 implements EstructuraControlRepetitivo {
    @Override
    public void ejecutar(Scanner scanner) {
        for (int i = 1; i < 100; i += 2) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.println(i + " ");
        }
    }
}

/**
 * Escriba un algoritmo para producir una tabla de conversión de temperatura
 * para convertir valores en grados Fahrenheit a su equivalente en grados
 * Celsius, grados Kelvin y grados Rankine.
 */

class Ejercicio48 implements EstructuraControlRepetitivo {
    @Override
    public void ejecutar(Scanner scanner) {
        System.out.println("Grados Fahrenheit\tGrados Celsius\tGrados Kelvin\tGrados Rankine");
        for (int i = 0; i <= 100; i++) {
            double celsius = (i - 32) * 5.0 / 9.0;
            double kelvin = celsius + 273.15;
            double rankine = i + 459.67;
            System.out.printf("%-20d%-15.2f%-15.2f%-15.2f%n", i, celsius, kelvin, rankine);
        }
    }
}

/**
 * 100 personas presentaron una prueba constituida por 3 preguntas. Se requiere
 * desarrollar un algoritmo o programa que permita determinar la cantidad de
 * personas que respondieron:
 * a. correctamente las tres preguntas.
 * b. Correctamente solamente la primera y la segunda pregunta.
 * c. Correctamente solamente la primera y la tercera pregunta.
 * d. Correctamente solamente la segunda y la tercera pregunta.
 * e. Correctamente la primera pregunta por lo menos.
 * f. Correctamente la segunda pregunta por lo menos.
 * g. Correctamente la tercera pregunta por lo menos.
 * h. Además, cuántos no respondieron correctamente ninguna pregunta.
 */

class Ejercicio49 implements EstructuraControlRepetitivo {
    private int todasCorrectas;
    private int soloPrimeraSegunda;
    private int soloPrimeraTercera;
    private int soloSegundaTercera;
    private int alMenosPrimera;
    private int alMenosSegunda;
    private int alMenosTercera;
    private int ningunaCorrecta;

    public int getTodasCorrectas() {
        return todasCorrectas;
    }

    public void setTodasCorrectas(int todasCorrectas) {
        this.todasCorrectas = todasCorrectas;
    }

    public int getSoloPrimeraSegunda() {
        return soloPrimeraSegunda;
    }

    public void setSoloPrimeraSegunda(int soloPrimeraSegunda) {
        this.soloPrimeraSegunda = soloPrimeraSegunda;
    }

    public int getSoloPrimeraTercera() {
        return soloPrimeraTercera;
    }

    public void setSoloPrimeraTercera(int soloPrimeraTercera) {
        this.soloPrimeraTercera = soloPrimeraTercera;
    }

    public int getSoloSegundaTercera() {
        return soloSegundaTercera;
    }

    public void setSoloSegundaTercera(int soloSegundaTercera) {
        this.soloSegundaTercera = soloSegundaTercera;
    }

    public int getAlMenosPrimera() {
        return alMenosPrimera;
    }

    public void setAlMenosPrimera(int alMenosPrimera) {
        this.alMenosPrimera = alMenosPrimera;
    }

    public int getAlMenosSegunda() {
        return alMenosSegunda;
    }

    public void setAlMenosSegunda(int alMenosSegunda) {
        this.alMenosSegunda = alMenosSegunda;
    }

    public int getAlMenosTercera() {
        return alMenosTercera;
    }

    public void setAlMenosTercera(int alMenosTercera) {
        this.alMenosTercera = alMenosTercera;
    }

    public int getNingunaCorrecta() {
        return ningunaCorrecta;
    }

    public void setNingunaCorrecta(int ningunaCorrecta) {
        this.ningunaCorrecta = ningunaCorrecta;
    }

    @Override
    public void ejecutar(Scanner scanner) {
        setTodasCorrectas(0);
        setSoloPrimeraSegunda(0);
        setSoloPrimeraTercera(0);
        setSoloSegundaTercera(0);
        setAlMenosPrimera(0);
        setAlMenosSegunda(0);
        setAlMenosTercera(0);
        setNingunaCorrecta(0);

        for (int i = 1; i <= 100; i++) {
            System.out.println("Persona " + i + ": Responda con 1 (correcta) o 0 (incorrecta)");

            System.out.print("Pregunta 1: ");
            int p1 = scanner.nextInt();

            System.out.print("Pregunta 2: ");
            int p2 = scanner.nextInt();

            System.out.print("Pregunta 3: ");
            int p3 = scanner.nextInt();

            // Verificar combinaciones de respuestas
            if (p1 == 1 && p2 == 1 && p3 == 1) {
                setTodasCorrectas(getTodasCorrectas() + 1);
            } else if (p1 == 1 && p2 == 1 && p3 == 0) {
                setSoloPrimeraSegunda(getSoloPrimeraSegunda() + 1);
            } else if (p1 == 1 && p2 == 0 && p3 == 1) {
                setSoloPrimeraTercera(getSoloPrimeraTercera() + 1);
            } else if (p1 == 0 && p2 == 1 && p3 == 1) {
                setSoloSegundaTercera(getSoloSegundaTercera() + 1);
            }

            // Contadores por pregunta
            if (p1 == 1)
                setAlMenosPrimera(getAlMenosPrimera() + 1);
            if (p2 == 1)
                setAlMenosSegunda(getAlMenosSegunda() + 1);
            if (p3 == 1)
                setAlMenosTercera(getAlMenosTercera() + 1);

            // Si todas son incorrectas
            if (p1 == 0 && p2 == 0 && p3 == 0) {
                setNingunaCorrecta(getNingunaCorrecta() + 1);
            }
        }

        System.out.println("\nResultados:");
        System.out.println("a. Todas correctas: " + getTodasCorrectas());
        System.out.println("b. Solo primera y segunda: " + getSoloPrimeraSegunda());
        System.out.println("c. Solo primera y tercera: " + getSoloPrimeraTercera());
        System.out.println("d. Solo segunda y tercera: " + getSoloSegundaTercera());
        System.out.println("e. Al menos la primera: " + getAlMenosPrimera());
        System.out.println("f. Al menos la segunda: " + getAlMenosSegunda());
        System.out.println("g. Al menos la tercera: " + getAlMenosTercera());
        System.out.println("h. Ninguna correcta: " + getNingunaCorrecta());
    }
}

/**
 * Desarrolle un algoritmo o programa que permita calcular y mostrar la suma de
 * todos los números pares comprendidos entre 97 y 1003.
 * Respuesta: 249150
 */
class Ejercicio50 implements EstructuraControlRepetitivo {
    @Override
    public void ejecutar(Scanner scanner) {
        int suma = 0;
        for (int i = 98; i <= 1003; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los números pares entre 97 y 1003 es: " + suma);
    }
}

/**
 * Calcular el término doceavo y la suma de los doce primeros términos de la
 * sucesión: 6, 11, 16, 21.
 * Respuesta: a12=61, suma=402.
 */

class Ejercicio51 implements EstructuraControlRepetitivo {
    private int a1, d, n;

    // Constructor
    public Ejercicio51() {
        this.a1 = 6;
        this.d = 5;
        this.n = 12;
    }

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    // Método para calcular el término n-ésimo
    public int calcularTerminoN() {
        return a1 + (n - 1) * d;
    }

    // Método para calcular la suma de los n términos
    public int calcularSuma() {
        return (n * (a1 + calcularTerminoN())) / 2;
    }

    @Override
    public void ejecutar(Scanner scanner) {
        System.out.println("El término doceavo es: " + calcularTerminoN());
        System.out.println("La suma de los 12 primeros términos es: " + calcularSuma());
    }
}

/**
 * Una persona debe realizar un muestreo con 100 personas para determinar el
 * promedio de peso de los niños, jóvenes, adultos y viejos que existen en su
 * zona habitacional. Para ello, conforme encuentra a las personas introduce los
 * datos a su computadora, la cual mediante un programa las clasifica y
 * despliega los cuatro promedios que la persona requiere. Las categorías se
 * trabajan de cuerdo a la siguiente tabla:
 */
class Ejercicio52 implements EstructuraControlRepetitivo {
    private int totalNinos, totalJovenes, totalAdultos, totalViejos;
    private double sumaPesoNinos, sumaPesoJovenes, sumaPesoAdultos, sumaPesoViejos;

    // Constructor
    public Ejercicio52() {
        this.totalNinos = 0;
        this.totalJovenes = 0;
        this.totalAdultos = 0;
        this.totalViejos = 0;
        this.sumaPesoNinos = 0;
        this.sumaPesoJovenes = 0;
        this.sumaPesoAdultos = 0;
        this.sumaPesoViejos = 0;
    }

    // Métodos para clasificar a la persona y acumular peso
    public void clasificarPersona(int edad, double peso) {
        if (edad >= 0 && edad <= 12) {
            totalNinos++;
            sumaPesoNinos += peso;
        } else if (edad >= 13 && edad <= 29) {
            totalJovenes++;
            sumaPesoJovenes += peso;
        } else if (edad >= 30 && edad <= 59) {
            totalAdultos++;
            sumaPesoAdultos += peso;
        } else if (edad >= 60) {
            totalViejos++;
            sumaPesoViejos += peso;
        }
    }

    public double calcularPromedio(double suma, int total) {
        return total == 0 ? 0 : suma / total;
    }

    @Override
    public void ejecutar(Scanner scanner) {
        System.out.println("Ingrese los datos de 100 personas (edad y peso):");

        for (int i = 1; i <= 100; i++) {
            System.out.print("Persona " + i + " - Edad: ");
            int edad = scanner.nextInt();
            System.out.print("Persona " + i + " - Peso: ");
            double peso = scanner.nextDouble();
            clasificarPersona(edad, peso);
        }

        System.out.println("\nPromedios de peso por categoría:");
        System.out.println("Niños: " + calcularPromedio(sumaPesoNinos, totalNinos));
        System.out.println("Jóvenes: " + calcularPromedio(sumaPesoJovenes, totalJovenes));
        System.out.println("Adultos: " + calcularPromedio(sumaPesoAdultos, totalAdultos));
        System.out.println("Viejos: " + calcularPromedio(sumaPesoViejos, totalViejos));
    }

}

/**
 * Una empresa requiere realizar el cálculo de la nómina semanal de un conjunto
 * M de empleados; para ello dispone que los datos de entrada son: nombre,
 * nacionalidad (V o E), edad, tipo de empleado (1,2,3) y número de horas
 * trabajadas. Con esta información se desea calcular e imprimir:
 * a. Sueldo básico o bruto. Considere para ello que el pago por hora depende
 * del tipo de empleado, según la siguiente distribución:
 * • Si el tipo empleado es 1 Bs. 5000
 * • Si el tipo empleado es 2 Bs. 10000
 * • Si el tipo empleado es 3 Bs. 15000
 * b. Seguro Social, que corresponde al 3% del Sueldo Básico, si éste último es
 * mayor a 100000.
 * c. Total, de venezolanos por tipo de empleado.
 * d. Total, de Extranjeros cuya edad es impar.
 * e. Promedio de edad de todos los empleados.
 * f. Total, general a pagar en sueldos.
 */

class Ejercicio53 implements EstructuraControlRepetitivo {
    private String nombre, nacionalidad;
    private int edad, tipoEmpleado, horasTrabajadas, numEmpleados, salarioBase, contadorV1, contadorV2, contadorV3,
            contadorE;
    private double seguroSocial, totalGeneralSueldos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(int tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getContadorV1() {
        return contadorV1;
    }

    public void setContadorV1(int contadorV1) {
        this.contadorV1 = contadorV1;
    }

    public int getContadorV2() {
        return contadorV2;
    }

    public void setContadorV2(int contadorV2) {
        this.contadorV2 = contadorV2;
    }

    public int getContadorV3() {
        return contadorV3;
    }

    public void setContadorV3(int contadorV3) {
        this.contadorV3 = contadorV3;
    }

    public int getContadorE() {
        return contadorE;
    }

    public void setContadorE(int contadorE) {
        this.contadorE = contadorE;
    }

    public double getSeguroSocial() {
        return seguroSocial;
    }

    public void setSeguroSocial(double seguroSocial) {
        this.seguroSocial = seguroSocial;
    }

    public double getTotalGeneralSueldos() {
        return totalGeneralSueldos;
    }

    public void setTotalGeneralSueldos(double totalGeneralSueldos) {
        this.totalGeneralSueldos = totalGeneralSueldos;
    }

    @Override
    public void ejecutar(Scanner scanner) {
        System.out.println("Por favor ingrese el número de empleados: ");
        setNumEmpleados(scanner.nextInt());
        scanner.nextLine();

        for (int i = 1; i <= getNumEmpleados(); i++) {
            System.out.print("Por favor ingrese el nombre del empleado: ");
            setNombre(scanner.nextLine());
            System.out.print("Por favor ingrese la nacionalidad del empleado (V o E): ");
            setNacionalidad(scanner.nextLine().toLowerCase());
            System.out.print("Por favor ingrese la edad del empleado: ");
            setEdad(scanner.nextInt());
            System.out.print("Por favor ingrese el tipo de empleado (1, 2 o 3): ");
            setTipoEmpleado(scanner.nextInt());
            System.out.print("Por favor ingrese el número de horas trabajadas: ");
            setHorasTrabajadas(scanner.nextInt());
            scanner.nextLine();

            switch (getTipoEmpleado()) {
                case 1:
                    setSalarioBase(5000 * getHorasTrabajadas());
                    break;
                case 2:
                    setSalarioBase(10000 * getHorasTrabajadas());
                    break;
                case 3:
                    setSalarioBase(15000 * getHorasTrabajadas());
                    break;
            }

            setSeguroSocial((getSalarioBase() > 100000) ? getSalarioBase() * 0.03 : 0);
            System.out.println("El sueldo básico del empleado " + getNombre() + " es: " + getSalarioBase());
            System.out.println("El seguro social del empleado " + getNombre() + " es: " + getSeguroSocial());
            System.out.println(
                    "El total a pagar al empleado " + getNombre() + " es: " + (getSalarioBase() + getSeguroSocial()));
            setTotalGeneralSueldos(getTotalGeneralSueldos() + getSalarioBase() + getSeguroSocial());

            if (getNacionalidad().equals("v")) {
                if (getTipoEmpleado() == 1) {
                    setContadorV1(getContadorV1() + 1);
                } else if (getTipoEmpleado() == 2) {
                    setContadorV2(getContadorV2() + 1);
                } else if (getTipoEmpleado() == 3) {
                    setContadorV3(getContadorV3() + 1);
                }
            } else if (getNacionalidad().equals("e")) {
                if (getEdad() % 2 != 0) {
                    setContadorE(getContadorE() + 1);
                }
            } else {
                System.out.println("Entrada inválida, por favor ingrese V o E");
                i--;
            }
        }

        System.out.println("Empleados venezolanos por tipo:");
        System.out.println("El total de empleados venezolanos tipo 1 es: " + getContadorV1());
        System.out.println("El total de empleados venezolanos tipo 2 es: " + getContadorV2());
        System.out.println("El total de empleados venezolanos tipo 3 es: " + getContadorV3());

        System.out.println("El total de empleados extranjeros con edad impar es: " + getContadorE());

        System.out.println("\nTotal general a pagar en sueldos: " + getTotalGeneralSueldos());
    }
}

/***
 * Un investigador acaba de aplicar 64 cuestionarios de 23 preguntas cada uno;
 * donde cada pregunta permite escoger entre 1 y 5, a un grupo de personas que
 * constituyen su población. Se desea que elabore un Programa, para ayudar al
 * Investigador a procesar toda la información recopilada, para ello tome en
 * cuenta lo siguiente: necesita calcular el promedio de cada instrumento o
 * escala para lo cual es necesaria la fórmula: PT/NT, donde PT representa el
 * total de puntos de cada cuestionario que resulta de sumar los valores que el
 * encuestado, encerró entre un círculo y NT es el total de preguntas del
 * instrumento. Estos valores se deben acumular, para al final calcular y
 * mostrar lo siguiente:
 * a. La media o promedio de todos los cuestionarios (promedio general).
 * b. El promedio más alto obtenido y número de instrumento a que corresponde.
 * c. El promedio más bajo obtenido y número de instrumento a que corresponde.
 * d. Porcentaje de cuestionarios que obtuvieron un promedio inferior a 3,
 * respecto a los que tuvieron un promedio superior a 4.
 * e. Porcentaje de cuestionarios que obtuvieron un promedio entre 4.5 y 5
 * respecto al total procesado.
 */

class Ejercicio54 implements EstructuraControlRepetitivo {

    private static final int TotalCuestionarios = 64;
    private static final int TotalPreguntas = 23;

    private double[] promedios = new double[TotalCuestionarios];
    private double sumaTotal = 0;
    private double promedioMaximo = Double.MIN_VALUE;
    private double promedioMinimo = Double.MAX_VALUE;
    private int cuestionarioMaximo = -1;
    private int cuestionarioMinimo = -1;
    private int contadorInferior3 = 0;
    private int contadorSuperior4 = 0;
    private int contadorEntre4_5y5 = 0;

    @Override
    public void ejecutar(Scanner scanner) {
        // Procesar los cuestionarios
        for (int i = 0; i < TotalCuestionarios; i++) {
            double sumaCuestionario = 0;
            System.out.println("Cuestionario " + (i + 1) + ":");
            for (int j = 0; j < TotalPreguntas; j++) {
                System.out.print("Pregunta " + (j + 1) + ": ");
                int respuesta = scanner.nextInt();
                while (respuesta < 1 || respuesta > 5) {
                    System.out.print("Respuesta inválida. Ingrese un valor entre 1 y 5: ");
                    respuesta = scanner.nextInt();
                }
                sumaCuestionario += respuesta;
            }
            // Promedio del cuestionario
            promedios[i] = sumaCuestionario / TotalPreguntas;
            sumaTotal += promedios[i];

            // Actualizar promedio máximo y mínimo
            if (promedios[i] > promedioMaximo) {
                promedioMaximo = promedios[i];
                cuestionarioMaximo = i + 1;
            }
            if (promedios[i] < promedioMinimo) {
                promedioMinimo = promedios[i];
                cuestionarioMinimo = i + 1;
            }

            // Contar cuestionarios según las condiciones
            if (promedios[i] < 3) {
                contadorInferior3++;
            } else if (promedios[i] > 4) {
                contadorSuperior4++;
            }
            if (promedios[i] >= 4.5 && promedios[i] <= 5) {
                contadorEntre4_5y5++;
            }

            System.out.println("El promedio del cuestionario " + (i + 1) + " es: " + promedios[i]);
        }

        // Resultados finales
        double promedioGeneral = sumaTotal / TotalCuestionarios;
        double porcentajeMenor3vsMayor4 = (contadorSuperior4 > 0)
                ? (contadorInferior3 * 100.0) / contadorSuperior4
                : 0;
        double porcentajeEntre4_5y5 = (contadorEntre4_5y5 * 100.0) / TotalCuestionarios;

        System.out.println("\nResultados finales:");
        System.out.println("a. Promedio general de todos los cuestionarios: " + promedioGeneral);
        System.out.println("b. Promedio más alto: " + promedioMaximo + " (Cuestionario " + cuestionarioMaximo + ")");
        System.out.println("c. Promedio más bajo: " + promedioMinimo + " (Cuestionario " + cuestionarioMinimo + ")");
        System.out.println(
                "d. Porcentaje de cuestionarios con promedio < 3 respecto a > 4: " + porcentajeMenor3vsMayor4 + "%");
        System.out.println("e. Porcentaje de cuestionarios con promedio entre 4.5 y 5: " + porcentajeEntre4_5y5 + "%");
    }
}

/**
 * Calcule e imprima el número de términos necesarios para que el valor de la
 * siguiente sumatoria se aproxime los más cercanamente a 1000 sin que lo
 * exceda: ∑((k∧2+1)/k), donde k=1,2,3,4,...
 */

class Ejercicio55 implements EstructuraControlRepetitivo {

    private double sumatoria;
    private int numeroTerminos;

    // Constructor
    public Ejercicio55() {
        this.sumatoria = 0;
        this.numeroTerminos = 0;
    }

    public double getSumatoria() {
        return sumatoria;
    }

    public void setSumatoria(double sumatoria) {
        this.sumatoria = sumatoria;
    }

    public int getNumeroTerminos() {
        return numeroTerminos;
    }

    public void setNumeroTerminos(int numeroTerminos) {
        this.numeroTerminos = numeroTerminos;
    }

    @Override
    public void ejecutar(Scanner scanner) {
        setSumatoria(0);
        setNumeroTerminos(0);

        int k = 1; // Contador para los términos
        while (true) {
            double termino = (Math.pow(k, 2) + 1) / k; // Calcular el término actual

            // Verificar si agregar el término excede 1000
            if (getSumatoria() + termino > 1000) {
                break; // Detener el bucle si excede
            }

            setSumatoria(getSumatoria() + termino);
            setNumeroTerminos(getNumeroTerminos() + 1);
            k++;
        }

        System.out.println("Número de términos necesarios: " + getNumeroTerminos());
        System.out.println("Valor final de la sumatoria: " + getSumatoria());
    }
}

/**
 * Efectuar la división de dos números enteros, utilizando el método de las
 * restas sucesivas. Observe el siguiente ejemplo:
 * a. Dividir 8 entre 2
 * b. 8 – 2 = 6
 * c. 6 – 2 = 4 número de restas efectuadas es igual al cociente =4
 * d. 4 – 2 = 2
 * e. 2 – 2 = 0 resto de la división
 */
class Ejercicio56 implements EstructuraControlRepetitivo {
    private int dividendo;
    private int divisor;
    private int cociente;
    private int residuo;

    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public int getCociente() {
        return cociente;
    }

    public void setCociente(int cociente) {
        this.cociente = cociente;
    }

    public int getResiduo() {
        return residuo;
    }

    public void setResiduo(int residuo) {
        this.residuo = residuo;
    }

    @Override
    public void ejecutar(Scanner scanner) {
        System.out.print("Ingrese el dividendo: ");
        setDividendo(scanner.nextInt());

        System.out.print("Ingrese el divisor: ");
        setDivisor(scanner.nextInt());

        if (getDivisor() <= 0) {
            System.out.println("El divisor debe ser mayor que 0.");
            return;
        }

        setCociente(0);
        setResiduo(getDividendo());

        // Realizar las restas sucesivas
        while (getResiduo() >= getDivisor()) {
            setResiduo(getResiduo() - getDivisor()); // Restar el divisor del residuo
            setCociente(getCociente() + 1); // Incrementar el cociente
        }

        System.out.println("Cociente: " + getCociente());
        System.out.println("Residuo: " + getResiduo());
    }
}

/**
 * Para calcular la raíz cuadrada de un número N positivo, Herón de Alejandría
 * ideó la siguiente fórmula: RN = (X + N / X) /2, donde RN es la raíz de N y se
 * calcula hasta cuando la diferencia entre X y RN es menor que 0.000001;
 * tomando X el valor de RN en cada iteración. Se debe leer el número y asegurar
 * que es positivo. Se puede iniciar el cálculo dándole a X el valor 0.1.
 */
class Ejercicio57 implements EstructuraControlRepetitivo {

    private double n; // Número del cual se calculará la raíz cuadrada
    private double rn; // Resultado aproximado de la raíz cuadrada

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public double getRn() {
        return rn;
    }

    private void setRn(double rn) {
        this.rn = rn;
    }

    @Override
    public void ejecutar(Scanner scanner) {
        System.out.print("Ingrese un número positivo para calcular su raíz cuadrada: ");
        setN(scanner.nextDouble());

        if (getN() <= 0) {
            System.out.println("El número debe ser positivo.");
            return;
        }

        double x = 0.1;
        setRn(0);

        // Iterar hasta que la diferencia entre X y RN sea menor que 0.000001
        do {
            setRn((x + getN() / x) / 2); // Calcular RN
            x = getRn(); // Actualizar X con el valor de RN
        } while (Math.abs(x - getRn()) >= 0.000001);

        System.out.println("La raíz cuadrada aproximada de " + getN() + " es: " + getRn());
    }
}

/**
 * Muchos bancos y cajas de ahorro calculan los intereses de las cantidades
 * depositadas por los clientes diariamente con base en las siguientes premisas:
 * un capital de $1000, con una tasa de interés del 6%, renta un interés en un
 * día de 0.06 multiplicado por 1000 y dividido por 365. Esta operación
 * producirá $0.16 de interés y el capital acumulado será 1000,16. El interés
 * para el segundo día se calculará multiplicando 0.06 por 1000 y dividiendo el
 * resultado por 365. Diseñar un programa que reciba tres entradas: el capital a
 * depositar, la tasa de interés y la duración del depósito en semanas y calcule
 * el capital total acumulado al final del período de tiempo especificado.
 */

 class Ejercicio58 implements EstructuraControlRepetitivo {
    private double capitalInicial;
    private double tasaInteres;
    private int duracionSemanas;
    private double capitalTotal;

    public double getCapitalInicial() {
        return capitalInicial;
    }

    public void setCapitalInicial(double capitalInicial) {
        this.capitalInicial = capitalInicial;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public int getDuracionSemanas() {
        return duracionSemanas;
    }

    public void setDuracionSemanas(int duracionSemanas) {
        this.duracionSemanas = duracionSemanas;
    }

    public double getCapitalTotal() {
        return capitalTotal;
    }

    private void setCapitalTotal(double capitalTotal) {
        this.capitalTotal = capitalTotal;
    }

    @Override
    public void ejecutar(Scanner scanner) {
        System.out.print("Ingrese el capital inicial: ");
        setCapitalInicial(scanner.nextDouble());

        System.out.print("Ingrese la tasa de interés anual (en porcentaje): ");
        setTasaInteres(scanner.nextDouble());

        System.out.print("Ingrese la duración del depósito en semanas: ");
        setDuracionSemanas(scanner.nextInt());

        // Validar que los valores sean positivos
        if (getCapitalInicial() <= 0 || getTasaInteres() <= 0 || getDuracionSemanas() <= 0) {
            System.out.println("Todos los valores deben ser positivos.");
            return;
        }

        // Convertir la tasa de interés a decimal
        double tasaInteresDecimal = getTasaInteres() / 100;

        // Convertir la duración en semanas a días
        int duracionDias = getDuracionSemanas() * 7;

        // Inicializar el capital acumulado
        double capitalActual = getCapitalInicial();

        // Calcular el capital acumulado día a día
        for (int i = 0; i < duracionDias; i++) {
            double interesDiario = (tasaInteresDecimal * capitalActual) / 365;
            capitalActual += interesDiario;
        }

        setCapitalTotal(capitalActual);

        System.out.println("El capital total acumulado al final del período es: $" + getCapitalTotal());
    }
}