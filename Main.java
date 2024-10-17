import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //Numeros divisibles entre 3 y 5
        System.out.println("Ingresar Numero: ");
        int numero = input.nextInt();

        boolean divisibleEntreTres = (numero % 3 == 0);
        boolean divisibleEntreCinco = (numero % 5 == 0);

        if (divisibleEntreTres && divisibleEntreCinco) {
            System.out.println("Es divisible");
        } else if (divisibleEntreTres || divisibleEntreCinco) {
            System.out.println("Es divisible");
        } else {
            System.out.println("No es divisible");
        }

        //Triangulos
        System.out.println("Ingresa primer Lado del triangulo");
        int ladoUno = input.nextInt();
        System.out.println("Ingresa segundo Lado del triangulo");
        int ladoDos = input.nextInt();
        System.out.println("Ingresa tercer Lado del triangulo");
        int ladoTres = input.nextInt();

        if (ladoUno == ladoDos && ladoDos == ladoTres) {
            System.out.println("El triangulo es Equilatero");
        } else if (ladoUno != ladoDos && ladoDos != ladoTres) {
            System.out.println("El triangulo es Escaleno");
        } else {
            System.out.println("El triangulo es Isosceles");
        }

        //Cantidad a pagar de impuestos

        System.out.println("Introduce tu salario: ");
        double salario = input.nextDouble();

        double impuesto = 0;

        if (salario <= 10000) {
            System.out.println("No paga impuestos");
        } else if (salario > 10000 && salario <= 20000 ) {
            impuesto = salario * .10;
            System.out.println("El impuesto a pagar es: " + impuesto);
        } else if (salario > 20000 ) {
            impuesto = salario * .20;
            System.out.println("El impuesto a pagar es: " + impuesto);
        }


        //Numero par o impar

        System.out.println("Ingresar Numero para determinar si es par o impar");
        double numeroDeterminado = input.nextDouble();

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}