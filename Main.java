import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //contador de numeros 1 al 10
        int contador = 1;

        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }


        //Contador de digitos
        System.out.println("Ingresa un numero: ");
        int numero = input.nextInt();
        int digitos = 0;
        int numeroParaCOntar = numero;

        while (numeroParaCOntar != 0) {
            digitos++;
            numeroParaCOntar /= 10;
        }
        System.out.println("La cantidad de digitos es " + digitos);


        //Imprimir numeros pares 1 al 20
        int contadorTres = 2;
        while (contadorTres <= 20) {
                System.out.println(contadorTres);
                contadorTres+=2;
        }


        //Suma de digitos
        System.out.println("Introduce un numero: ");
        int numeroContar  = input.nextInt();

        while (numeroContar >= 10) {
            int suma = (numeroContar / 10) + (numeroContar % 10);
            System.out.println(suma);
            numeroContar = suma / 10;
        }

        //Limite
        System.out.println("Ingrese el numero que desea como base");
        int n = input.nextInt();
        System.out.println("Ingrese el numero que desea como limite: ");
        int l = input.nextInt();
        int multiplo = n;
        while (multiplo <= l) {
            System.out.println(multiplo);
            multiplo += n;
        }
        System.out.println("Ingrese numero para invertir: ");
        int numeroIvertir = input.nextInt();
        while (numeroIvertir >= 1) {
            System.out.println("numero invertido: " + numeroIvertir);
            numeroIvertir--;
        }

        //Suma de solo digitos impares
        System.out.println("Ingrese el numero que desea: ");
        int numeroI = input.nextInt();
        int sumaDeImpares = 0;

        while (numeroI != 0) {
            int digitoImpar = numeroI % 10;
            if (numeroI % 2 != 0) {
                sumaDeImpares += numeroI;
            }
            numeroI = numeroI / 10;
        }
        System.out.println("El resultado de la suma es: " + sumaDeImpares);

        //contar las vocales
        System.out.println("Ingresar palabra: ");
        String palabra = input.next();
        int contadorDeVocales = 0;

        Pattern patron = Pattern.compile("[aeiou]");
        Matcher matcher = patron.matcher(palabra);

        while (matcher.find()) {
            contadorDeVocales++;
        }
        System.out.println("La palabra contiene: " + contadorDeVocales + "vocales");


        //Determinar si un numero es perfecto
        System.out.println("Ingrese un numero entero: ");
        int numeroEntero = input.nextInt();
        int sumaDedivisores = 0;
        int divisor = 1;

        while (numeroEntero < divisor) {
            if (numeroEntero % divisor == 0) {
                sumaDedivisores+=divisor;
            }
            divisor++;
        }
        if (sumaDedivisores == numeroEntero) {
            System.out.println("EL mumero que ingresaste es un numero perfecto");
        } else {
            System.out.println("El mumero que ingresaste no es numero perfecto");
        }
    }
}