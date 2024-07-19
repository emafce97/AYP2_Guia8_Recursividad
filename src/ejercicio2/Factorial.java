package ejercicio2;

public class Factorial {

    public static int getFactorial(int num){
        if(num == 1){
            return 1;
        }
        return num * getFactorial(num - 1);
    }
}
