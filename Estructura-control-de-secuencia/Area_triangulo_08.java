/*
 Calcule el área de un triángulo en función de las longitudes de sus lados, utilizando la fórmula:
√p(p­a)(p­b)(p­c) donde p = (a+b+c) / 2
 */

import java.util.Scanner;

public class Area_triangulo_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lado_a = 0, lado_b = 0, lado_c = 0, perimetro, area;

        System.out.println("Programa que calcula el área de un triángulo");
        System.out.print("Por favor ingrese la longitud del lado A: ");
        lado_a = scanner.nextDouble();

        System.out.print("Por favor ingrese la longitud del lado B: ");
        lado_b = scanner.nextDouble();

        System.out.print("Por favor ingrese la longitud del lado C: ");
        lado_c = scanner.nextDouble();

        scanner.close();

        perimetro = (lado_a + lado_b + lado_c) / 2;
        area = Math.sqrt(perimetro * (perimetro - lado_a) * (perimetro - lado_b) * (perimetro - lado_c));
        System.out.println("El área del triángulo es: " + area);

    }
}
