public class Main {
    public static void main(String[] args) {
        //Palabra
        String palabra = "Garcia, Juan Carlos";
        int longitud = palabra.length();
        System.out.println("Longitud de la palabra: " + longitud);
        //apellido
        String apellido = palabra.substring(0,6);
        System.out.println("Apellido: " + apellido);
        //Nombre sin apellido
        String nombre = palabra.substring(8,19);
        System.out.println("Nombre: " + nombre);
        //Mostrar el primer nombre
        String primerNombre = palabra.substring(8,12);
        System.out.println("1er Nombre:"+primerNombre);
        //Apellido en mayusculas
        String appellidoDos = "Garcia";
        String apellidoMayus = appellidoDos.toUpperCase();
        System.out.println("APELLIDO: " + apellidoMayus);
        //Nombre completo a minusculas
        String minusculas = palabra.toLowerCase();
        System.out.println("Nombre en minusculas: " + minusculas);
        //Caracter en la posicion 5 del nombre
        char posCinco = palabra.charAt(5);
        System.out.println("Caracter numero 5: " + posCinco);
        //Primer ocurrencia con 'a'
        int ocurrenciaAnumUno = palabra.indexOf('a');
        System.out.println( "primer ocurrencia con 'a':" + ocurrenciaAnumUno );
        //Ultima ocurrencia con 'a'
        int ourrenciaADos = palabra.lastIndexOf('a');
        System.out.println("Ultima ocurrencia 'a': " + ourrenciaADos);
