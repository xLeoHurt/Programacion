public class Main {
    public static void main(String[] args) {

        String direccion = "Av. Libertador, 1234, Ciudad de México, C.P. 06000";
        System.out.println("Direccion: " + direccion);
        int longitud = direccion.length();
        System.out.println("Longitud de la palabra: " + longitud);
        char primerCaracter = direccion.charAt(0);
        System.out.println("Primer caracter: " + primerCaracter);
        char ultimoCaracter = direccion.charAt(49);
        System.out.println("Ultimo caracter: " + ultimoCaracter);

        //Direccion en mayusculas
        String mayusculas = direccion.toUpperCase();
        System.out.println("Mayusculas: " + mayusculas);
        String minusculas = direccion.toLowerCase();
        System.out.println("Minusculas: " + minusculas);

        //Busqueda de Numeros
        String calle = direccion.substring(0,13);
        System.out.println("Calle: " + calle);
        String numero = direccion.substring(16,20);
        System.out.println("Numero: " + numero);
        String ciudad = direccion.substring(22,38);
        System.out.println("Ciudad: " + ciudad);
        String codigoPostal = direccion.substring(40,50);
        System.out.println("Codigo Postal: " + codigoPostal);

        //Primer aparicion de un numero
        int primerAparicion = direccion.indexOf("1");
        System.out.println("PrimerAparicion: " + primerAparicion);

        //intercambio de caracteres
        String replace = direccion.replace(direccion,"Av Libertador 1234 Ciudad de México CP 06000");
        System.out.println("Direccion corregida: " + replace);

        //Version abreviada
        String direccionCorta = "Libertador, 1234, México, 06000";
        System.out.println("Direccion: " + direccionCorta);


    }
}
