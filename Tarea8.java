import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //coordenadas
        System.out.println("introduce coordenada X1: " );
        double xUno = input.nextDouble();
        System.out.println("introduce coordenada Y1: " );
        double yUno = input.nextDouble();
        System.out.println("introduce coordenada X2: " );
        double xDos = input.nextDouble();
        System.out.println("introduce coordenada Y2: ");
        double yDos = input.nextDouble();
        

        //Distancia entre coordenadas
        double distancia = Math.sqrt(Math.pow(xDos - xUno, 2) + Math.pow(yDos - yUno, 2));
        System.out.println("Distancia entre coordenadas = " + distancia);

        //Angulo en radianes
        double anguloRad = Math.atan2(yDos - yUno, xDos - xUno);
        System.out.println("angulo en radianes = " + anguloRad);

        //Angulo en grados
        double anguloDeg = Math.toDegrees(anguloRad);
        System.out.println("angulo en grados = " + anguloDeg);
    }
}
