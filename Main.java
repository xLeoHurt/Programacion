//Ejercicio 1

import java.util.Scanner;
    
public class Main {

    public static double celciusFarenheit ( double celcius){

        double farenheit = (celcius * (9.0 / 5)) + 32;
        return farenheit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la temperatura en celcius: ");
        double celcius = sc.nextInt();

        double farenheit = celciusFarenheit(celcius);


        System.out.println("La temperatura en farenheit es: " + farenheit);
    }
}

// ejercicio 2

public class Main {

    public static int calcularMedia(int sumaT, int numero ) {
        return sumaT/numero;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();

        int[] array = new int[numero];
        for (int i = 0; i < numero; i++) {
            array[i] = r.nextInt(100)+1;
        }

        int sumaT = 0;
        for (int i = 0; i < array.length; i++) {
            sumaT += array[i];
            System.out.print(" los numeros son: " + array[i] + "\n");
        }System.out.println();

        System.out.println("la suma total = " + sumaT);
        int media = calcularMedia(sumaT,numero);
        System.out.println("la media total = " + media);
    }
}


// ejercicio 3
public static void imprimirPositivos(int[] array) {
    System.out.println("Los numeros positivos del arreglo son: ");
    for (int i = 0; i < array.length; i++) {
        if (array[i] > 0) {
            System.out.print(array[i] + ",");
        }

    }
}
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("escoje la cantidad de espacios para el arreglo: ");
        int espacios = in.nextInt();


        int rangoMenos = -100;
        int rangoMas = 100;

        int[] array = new int[espacios];


        System.out.print("arreglo de numeros : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(rangoMas - rangoMenos) + rangoMenos;
            System.out.print(array[i] + ",");
        }
        System.out.println();

        imprimirPositivos(array);
 }