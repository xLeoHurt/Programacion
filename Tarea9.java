import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //coordenadas
        System.out.println("Ingrese X 1: ");
        double xUno = sc.nextDouble();
        System.out.println("Ingrese Y 1: ");
        double yUno = sc.nextDouble();
        System.out.println("Ingrese X 2: ");
        double xDos = sc.nextDouble();
        System.out.println("Ingrese Y 2: ");
        double yDos = sc.nextDouble();
        System.out.println("Ingrese X 3: ");
        double xTres = sc.nextDouble();
        System.out.println("Ingrese Y 3: ");
        double yTres = sc.nextDouble();
        System.out.println("\n");

        //Distancia entre puntos
        double ladoA = Math.sqrt(Math.pow(xDos - xUno, 2)+Math.pow(yDos - yUno,2));
        System.out.println("Lado A: " + ladoA);
        double ladoB = Math.sqrt(Math.pow(xTres - xDos, 2)+Math.pow(yTres - yDos, 2));
        System.out.println("Lado B: " + ladoB);
        double ladoC = Math.sqrt(Math.pow(xTres - xUno, 2)+Math.pow(yTres - yUno, 2));
        System.out.println("Lado C: " + ladoC);
        System.out.println("\n");

        //perimetro

        //Area del triangulo
        double s = (ladoA + ladoB + ladoC)/2;
        double area = Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC));
        System.out.println("Area: " + area);
        System.out.println("\n");

        //Altura del triangulo desde uno de los vertices
        double altura = (2*area)/ladoA;
        System.out.println("Altura: " + altura);
        System.out.println("\n");

        //Angulos internos
        double anguloA = Math.toDegrees(Math.acos((Math.pow(ladoB,2)+Math.pow(ladoC,2)-Math.pow(ladoA,2))/(2*ladoB*ladoC)));
        System.out.println("Angulo A: " + anguloA);
        double anguloB = Math.toDegrees(Math.acos((Math.pow(ladoA,2)+Math.pow(ladoC,2)-Math.pow(ladoB,2))/(2*ladoA*ladoC)));
        System.out.println("Angulo B: " + anguloB);
        double  anguloC = Math.toDegrees(Math.acos((Math.pow(ladoA,2)+Math.pow(ladoB,2)-Math.pow(ladoC,2))/(2*ladoA*ladoB)));
        System.out.println("Angulo C: " + anguloC);
        System.out.println("\n");

        // Si el triango es equilatero
        double d = Math.abs(ladoA-ladoB)+Math.abs(ladoB-ladoC)+Math.abs(ladoC-ladoA);
        System.out.println("Diferencia entre lados: " + d);
        System.out.println("\n");

        //Puntos medios
        double puntoMedUno = (xUno+xDos)/2;
        double puntoMedDos = (yUno+yDos)/2;
        System.out.println("Punto medio AB: " + "(" + puntoMedUno + "," + puntoMedDos + ")");
        double puntoMedTres = (xDos+xTres)/2;
        double puntoMedCuatro = (yDos+yTres)/2;
        System.out.println("Punto medio BC: " + "(" + puntoMedTres + "," + puntoMedCuatro + ")");
        double puntoMedCinco = (xTres+xUno)/2;
        double puntoMedSeis = (yTres+yUno)/2;
        System.out.println("Punto Medio CA: " + "(" + puntoMedCinco + "," + puntoMedSeis + ")");
    }
}