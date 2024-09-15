import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Primer producto entradas
        System.out.println("primer producto: ");
        String productoUno = sc.nextLine();
        System.out.println("cantidad de productos: ");
        int cantidadUno = sc.nextInt();
        System.out.println("precio base del producto: ");
        double precioBaseUno = sc.nextDouble();
        System.out.println("porcentaje de descuento: ");
        double porcentajeDescUno = sc.nextDouble();
        System.out.println("porcentaje de impuestos aplicables: ");
        double porcentajeImpUno = sc.nextDouble();

        //Segundo producto entradas
        System.out.println("Segundo producto: ");
        String productoSeg = sc.next();
        System.out.println("cantidad de productos: ");
        int cantidadDos = sc.nextInt();
        System.out.println("precio base del producto: ");
        double precioBaseDos = sc.nextDouble();
        System.out.println("porcentaje de descuento: ");
        double porcentajeDescDos = sc.nextDouble();
        System.out.println("porcentaje de impuestos aplicables: ");
        double porcentajeImpDos = sc.nextDouble();

        //Tercer producto entradas
        System.out.println("Tercer producto: ");
        String productoTres = sc.next();
        System.out.println("cantidad de productos: ");
        int cantidadTres = sc.nextInt();
        System.out.println("precio base del producto: ");
        double precioBaseTres = sc.nextDouble();
        System.out.println("porcentaje de descuento: ");
        double porcentajeDescTres = sc.nextDouble();
        System.out.println("porcentaje de impuestos aplicables: ");
        double porcentajeImpTres = sc.nextDouble();

        //calculos producto Uno
        System.out.println("resumen del pedido #1: ");
        double subtotalUno = precioBaseUno* cantidadUno;
        System.out.println("Subtotal del pedido #1: " + subtotalUno);
        double descuentoAplicadoUno = precioBaseUno*((porcentajeDescUno/100));
        System.out.println("Descuento aplicado #1: " + descuentoAplicadoUno);
        double impuestoUno = ((porcentajeImpUno/100)*subtotalUno);
        System.out.println("Impuesto aplicado #1: " + impuestoUno);
        double subtotalConDescuentoUno = subtotalUno-((porcentajeDescUno/100)*subtotalUno);
        System.out.println("Subtotal con descuento #1: "+ subtotalConDescuentoUno);
        double totalUno = subtotalConDescuentoUno+((porcentajeImpUno/100)*subtotalConDescuentoUno);
        System.out.println("Total a pagar producto #1: "+ totalUno + "\n");

        //Calculos producto Dos
        System.out.println("Resumen del pedido #2: ");
        double subtotalDos = precioBaseDos* cantidadDos;
        System.out.println("Subtotal del pedido #2: " + subtotalDos);
        double descuentoAplicadoDos = precioBaseDos*((porcentajeDescDos/100));
        System.out.println("Descuento aplicado #2: "+ descuentoAplicadoDos);
        double impuestoAplicadoDos = precioBaseDos*((porcentajeImpDos/100));
        System.out.println("Impuesto aplicado #2: "+ impuestoAplicadoDos);
        double subtotalConDescuentoDos = subtotalDos-((porcentajeDescDos/100)*subtotalDos);
        System.out.println("Subtotal con descuento #2: "+ subtotalConDescuentoDos);
        double totalDos = subtotalConDescuentoDos+((porcentajeImpDos/100)*subtotalConDescuentoDos);
        System.out.println("Total a pagar producto #2: "+ totalDos + "\n");

        //Calculo porducto Tres
        System.out.println("Resumen del pedido #3: ");
        double subtotalTres = precioBaseTres* cantidadDos;
        System.out.println("Subtotal del pedido #2: " + subtotalTres);
        double descuentoAplicadoTres = precioBaseTres*((porcentajeDescTres/100));
        System.out.println("Descuento aplicado #2: "+ descuentoAplicadoTres);
        double impuestoAplicadoTres = precioBaseTres*((porcentajeImpTres/100));
        System.out.println("Impuesto aplicado #2: "+ impuestoAplicadoTres);
        double subtotalConDescuentoTres = subtotalTres -((porcentajeDescTres/100)* subtotalTres);
        System.out.println("Subtotal con descuento #3: "+ subtotalConDescuentoTres);
        double totalTres = subtotalConDescuentoTres +((porcentajeImpTres/100)* subtotalConDescuentoTres);
        System.out.println("Total a pagar producto #3: "+ totalTres + "\n");

        double totalAcumulado = totalUno+totalDos+totalTres;
        System.out.println("Total de los 3 productos: " + totalAcumulado);

    }
}