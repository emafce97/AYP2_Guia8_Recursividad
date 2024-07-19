package ejercicio7;

public class Multiplicacion {
    public static int multiplicar(int a, int b){
        if(a == 0 || b == 0){
            return 0;
        }else{
            int suma = a;
            return suma += multiplicar(a, b - 1);
        }
    }
}
