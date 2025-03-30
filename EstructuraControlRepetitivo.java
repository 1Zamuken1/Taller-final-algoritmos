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