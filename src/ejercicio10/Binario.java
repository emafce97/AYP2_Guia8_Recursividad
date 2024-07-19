package ejercicio10;

public class Binario {

    public static String getBinario(int num){
        if(num == 0){
            return "0";
        }else if( num == 1){
            return "1";
        }else if(num == 3){
            return "10";
        }else{
            String binario = String.valueOf(num % 2);
            return binario + getBinario(num/2);
        }
    }

}
