public class Main {
    public static void main(String[] args) {
        String nombre = "Carlos";
        String apellido = "Martinez";
        String direccionIp ="192.168.0.1";
        int numeroDeCliente = 12345;

        char primerLetra = nombre.charAt(0);
        char ultimaletra = apellido.charAt(nombre.length()+1);

        String nombreInvertido = nombre.replace('a','1')
                .replace('e','2')
                .replace('i','3')
                .replace('o','4')
                .replace('u','5')
                .replace(primerLetra,ultimaletra);

        String apellidoInvertido = apellido.replace('a','1')
                .replace('e','2')
                .replace('i','3')
                .replace('o','4')
                .replace('u','5')
                .replace(ultimaletra,primerLetra);

        String primerConjunto = direccionIp.substring(0,3);
        String segundoConjunto = direccionIp.substring(4,7);
        String tercerConjunto = direccionIp.substring(8,9);
        String cuartoConjunto = direccionIp.substring(10,11);

        String conjuntoUnoHex = Integer.toHexString(Integer.valueOf(primerConjunto));
        String conjuntoDosHex = Integer.toHexString(Integer.valueOf(segundoConjunto));
        String conjuntoTresHex = Integer.toHexString(Integer.valueOf(tercerConjunto));
        String conjuntoCuatroHex = Integer.toHexString(Integer.valueOf(cuartoConjunto));

        String ipHexadecimal = conjuntoUnoHex + "." + conjuntoDosHex + "." + conjuntoTresHex + "." + conjuntoCuatroHex;

        //suma de numero de cliente
        double formulaNum = ((numeroDeCliente * 3) + 15) / 2;

        System.out.println("Datos cifrados: "  + nombreInvertido + " " + apellidoInvertido + "|" + ipHexadecimal + "|" + formulaNum);
    }
}