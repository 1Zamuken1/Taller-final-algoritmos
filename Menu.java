import java.util.Scanner;

/**
 * Clase que implementa tres menús para seleccionar y ejecutar diferentes
 * ejercicios siguiendo los principios de Programación Orientada a Objetos.
 */
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n╔═══════════════════════════╗");
            System.out.println("║    MENÚ DE SELECCIÓN      ║");
            System.out.println("╠═══════════════════════════╣");
            System.out.println("║  1. Estructura 1          ║");
            System.out.println("║     (Ejercicios 1-23)     ║");
            System.out.println("║  2. Estructura 2          ║");
            System.out.println("║     (Ejercicios 24-45)    ║");
            System.out.println("║  3. Salir                 ║");
            System.out.println("╚═══════════════════════════╝");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    ejecutarMenuEstructura1(scanner);
                    break;
                case 2:
                    ejecutarMenuEstructura2(scanner);
                    break;
                case 3:
                    System.out.println("\n╔═══════════════════════════════════╗");
                    System.out.println("║      Saliendo del programa        ║");
                    System.out.println("╚═══════════════════════════════════╝");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    // Método para ejecutar el menú de la Estructura 1 (Ejercicios 1-23)
    private static void ejecutarMenuEstructura1(Scanner scanner) {
        while (true) {
            System.out.println("\n╔═══════════════════════╗");
            System.out.println("║   MENÚ ESTRUCTURA 1    ║");
            System.out.println("╠════════════════════════╣");
            System.out.println("║     0. Salir           ║");
            // Ejercicios del 1 al 23
            for (int i = 1; i <= 23; i++) {
                System.out.printf("║   %2d. Ejercicio %2d     ║%n", i, i);
            }
            System.out.println("╠════════════════════════╣");
            System.out.println("║ Seleccione una opción: ║");
            System.out.println("╚════════════════════════╝");

            int option = scanner.nextInt();
            scanner.nextLine(); // Limpia el buffer después de nextInt()

            if (option == 0)
                break;

            ControlSecuencia ejercicio = null;

            switch (option) {
                case 1:
                    ejercicio = new Ejercicio1();
                    break;
                case 2:
                    ejercicio = new Ejercicio2();
                    break;
                case 3:
                    ejercicio = new Ejercicio3();
                    break;
                case 4:
                    ejercicio = new Ejercicio4();
                    break;
                case 5:
                    ejercicio = new Ejercicio5();
                    break;
                case 6:
                    ejercicio = new Ejercicio6();
                    break;
                case 7:
                    ejercicio = new Ejercicio7();
                    break;
                case 8:
                    ejercicio = new Ejercicio8();
                    break;
                case 9:
                    ejercicio = new Ejercicio9();
                    break;
                case 10:
                    ejercicio = new Ejercicio10();
                    break;
                case 11:
                    ejercicio = new Ejercicio11();
                    break;
                case 12:
                    ejercicio = new Ejercicio12();
                    break;
                case 13:
                    ejercicio = new Ejercicio13();
                    break;
                case 14:
                    ejercicio = new Ejercicio14();
                    break;
                case 15:
                    ejercicio = new Ejercicio15();
                    break;
                case 16:
                    ejercicio = new Ejercicio16();
                    break;
                case 17:
                    ejercicio = new Ejercicio17();
                    break;
                case 18:
                    ejercicio = new Ejercicio18();
                    break;
                case 19:
                    ejercicio = new Ejercicio19();
                    break;
                case 20:
                    ejercicio = new Ejercicio20();
                    break;
                case 21:
                    ejercicio = new Ejercicio21();
                    break;
                case 22:
                    ejercicio = new Ejercicio22();
                    break;
                case 23:
                    ejercicio = new Ejercicio23();
                    break;
                default:
                    System.out.println("\n╔══════════════════════════════════════════╗");
                    System.out.println("║ Opción no válida. Intente de nuevo.     ║");
                    System.out.println("╚═════════════════════════════════════════╝");
            }

            if (ejercicio != null) {
                ejercicio.ejecutar(scanner);
            }
        }
    }

    // Método para ejecutar el menú de la Estructura 2 (Ejercicios 24-45)
    private static void ejecutarMenuEstructura2(Scanner scanner) {
        while (true) {
            System.out.println("\n╔═══════════════════════╗");
            System.out.println("║   MENÚ ESTRUCTURA 2    ║");
            System.out.println("╠════════════════════════╣");
            System.out.println("║     0. Salir           ║");
            // Ejercicios del 24 al 45
            for (int i = 24; i <= 45; i++) {
                System.out.printf("║   %2d. Ejercicio %2d     ║%n", i - 23, i);
            }
            System.out.println("╠════════════════════════╣");
            System.out.println("║ Seleccione una opción: ║");
            System.out.println("╚════════════════════════╝");

            int option = scanner.nextInt();
            scanner.nextLine(); // Limpia el buffer después de nextInt()

            if (option == 0)
                break;

            EstructuraControlDesicion ejercicio = null;

            switch (option) {
                case 24:
                    ejercicio = new Ejercicio24();
                    break;
                case 25:
                    ejercicio = new Ejercicio25();
                    break;
                case 26:
                    ejercicio = new Ejercicio26();
                    break;
                case 27:
                    ejercicio = new Ejercicio27();
                    break;
                case 28:
                    ejercicio = new Ejercicio28();
                    break;
                case 29:
                    ejercicio = new Ejercicio29();
                    break;
                case 30:
                    ejercicio = new Ejercicio30();
                    break;
                case 31:
                    ejercicio = new Ejercicio31();
                    break;
                case 32:
                    ejercicio = new Ejercicio32();
                    break;
                case 33:
                    ejercicio = new Ejercicio33();
                    break;
                case 34:
                    ejercicio = new Ejercicio34();
                    break;
                case 35:
                    ejercicio = new Ejercicio35();
                    break;
                case 36:
                    ejercicio = new Ejercicio36();
                    break;
                case 37:
                    ejercicio = new Ejercicio37();
                    break;
                case 38:
                    ejercicio = new Ejercicio38();
                    break;
                case 39:
                    ejercicio = new Ejercicio39();
                    break;
                case 40:
                    ejercicio = new Ejercicio40();
                    break;
                case 41:
                    ejercicio = new Ejercicio41();
                    break;
                case 42:
                    ejercicio = new Ejercicio42();
                    break;
                case 43:
                    ejercicio = new Ejercicio43();
                    break;
                case 44:
                    ejercicio = new Ejercicio44();
                    break;
                case 45:
                    ejercicio = new Ejercicio45();
                    break;
                default:
                    System.out.println("\n╔══════════════════════════════════════════╗");
                    System.out.println("║ Opción no válida. Intente de nuevo.     ║");
                    System.out.println("╚═════════════════════════════════════════╝");
            }

            if (ejercicio != null) {
                ejercicio.ejecutar(scanner);
            }
        }
    }
}