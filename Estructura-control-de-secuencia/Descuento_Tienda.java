import java.util.Scanner;

public class Descuento_Tienda {
    public static void main(String[] args) {
        Scanner compras = new Scanner(System.in);
        float contador_compras = 0, total = 0, descuento = 0;
        String entrada;

        System.out.println("Programa para calcular el 15% de sus compras en la tienda");
        do {
            System.out.println("Ingrese el precio del producto o fin para terminar");
            entrada = compras.next();

            if(entrada.equalsIgnoreCase("fin")){
                break;
            }

            try{
                contador_compras = Float.parseFloat(entrada);

                if (contador_compras < 0){
                    System.out.println("Precio ingresado es negativo, por favor intente de nuevo");
                    continue;
                }
                total += contador_compras;  
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Ingrese un número o 'fin'.");
            }

          } while(!entrada.equalsIgnoreCase("fin"));

          compras.close();

          descuento = (total * 10)/100;
          System.out.println("Total de compras: $"+total);
          System.out.println("Descuento aplicado: "+descuento);
          System.out.println("Total a pagar: $"+(total-descuento));
    }
}
