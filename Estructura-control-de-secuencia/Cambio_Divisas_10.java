import java.util.Scanner;

public class Cambio_Divisas_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        scanner.close();
    }
}
