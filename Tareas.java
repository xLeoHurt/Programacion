import java.util.Scanner;
import java.util.Random;

public class Tareas {
    
    //T1
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingresa la cantidad de materias:");
    int cantidadMaterias = sc.nextInt();

    int contador = 0;
    int contMaterias = cantidadMaterias;
    int contadorPromedios = 0;


    while (contador < cantidadMaterias) {
        System.out.println("Ingresa Promedio:");
        int promedio = sc.nextInt();
        int sumaPromedio = promedio + contadorPromedios;
        System.out.println(sumaPromedio);
        contador ++;
        contadorPromedios += promedio;
        double promedioGeneral = sumaPromedio / cantidadMaterias;
        System.out.println("Tu promedio general es: " + promedioGeneral);
        if (promedioGeneral >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }

    //T2
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

        //T3
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
        
        //T4
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

        //T5
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = input.nextInt();
        System.out.print("Los divisores son: ");
        boolean esPrimo = true;
        boolean primerDivisor = true;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i != 1 && i != n) {
                    esPrimo = false;
                }
                if (!primerDivisor) {
                    System.out.print(", ");
                }
                System.out.print(i);
                primerDivisor = false;
            }
        }
        if (esPrimo) {
            System.out.println("\nEl número " + n + " es primo");
        }

        //T6
        Scanner input = new Scanner(System.in);
        char []  palindromo;
    System.out.println("Ingresa el numero para analizar:");
    String n = input.nextLine();
    palindromo = n.toCharArray();

    int ultimaPosicion = n.length()-1;
    int cont1 = 0;
    int cont2 = ultimaPosicion;
    while(cont1<=cont2){
        if (palindromo[cont1]==palindromo[cont2]){
            cont1++;
            cont2--;
        }else {
            System.out.println("Tu numero no es palindromo");
        }if(cont1==cont2){
            System.out.println("El numero es palindromo: ");
            }
            break;
        }

        //T8
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int numeroRandom = rand.nextInt(100)+1;
        int intentos = 0;
        boolean adivinar = false;

        System.out.println("Juego de adivinanza!!!");
        System.out.println("En que numero del 1 al 100 estoy pensando?");


        while(!adivinar) {
            System.out.println("Cual numero sera?");
            int numero = input.nextInt();
            intentos++;

            if (intentos == numeroRandom) {
                adivinar = true;
                System.out.println("Felicidades adivinaste el numero!");
                System.out.println("Y solo te llevo" + intentos + " intentos");
                
            } else if (intentos < numeroRandom) {
                System.out.println("El numero random es mayor");
            } else {
                System.out.println("El numero random es menor");
            }
        }

        //T9
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número del que quieres la tabla de multiplicar: ");
        int numeroParaMultiplicar = scanner.nextInt();
        System.out.print("Ingresa el rango hasta el que quieres la tabla: ");
        int rango = scanner.nextInt();
        System.out.println("\nTabla de multiplicar de " + numeroParaMultiplicar + ":");
        for (int contador = 1; contador <= rango; contador++) {
            int resultado = numeroParaMultiplicar * contador;
            System.out.println(numeroParaMultiplicar + " x " + contador + " = " + resultado);
        }

        //T10
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int num3 = scanner.nextInt();
        int menor, medio, mayor;
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                medio = num2;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                medio = num1;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num1;
            }
        } else {
            menor = num3;
            if (num1 <= num2) {
                medio = num1;
                mayor = num2;
            } else {
                medio = num2;
                mayor = num1;
            }
        }
        System.out.println("El orden correcto de los numeros es:\n");
        System.out.println(menor + ", " + medio + ", " + mayor);
}
