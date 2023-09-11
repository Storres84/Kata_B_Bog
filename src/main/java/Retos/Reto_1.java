package Retos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Reto_1{
    
    
    public static void solucion(ArrayList arr, int S){
        System.out.println("-------- Solucion Reto 1 -----------\n");
        System.out.println("Valor de S: " + S);
        //Variables
        int digito = 0;
        String temp ="";
        
        //Crear un array para guardar los valores filtrados
        ArrayList<Integer> arrFiltered = new ArrayList<>();
        //Recorrer el array
        for(int i =0; i<arr.size(); i++){
            //Convertir el numero a string
            String numero = arr.get(i).toString();
            //Recorrer el string         
            for(int j =0; j<numero.length(); j++){
                //Convertir el caracter a entero para poderlo comparar
                digito = Character.digit(numero.charAt(j),10);
                //Evaluar si es menor
                if (digito < S){
                    //Asignar el caracter a una variable para rearmar el numero
                    temp = temp + numero.charAt(j);
                } 
            }
            //Si se eliminan los dos numeros avanza a la siguiente iteracion
            if(!temp.isEmpty()){
                //Convertir a entero el string que se evaluo
                int numTemp = Integer.parseInt(temp);    
                //Añadir al array
                arrFiltered.add(numTemp);
                //Limpiar la variable para la siguiente iteracion
                temp="";
            }
        }
        // Verificar el array filtrado
        System.out.println("Array filtrado: " + arrFiltered);
        //Objeto comparador para ordenar los numeros
        Comparator<Integer> comparador = Collections.reverseOrder();
        //Ordenar con el comparador
        Collections.sort(arrFiltered, comparador);
        //Verificar el array ordenado
        System.out.println("Array filtrado y ordenado de mayor a menor: " + arrFiltered);
      
    }
}
    
    
    
 
  

