package ejercicio9;

public class SumadorElementos {

    public static int sumar(int[] nums, int n){
        if(n <= 0){
            return 0;
        }
        return nums[n - 1] + sumar(nums, n - 1);
    }
}
