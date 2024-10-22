import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Sistema de administracion de cursos
        System.out.println("===Sistema de administracion de cursos===");
        System.out.println("Ingrese Nombre completo: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese numero de identificacion(ID): ");
        String identificacion = sc.nextLine();
        System.out.println("Ingrese promedio General: ");
        double promedioGeneral = sc.nextDouble();
        System.out.println("Ingrese Cantidad de Materias a inscribir: ");
        int cantidadMaterias = sc.nextInt();

        if (promedioGeneral < 7.0) {
            System.out.println("No se puede inscribir");
        } else {
            if (cantidadMaterias >=7 && cantidadMaterias <=8.5) {
            } else if (cantidadMaterias <3) {
                System.out.println("Inscripcion realizada");
            } else if(cantidadMaterias>3) {
                System.out.println("Inscripcion rechazada por sobre carga academica");
            }
        }
        if (promedioGeneral >= 8.5) {
        } else {
            if(nombre.length()>25) {
                System.out.println("Corriga su nombre");
            }else{
                if(identificacion.length() < 8){
                    
                } {}
            }
        }
    }
}