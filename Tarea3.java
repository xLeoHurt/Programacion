import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos números de la serie Fibonacci deseas ver?");
        int n = sc.nextInt();

        int num1 = 1;
        int num2 = 1;
        int contador = 1;

        System.out.print(num1);

        while (contador < n) {
            System.out.print(", " + num2);

            int siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;

            contador++;
        }
    }
}