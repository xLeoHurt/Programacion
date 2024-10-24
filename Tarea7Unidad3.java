import java.util.Scanner;
public class Tarea7Unidad3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre completo: ");
        String nombreCompleto = input.nextLine();
        System.out.println("Ingrese la cantidad que desea solicitar: ");
        double cantidadSolicitada = input.nextDouble();
        System.out.println("Diganos sus ingresos mensuales: ");
        double ingresosMensuales = input.nextDouble();
        System.out.println("ingrese tiempo deseado para el prestamo:");
        double tiempoPrestamo = input.nextDouble();
        double variableN = tiempoPrestamo * 12;

        double tazaDeInteresUno = .06;
        double tazaDeInteresDos = .04;

        if (nombreCompleto.matches(".\\d.*")) {
            System.out.println("Corrija el nombre completo");
            input.nextLine();
        } else {
            System.out.println("introduzca puntaje crediticio si no esta entre 300 y 850 (mas le vale tener mas de 600)");
            int puntajeCrediticio = input.nextInt();
            input.nextLine();
            if (puntajeCrediticio < 600) {
                System.out.println("Su solicitud fue rechazada");
            } else if (puntajeCrediticio >= 600 && puntajeCrediticio < 740) {
                System.out.println("su taza de interes es del 6%");
                double cuotaMensualLineaUno = cantidadSolicitada * (Math.pow((tazaDeInteresUno*(1 + tazaDeInteresUno)),variableN));
                double cuotaMensualLineaDos = (Math.pow((1+tazaDeInteresUno), variableN))-1;
                double cuotaMensualFinal = cuotaMensualLineaUno/cuotaMensualLineaDos;
                double  montoTotalApagar = cuotaMensualFinal*variableN;
                System.out.println("Solicitud aceptada para: " + nombreCompleto + " " + "su taza de interes es del 6%" + " " + "$"+cuotaMensualFinal +"$"+montoTotalApagar );
                if (ingresosMensuales < (cuotaMensualFinal*3)) {
                    System.out.println("Su solicitud fue rechazada");
                } else
                    System.out.println("Fue aceptada");
                } else {
                    System.out.println("La taza de interes es del 4%");
                    double cuotaMensualTazaCuatroUno = cantidadSolicitada * (Math.pow((tazaDeInteresDos*(1 + tazaDeInteresDos)),variableN));
                    double cuotaMensualTazaCuatroDos = (Math.pow((1+tazaDeInteresDos), variableN))-1;
                    double cuotaMensualFinalCuatro = cuotaMensualTazaCuatroUno/cuotaMensualTazaCuatroDos;
                    System.out.println("Cuota mensual: " + cuotaMensualFinalCuatro);
                    double montoTotalApagarDos = cuotaMensualFinalCuatro*variableN;
                    System.out.println("Solicitud aprobada para: " + nombreCompleto + " " + "su taza de interes es del 4%" + cuotaMensualFinalCuatro + " " + montoTotalApagarDos);
            }
        }
    }
}
