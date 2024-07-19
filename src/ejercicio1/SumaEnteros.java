package ejercicio1;

public class SumaEnteros {

    public static int sumarEnteros(int num){
        if(num == 1){
            return num;
        }
        return num + sumarEnteros(num - 1);
    }
}
