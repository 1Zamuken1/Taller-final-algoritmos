import java.util.Scanner;

public class obtener{
    public static void main(String[] args) {
        int edad_f = 0;
        Scanner edades = new Scanner(System.in);

        System.out.println("Programa que suma 3 edades");
        System.out.println("Ingrese la edad del primer usuario");
        int edad1 = edades.nextInt();

        System.out.println("Ingrese la edad del segundo usuario");
        int edad2 = edades.nextInt();

        System.out.println("Ingrese la edad del tercer usuario");
        int edad3 = edades.nextInt();

        edad_f = edad1 + edad2 + edad3;
        System.out.println("La suma de las 3 edades ingresadas es de:"+ edad_f);

        edades.close();
    }
}