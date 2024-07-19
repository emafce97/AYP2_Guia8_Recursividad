package ejercicio5;

import java.util.Stack;

public class Pila {

    public static int contarElementos(Stack<Integer> pila){
        if(pila.isEmpty()){
            return 0;
        }
        int ultimoElemento = pila.pop();
        int elementosRestantes = contarElementos(pila);
        pila.push(ultimoElemento);
        return 1 + elementosRestantes;
    }

}
