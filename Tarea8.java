import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //coordenadas
        System.out.println("introduce coordenada X1: " );
        double x1 = input.nextDouble();
        System.out.println("introduce coordenada Y1: " );
        double y1 = input.nextDouble();
        System.out.println("introduce coordenada X2: " );
        double x2 = input.nextDouble();
        System.out.println("introduce coordenada Y2: ");
        double y2 = input.nextDouble();
        

        //Distancia entre coordenadas
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distancia entre coordenadas = " + distancia);

        //Angulo en radianes
        double anguloRad = Math.atan2(y2 - y1, x2 - x1);
        System.out.println("angulo en radianes = " + anguloRad);

        //Angulo en grados
        double anguloDeg = Math.toDegrees(anguloRad);
        System.out.println("angulo en grados = " + anguloDeg);
    }
}