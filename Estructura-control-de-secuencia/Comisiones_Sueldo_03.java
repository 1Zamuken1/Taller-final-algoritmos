
/*
 Un vendedor recibe un sueldo base, más un 10% extra por comisiones de sus ventas. El vendedor
desea saber cuánto dinero obtendrá por concepto de comisiones por las tres ventas que realizó en
el mes y el total que recibirá tomando en cuenta su sueldo base y sus comisiones.
 */
import java.util.Scanner;

public class Comisiones_Sueldo_03 {
    public static void main(String[] args) {
        float comision, total;
        Scanner ingresos = new Scanner(System.in);

        System.out.println("Programa que calcula sueldo base más comisión");
        System.out.println("Ingrese el monto de su sueldo base");
        float salario = ingresos.nextFloat();

        System.out.println("Ingrese el valor de la primer venta");
        float venta1 = ingresos.nextInt();

        System.out.println("Ingrese el valor de la segunda venta");
        float venta2 = ingresos.nextFloat();

        System.out.println("Ingrese el valor de la tercer venta");
        float venta3 = ingresos.nextFloat();

        comision = ((venta1 + venta2 + venta3) * 10) / 100;
        total = (salario + comision);

        System.out.printf("El total de su pago es de: $" + total);

        ingresos.close();

    }
}