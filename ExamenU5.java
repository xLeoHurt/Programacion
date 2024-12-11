import java.util.Random;
import java.util.Scanner;

public class ExamenU5 {

    //Calcular promedio
    public static int calacularPromedio(int[][] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                suma += array[i][j];
            }
        }
        int promedio = suma / array.length;
        return promedio;
    }

    //Suma diagonal Inferior
    public static int sumaDI(int[][] array, int promedio) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i > j && array[i][j] < promedio) {
                    suma += array[i][j];
                }
            }
        }
        return suma;
    }

    //suma diagonal superior
    public static int sumaDS(int[][] array, int promedio) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i < j && array[i][j] < promedio) {
                    suma += array[i][j];

                }
            }
        }
        return suma;
    }

    //Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Introduce el numero: ");
        int numero = sc.nextInt();
        System.out.println("Introduce el numero 2: ");
        int numero2 = sc.nextInt();

        int[][] array = new int[numero][numero2];

        //Imprecion de

        System.out.println("la matriz aleatoria es");
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                array[i][j] = rand.nextInt(100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        //Imprecion de funciones
        int promedio = calacularPromedio(array);
        System.out.println("el promedio es = " + calacularPromedio(array) +
                ", La suma de los elementos de la diagonal inferior es: " + sumaDI(array, promedio)
                + ", la suma de los elementos de la diagonal superior es: " + sumaDS(array, promedio));
    }
}
