
package Retos;

import java.util.ArrayList;


public class Index {

    public static void main(String[] args) {
        
        String hashCode = "c8db07cf39a3f81ae44cb509840585f5";  
        int S = Funciones.valor(hashCode);
        System.out.println("Para la solucion de la kata se generaró el hash code: '" + hashCode + "'\n");
        System.out.println("De el cual su primer valor numerico entre 1 y 9 que se obtuvo es: " + S + "\n");
        
        ArrayList arr = Funciones.getArr(S);
        
        System.out.println("Array generado de manera aleatoria para los tres ejercicios: " + arr);
        
        Reto_1.solucion(arr, S);
       
        Reto_2.solucion(arr, S);
       
        Reto_3.puzzleOfChange(arr);
        
    }
}