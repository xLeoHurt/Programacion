import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        //Condiciones para el empleo
        System.out.println("===SOLICITUD DE EMPLEO===" );
        System.out.println("Ingrese su nacionalidad");
        String nacionalidad = input.nextLine();
        if (nacionalidad.equalsIgnoreCase("Mexicana")) {
            System.out.println("Calificado para el empleo");
        } else {
            System.out.println("Ingrese su tipo de visa");
            String tipoVisa = input.nextLine();

            if (tipoVisa.equalsIgnoreCase("Trabajo")) {
                System.out.println("ingrese sus años de experiencia: ");
                double añosDeExperiencia = input.nextDouble();
                input.nextLine();

                    if (añosDeExperiencia > 5) {
                        System.out.println("Calificado para el empleo");
                    } else {
                        System.out.println("No califica para el empleo");
                    }
                }
            }
        //Tienda en linea
        System.out.println("===TIENDA EN LINEA===");
        System.out.println("Lugar de residencia USA/EUROPA");
        String lugarDeresidencia = input.nextLine();
        if (lugarDeresidencia.equalsIgnoreCase("USA")) {
            System.out.println("Ingrese codigo Postal");
            String codigoPostal = input.nextLine();

            if (codigoPostal.charAt(0) == '9'){
                System.out.println("A hecho compras antes? true/false");
                boolean comprasAntes = input.nextBoolean();
                input.nextLine();

                if (comprasAntes == true) {
                    System.out.println("Puede comprar con paypal");
                } else {
                    System.out.println("Favor de verificar con su direccion");
                }
                if (codigoPostal.charAt(0) != '9') {
                    System.out.println("Use su tarjeta de credito");
                }
            }
        }
        if (lugarDeresidencia.equalsIgnoreCase("EUROPA")) {
            System.out.println("Ingrese codigo Postal");
            String codigoPostal = input.nextLine();

            if (codigoPostal.length() == 5) {
                System.out.println("A hecho compras antes? true/false");
                boolean comprasAntes = input.nextBoolean();
                input.nextLine();

                if (comprasAntes == true) {
                    System.out.println("Puede comprar con paypal");
                } else {
                    System.out.println("Favor de verificar con su direccion");
                }
                if (codigoPostal.length() != 5) {
                    System.out.println("Compra Rechazada");
                }
                if (lugarDeresidencia != "USA" || lugarDeresidencia != "EUROPA") {
                    System.out.println("Verificacion manual");
                    System.out.println("Ingrese Paies de residencia");
                    String paisDeReesidencia = input.nextLine();
                    System.out.println("Codigo Postal");
                    double codigoPostal2 = input.nextDouble();
                    input.nextLine();
                    System.out.println("Compra aceptada");

                }
            }
        }
        //Disponibiladad de habitaciones
        System.out.println("===RESERVAS PARA UN HOTEL===");
        System.out.println("Ingrese numero de huespedes");
        double cantidadDePersonas = input.nextDouble();
        input.nextLine();
            boolean disponible = true;
            boolean noDisponible = false;

        if (cantidadDePersonas == 1) {
            System.out.println("Habitacion estandar o suite");
            String  tipoDeHabitacion = input.nextLine();

            if (tipoDeHabitacion.equalsIgnoreCase("suite")&&disponible) {
                System.out.println("Numero de noches para la reserva");
                int numeroDeNoches = input.nextInt();
                input.nextLine();
                if (numeroDeNoches > 3) {
                    System.out.println("Obtuvo un descuento del 10%!!!");
                } else {
                    System.out.println("Por el momento solo contamos con habitaciones estandar");
                }
            }
        }
        if (cantidadDePersonas >= 2) {
            System.out.println("Habitacion estandar o suite");
            String  tipoDeHabitacion = input.nextLine();

            if (tipoDeHabitacion.equalsIgnoreCase("suite")&&disponible) {
                System.out.println("Numero de noches para la reserva");
                int numeroDeNoches3 = input.nextInt();
                input.nextLine();

                if (numeroDeNoches3 > 5) {
                    System.out.println("Obtuvo un paquete con desayuno incluido!!!");
                } else if (numeroDeNoches3 <= 5) {
                    System.out.println("Disfrute su estadia");
                }
            }
        }
    }
}
