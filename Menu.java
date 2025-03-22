import java.util.Scanner;

/**
 * Clase que implementa un menú para seleccionar y ejecutar diferentes
 * ejercicios
 * siguiendo los principios de Programación Orientada a Objetos.
 */
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;

        do {
            System.out.println("\n╔════════════════════════════════════════╗");
            System.out.println("║       MENÚ PRINCIPAL                    ║");
            System.out.println("╠═════════════════════════════════════════╣");
            System.out.println("║  1. Obtener edades                      ║");
            System.out.println("║  2. Calcular porcentaje banco           ║");
            System.out.println("║  3. Comisiones sueldo                   ║");
            System.out.println("║  4. Descuento tienda                    ║");
            System.out.println("║  5. Calificación computación            ║");
            System.out.println("║  6. Porcentaje alumnos                  ║");
            System.out.println("║  7. Conversor metros a pies y pulgadas  ║");
            System.out.println("║  8. Area triángulo                      ║");
            System.out.println("║  9. Salario horas                       ║");
            System.out.println("║ 10. Cambio divisas                      ║");
            System.out.println("║ 11. Salario deducibles                  ║");
            System.out.println("║ 12. Promedio materias difíciles         ║");
            System.out.println("║ 13. Bancos N Billetes                   ║");
            System.out.println("║ 14. Sistema ecuaciones lineales         ║");
            System.out.println("║ 15. Mes luz                             ║");
            System.out.println("║ 16. Láminas de hierro                   ║");
            System.out.println("║ 17. Precio de venta al público          ║");
            System.out.println("║ 18. Surtir gasolinera                   ║");
            System.out.println("║ 19. Presupuesto hospital                ║");
            System.out.println("║ 20. Interés anual                       ║");
            System.out.println("║ 21. Agricultor mayorista                ║");
            System.out.println("║ 22. Recargo computador                  ║");
            System.out.println("║ 23. Tonelada maíz                       ║");
            System.out.println("╠═════════════════════════════════════════╣");
            System.out.println("║ Seleccione una opción:                  ║");
            System.out.println("╚═════════════════════════════════════════╝");

            int option = scanner.nextInt();
            scanner.nextLine(); // Limpia el buffer después de nextInt()

            // Creamos un objeto que implementa la interfaz ControlSecuencia
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

            // Si se seleccionó un ejercicio válido, lo ejecutamos
            if (ejercicio != null) {
                ejercicio.ejecutar(scanner);
            }

            System.out.println("\n╔═══════════════════════════════════════════╗");
            System.out.println("║ ¿Desea realizar otro ejercicio? (S/N)     ║");
            System.out.println("╚═══════════════════════════════════════════╝");
            response = scanner.nextLine().trim().toLowerCase();

        } while (response.equals("s"));

        System.out.println("\n╔═══════════════════════════════════╗");
        System.out.println("║ Saliendo del programa . . .       ║");
        System.out.println("╚═══════════════════════════════════╝");
        scanner.close();
    }
}