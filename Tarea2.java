import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ingresa la cantidad de numeros a evaluar:" );
        int numeros = input.nextInt();

        int pares = 0;
        int impares = 0;

        for (int contador = 0; contador < numeros; contador++) {
            System.out.println("Ingrese el numero " + (contador + 1 ) + ":" );
            int numero = input.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
    }
}