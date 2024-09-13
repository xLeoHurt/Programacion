public class Main {
    public static void main(String[] args) {
        // primer operacion
        double primerOperacion = ((12+8)*(5-3))-(6/2);
        double segundaoperacion =(3*4)+(8/2);
        System.out.println(primerOperacion/segundaoperacion);

        //Problema #2
        double segundaOperacion = (((9*5)-(15+3)+(8*2)-(12/4))*(7+2)-(6*3)/2) / (2+(3*2)/(4-2))+5*((8/4)+1)-(6/(2+1));
        double operacion3 = segundaOperacion/(((4+2)*(7-1))/(3+1)+((3*2)-(5+1))*(8/2))/(3+(6/2)+(7/2))+2*(3+(8/4));
        System.out.println(segundaOperacion/operacion3);

        //Problema#3
        double divisor = ((6+4)*3)-(18/2);
        double dividendo = (8-5)+(3*2);
        double resultado = divisor/dividendo;
        System.out.println(resultado);

    }
}