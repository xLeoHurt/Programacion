import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //datos de usuario
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese su ciudad: ");
        String ciudad = sc.nextLine();

        System.out.println("ingrese su colonia: ");
        String colonia = sc.nextLine();

        System.out.println("ingrese su calle: ");
        String calle = sc.nextLine();

        System.out.println("ingrese su numero: ");
        String numero = sc.nextLine();

        System.out.println("nombre donde curso primaria: ");
        String primaria = sc.nextLine();

        System.out.println("nombre donde curso su secundaria: ");
        String secundaria = sc.nextLine();

        System.out.println("nombre donde curso preparatoria: ");
        String preparatoria = sc.nextLine();

        System.out.println("deporte favorito: ");
        String deporte = sc.nextLine();

        System.out.println("Mi ciudad es:\n " + ciudad + "\n mi domicilio es " + "\ncolonia: " + " " + colonia + " " + "\ncalle: " + " " + calle + " " + "\nnumero: " + " " + numero);
        System.out.println("\nEstudie en:\n " + "primaria: " + " " + primaria + " " + "\nsecundaria: " + " " + secundaria + " " + "\npreparatoria: " + " " + preparatoria);
        System.out.println("\nMi deporte favorito es: " + deporte);
    }
}