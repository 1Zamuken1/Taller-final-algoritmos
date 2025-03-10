public class Laminas_Hierro_16 {
    public static void main(String[] args) {
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
