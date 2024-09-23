public class Main {
    public static void main(String[] args) {

        String palabra = "supercalifragilisticoespiralidoso";
        int longitud = palabra.length();
        System.out.println("Longitud de la palabra: " + longitud + "\n");

        char posDiez = palabra.charAt(10);
        System.out.println("Posicion de la palabra: " + posDiez + "\n");

        String mayus = palabra.toUpperCase();
        System.out.println("Mayus de la palabra: " + mayus + "\n");

        String posCincoToQuince = palabra.substring(5,15);
        System.out.println("palabra cortada: " + posCincoToQuince + "\n");

        int primerOcurrencia = palabra.indexOf('i');
        System.out.println("Primer ocurrencia: " + primerOcurrencia + "\n");

        int ultimaOcurrencia = palabra.lastIndexOf('o');
        System.out.println("ultima ocurrencia: " + ultimaOcurrencia + "\n");

        String palabraEnMinusculas = palabra.toLowerCase();
        System.out.println("Palabra en minusculas: " + palabraEnMinusculas + "\n");

        String subCadena = palabra.substring(0,33);
        System.out.println("Sub cadena: " + subCadena + "\n");

        int ultimaOcurrenciados = palabra.lastIndexOf("li");
        System.out.println("ultima ocurrencia: " + ultimaOcurrenciados + "\n");

    }
}