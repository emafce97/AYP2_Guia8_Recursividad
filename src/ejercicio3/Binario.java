package ejercicio3;

public class Binario {

    public static int contarUnos(int num){
        if(num == 1){
            return 1;
        }
        int suma = 0;
        if(num % 2 == 1){
            suma++;
        }
        return suma + contarUnos(num / 2);
    }
}
