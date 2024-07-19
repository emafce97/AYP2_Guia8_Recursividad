package ejercicio4;

public class PalabraInversa {

    public static String getInverso(String palabra){
        if(palabra.length() == 1){
            return palabra;
        }
        String inversa = "";
        char ultimaLetra = palabra.charAt(palabra.length()-1);
        inversa += ultimaLetra;
        String nuevaPalabra = palabra.substring(0, palabra.length() - 1);
        return inversa + getInverso(nuevaPalabra);
    }
}
