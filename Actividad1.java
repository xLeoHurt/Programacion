import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Operaciones en clase
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese primer numero: ");
        int numeroUno = input.nextInt();
        System.out.println("Ingrese segundo numero: ");
        int numeroDos = input.nextInt();
        System.out.println("ingrese tercer numero: ");
        int numeroTres = input.nextInt();
        System.out.println("ingrese cuarto numero: ");
        double numeroCuatro = input.nextDouble();
        System.out.println("ingrese quinto numero: ");
        double numeroCinco = input.nextDouble();

        double lineaUno = (numeroUno / numeroCuatro) * ((numeroTres + numeroDos) / numeroCinco);
        double lineaDos = (numeroDos + numeroTres) * numeroCuatro;
        double lineaTres = (numeroCinco / numeroUno) + numeroDos/numeroTres - numeroCuatro;
        double lineaCuatro = numeroUno+numeroDos+numeroTres;

        double divisor = lineaUno/lineaDos;
        double dividendo = lineaTres/lineaCuatro;

        double resultado = divisor/dividendo;
        System.out.println(resultado);
    }
}