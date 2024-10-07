import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //variables
        String correo = "juan.perez@empresa.com";
        String fechaDeAscenso = "2023-04-15";
        double salario = 50000.75;

        //Modificaciones del correo
        int indiceCorreo = correo.indexOf('@');
        String idCorreo = correo.substring(0, indiceCorreo);
        String despuesDelIndice = correo.substring(indiceCorreo);
        String invertirCorreo = new StringBuilder(idCorreo).reverse().toString();
        String correoCompleto =invertirCorreo + despuesDelIndice;

        //Modificaciones fecha de ascenso
        int primerIndice =  fechaDeAscenso.indexOf('-');
        String primerCifra = fechaDeAscenso.substring(0, primerIndice);
        int segundoIndice =  fechaDeAscenso.lastIndexOf('-');
        String segundaCifra = fechaDeAscenso.substring(primerIndice + 1, segundoIndice);
        String tercerCifra = fechaDeAscenso.substring(segundoIndice +1);
        int sumas = Integer.valueOf(primerCifra) + Integer.valueOf(segundaCifra) + Integer.valueOf(tercerCifra);

        //Modificaciones del salario
        String conversion = String.valueOf(salario);
        int salariioIndice =  conversion.indexOf('.');
        String salarioMod = conversion.substring(0,salariioIndice);
        String salarioModDos = conversion.substring(salariioIndice +1 );
        int convercionMod = Integer.parseInt(salarioMod);
        int convercionModDos = Integer.parseInt(salarioModDos);
        double absSalario = Math.abs(convercionModDos - convercionMod);
        double salarioFinal = absSalario * 2;
        /*System.out.println("El salario es: " + salarioFinal);*/

        System.out.println(correoCompleto + "|" + fechaDeAscenso + "|" + salarioFinal);

    }

}
