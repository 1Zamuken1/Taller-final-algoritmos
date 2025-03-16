import java.util.Scanner;
import Estructura_Control_De_Secuencia.*;

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

            switch (option) {
                case 1:
                    obtener_edades_01.ejecutar(scanner);
                    break;
                case 2:
                    Porcentaje_Banco_02.ejecutar(scanner);
                    break;
                case 3:
                    Comisiones_Sueldo_03.ejecutar(scanner);
                    break;
                case 4:
                    Descuento_Tienda_04.ejecutar(scanner);
                    break;
                case 5:
                    Calificacion_Computacion_05.ejecutar(scanner);
                    break;
                case 6:
                    Porcentaje_Alumnos_06.ejecutar(scanner);
                    break;
                case 7:
                    Conversor_metros_pies_pulgadas_07.ejecutar(scanner);
                    break;
                case 8:
                    Area_triangulo_08.ejecutar(scanner);
                    break;
                case 9:
                    Salario_Horas_09.ejecutar(scanner);
                    break;
                case 10:
                    Cambio_Divisas_10.ejecutar(scanner);
                    break;
                case 11:
                    Salario_Deducibles_11.ejecutar(scanner);
                    break;
                case 12:
                    Promedio_Materias_Dificiles_12.ejecutar(scanner);
                    break;
                case 13:
                    Bancos_N_Billetes_13.ejecutar(scanner);
                    break;
                case 14:
                    Sistema_Ecuaciones_Lineales_14.ejecutar(scanner);
                    break;
                case 15:
                    Mes_Luz_15.ejecutar(scanner);
                    break;
                case 16:
                    Laminas_Hierro_16.ejecutar();
                    break;
                case 17:
                    PVP_17.ejecutar(scanner);
                    break;
                case 18:
                    Surtir_Gasolinera_18.ejecutar(scanner);
                    break;
                case 19:
                    Presupuesto_Hospital_19.ejecutar(scanner);
                    break;
                case 20:
                    Interes_Anual_20.ejecutar(scanner);
                    break;
                case 21:
                    Agricultor_Mayorista_21.ejecutar(scanner);
                    break;
                case 22:
                    Recargo_Computador_22.ejecutar(scanner);
                    break;
                case 23:
                    Tonelada_Maiz_23.ejecutar(scanner);
                    break;
                default:
                    System.out.println("\n╔══════════════════════════════════════════╗");
                    System.out.println("║ Opción no válida. Intente de nuevo.     ║");
                    System.out.println("╚═════════════════════════════════════════╝");
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
