//Ejercicio 1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Arreglo para calificaciones
        int calificaciones[] = new  int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce tu calificacion: ");
            calificaciones[i] = sc.nextInt();
        }

        int sumaCalif = 0;
        int promedio = 0;
        //Muestra las calificaciones
        for (int i=0; i<calificaciones.length; i++) {
            System.out.print(calificaciones[i]+" , ");
        }
        for (int i=0; i<calificaciones.length; i++) {
            sumaCalif += calificaciones[i];
            promedio = sumaCalif / 10;
        }
        System.out.println("El promedio es: "+"["+promedio+"]");
    }
}
//Ejercicio 2
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[15];
        System.out.println("introduce 15 numeros enteros");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Numero" + (i+1) + ":");
            array[i] = sc.nextInt();
        }
            int menor = array[0];
            int mayor = array[0];
            int posmayor = 0;
            int posmenor = 0;
            for (int i = 1; i < array.length; i++) {
                if (menor > array[i]) {
                    menor = array[i];
                    posmenor = i;
                } if (mayor < array[i]) {
                    mayor = array[i];
                    posmayor = i;
                }
            }
            System.out.println("EL numero mayor es: " + mayor + " en la posicion " + posmayor+1);
        System.out.println("EL numero menor es: " + menor + " en la posicion" + posmenor+1);
    }
}

//Ejercicio 3
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Ingrese la cantidad de arreglos para el array: ");
        int nArray = sc.nextInt();


        int array[] = new int[nArray];
        for (int i = 0; i < nArray; i++) {
                array[i] = r.nextInt(100)+1;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        boolean numContado[] = new boolean[101];
        for (int i = 0; i < nArray; i++) {
            if (!numContado[array[i]]) {
                int f = 0;
                for (int j = 0; j < nArray; j++) {
                    if (array[i] == array[j]) {
                        f++;
                    }
                }
             System.out.println("El número " + array[i] + " aparece " + f + " veces.");
                numContado[array[i]] = true;
            }
        }
    }
}

//Ejercicio 4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Asigne numeros enteros");
            array[i] = sc.nextInt();

        }

        System.out.println("los numeros al reverso son: ");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]+" ");
        }
    }
}

//Ejercicio 5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String array[] = new String[1];

        System.out.println("ingrese cadena de texto de 4 caracteres maximo: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese una cadena de texto: ");
            array[i] = sc.nextLine();
        }

        boolean esPalindromo = true;
        for (int i = 0; i < array.length / 2; i++) {
            if (!array[i].equals(array[array.length - 1 - i])) {
                esPalindromo = false;
                break;
            }
        }
        if (esPalindromo) {
            System.out.println("La cadena de texto es un palindromo: ");
        }else{
            System.out.println("La cadena de texto no es un palindromo: ");
        }
    }
}
//ejercicio 1.1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de posiciones para el arreglo");
        int c = sc.nextInt();
    int array[][] = new int[c][c];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Ingrese un numero para la posición [" + i + "][" + j + "]:");
                array[i][j] = sc.nextInt();
            }
        }


        System.out.println("la matriz es: ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int sF[] = new int[c];
        int sC[] = new int[c];
        for (int i = 0; i < c; i++){
            for (int j = 0; j < c; j++) {
                sF[i] += array[i][j];
                sC[j] += array[i][j];
            }
        }
        System.out.println("la suma de las filas son: ");
        for (int i = 0; i < c; i++) {
            System.out.println("La suma de la filas  "+ i  +": =" + sF[i]);
        }
        System.out.println("La sumas de las columnas  son: ");
        for(int j = 0; j < c; j++){
            System.out.println("La suma de la columna  " + j + ": =" + sC[j]);

        }

    }
}
//ejercicio 2.1
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("INGRESE LA CANTIDAD DE ARREGLOS PARA LA MATRIZ: ");
        int n = sc.nextInt();


            //Arreglo
            int array[][]=new int[n][n];


            //llenar la matriz de randoms
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    array[i][j] = r.nextInt(100)+1;
                }
            }

            //imprimir la matriz
        System.out.println("La matriz es: ");
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    System.out.print(array[i][j]+ " ");
                }
                System.out.println();
            }


        int maxNum = array[0][0];
        int fila = 0;
        int columna = 0;


        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] > maxNum) {
                    maxNum = array[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }
        System.out.println("El valor máximo es: " + maxNum);
        System.out.println("Está en la posición: [" + fila + "][" + maxColumna + "]");
    }
}
//ejercicio 3.1
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Bienvenido seleccione el numero de filas: ");
        int n = sc.nextInt();
        System.out.println("Bienvenido seleccione el numero de columnas: ");
        int m = sc.nextInt();

        int array[][] = new int[n][m];

        //llenar matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = r.nextInt(100)+1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Ingrese el numero de la fila a intercambiar de (0 a " + (n - 1) + "):");
        int filaUno = sc.nextInt();
        System.out.println("Ingrese el numero de la fila con la cual se va a intercambiar de (0 a " + (n - 1) + "):");
        int filaDos = sc.nextInt();
        
        
        if (filaUno >= 0 && filaUno < n && filaDos >= 0 && filaDos < n) {
            for (int j = 0; j < m; j++) {

                int temp = array[filaUno][j];
                array[filaUno][j] = array[filaDos][j];
                array[filaDos][j] = temp;
            }
            System.out.println("Las filas intercambiadas son " + filaUno + " y " + filaDos + " es:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Tus numeritos no funcionan aqui ponte chido");

        }
    }
}
//ejercicio 4.1
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        //Crear  matriz nxn
        System.out.println("Seleccione un numero para el tamaño de la matriz cuadrada: ");
        int n = sc.nextInt();

        int array[][] = new int[n][n];

        System.out.println("La matriz es: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = r.nextInt(100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        int dPrincipal = 0;
        int dSecundaria = 0;

        //Diagonal principal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    dPrincipal += array[i][j];
                }
            }
        }
        System.out.println("la suma de la diagonal principal es: " + dPrincipal);

        //diagonal secundaria
        for (int i = 0; i < n; i++) {
                    dSecundaria += array[i][n-1-i];
            }
        System.out.println("la suma de la diagonal es: " + dSecundaria);

    }
}
//ejercicio 5.1
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Escoje la cantidad de filas: ");
        int filas = sc.nextInt();
        System.out.println("Escoje la cantidad de columnas: ");
        int columnas = sc.nextInt();

        int arr[][]= new int[filas][columnas];
        int transpuesta[][] = new int[columnas][filas];

        //llenar con randoms
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                arr[i][j]=r.nextInt(100)+1;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //Transponer la matriz
        System.out.println("La matriz transpuesta es: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i]=arr[j][i];
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}