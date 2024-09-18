import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Numeros aleatorios
        double numeroAleatorioUno = (Math.random()*99)+1;
        System.out.println("Numero Aleatorio Uno: " + numeroAleatorioUno);
        double numeroAleatorioDos = (Math.random()*99)+1;
        System.out.println("Numero Aleatorio Dos: " + numeroAleatorioDos);
        double numeroAleatorioTres = (Math.random()*99)+1;
        System.out.println("Numero Aleatorio Tres: " + numeroAleatorioTres);
        double numeroAleatorioCuatro = (Math.random()*99)+1;
        System.out.println("Numero Aleatorio Cuatro: "+ numeroAleatorioCuatro);
        double numeroAleatorioCinco = (Math.random()*99)+1;
        System.out.println("Numero Aleatorio Cinco: "+ numeroAleatorioCinco);
        double numeroAleatorioSeis = (Math.random()*99)+1;
        System.out.println("Numero Aleatorio Seis: " + numeroAleatorioSeis);
        double numeroAleatorioSiete = (Math.random()*99)+1;
        System.out.println("Numero Aleatorio Siete: " + numeroAleatorioSiete);
        double numeroAleatorioOcho = (Math.random()*99)+1;
        System.out.println("Numero Aleatorio Ocho: " + numeroAleatorioOcho);
        double numeroAleatorioNueve = (Math.random()*99)+1;
        System.out.println("Numero Aleatorio Nueve: " + numeroAleatorioNueve);
        double numeroAleatorioDiez = (Math.random()*99)+1;
        System.out.println("Numero Aleatorio Diez: "+ numeroAleatorioDiez);

        //Raiz cuadrada de cada numero
        double raizNumeroUno = Math.sqrt(numeroAleatorioUno);
        System.out.println("numero aleatorio uno: " + raizNumeroUno);
        double raizNumeroDos = Math.sqrt(numeroAleatorioDos);
        System.out.println("numero aleatorio dos: " + raizNumeroDos);
        double raizNumeroTres = Math.sqrt(numeroAleatorioTres);
        System.out.println("numero aleatorio tres: " + raizNumeroTres);
        double raizNumeroCuatro = Math.sqrt(numeroAleatorioCuatro);
        System.out.println("numero aleatorio cuatro: " + raizNumeroCuatro);
        double raizNumeroCinco = Math.sqrt(numeroAleatorioCinco);
        System.out.println("numero aleatorio cinco: " + raizNumeroCinco);
        double raizNumeroSeis = Math.sqrt(numeroAleatorioSeis);
        System.out.println("numero aleatorio seis: " + raizNumeroSeis);
        double raizNumeroSiete = Math.sqrt(numeroAleatorioSiete);
        System.out.println("numero aleatorio siete: " + raizNumeroSiete);
        double raizNumeroNueve = Math.sqrt(numeroAleatorioNueve);
        System.out.println("numero aleatorio nueve: " + raizNumeroNueve);
        double raizNumeroDiez = Math.sqrt(numeroAleatorioDiez);
        System.out.println("numero aleatorio diez: " + raizNumeroDiez);

        //Cuadrado de cada numero
        double cuadradoNumeroUno = Math.pow(numeroAleatorioUno, 2);
        System.out.println("Cuadrado Numero Uno: " + cuadradoNumeroUno);
        double cuadradoNumeroDos = Math.pow(numeroAleatorioDos, 2);
        System.out.println("Cuadrado Numero Dos: " + cuadradoNumeroDos);
        double cuadradoNumeroTres = Math.pow(numeroAleatorioTres, 2);
        System.out.println("Cuadrado Numero Tres: " + cuadradoNumeroTres);
        double cuadradoNumeroCuatro = Math.pow(numeroAleatorioCuatro, 2);
        System.out.println("Cuadrado Numero Cuatro: " + cuadradoNumeroCuatro);
        double cuadradoNumeroCinco = Math.pow(numeroAleatorioCinco, 2);
        System.out.println("Cuadrado numero Cinco: " + cuadradoNumeroCinco);
        double cuadradoNumeroSeis = Math.pow(numeroAleatorioSeis, 2);
        System.out.println("Cuadrado numero Seis: " + cuadradoNumeroSeis);
        double cuadradoNumeroSiete = Math.pow(numeroAleatorioSiete, 2);
        System.out.println("Cuadrado numero siete: " + cuadradoNumeroSiete);
        double  cuadradoNumeroOcho = Math.pow(numeroAleatorioOcho, 2);
        System.out.println("Cuadrado numero Ocho: " + cuadradoNumeroOcho);
        double cuadradoNumeroNueve = Math.pow(numeroAleatorioNueve, 2);
        System.out.println("Cuadrado numero nueve: " + cuadradoNumeroNueve);
        double cuadradoNumeroDiez = Math.pow(numeroAleatorioDiez, 2);
        System.out.println("Cuadrado numero diez: " + cuadradoNumeroDiez + "\n");

        //Media de todos los numeros
        double mediaTotal = (numeroAleatorioUno + numeroAleatorioDos + numeroAleatorioTres + numeroAleatorioCuatro + numeroAleatorioCinco + numeroAleatorioSeis + numeroAleatorioSiete + numeroAleatorioOcho + cuadradoNumeroNueve + numeroAleatorioDiez)/10;
        System.out.println("Media Total: " + mediaTotal + "\n");

        //Desviacion estandar
        double valorParaLaRaiz = (mediaTotal*2)/(10-1);
        double desviacionEstandar = Math.sqrt(valorParaLaRaiz);
        System.out.println("Desviacion estandar: " + desviacionEstandar);
    }
}