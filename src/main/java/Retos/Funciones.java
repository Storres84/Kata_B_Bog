/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Retos;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Steven Torres
 */
public class Funciones {
    
    public static int valor (String hashCode){
            // Convertir en array
            char [] arrHash = hashCode.toCharArray();
            // Variable para almacenar el digito
            int S=0;
            // Iterar el string
            for(int i=0; i<arrHash.length; i++){
                //Verificar si es un digito
                if(Character.isDigit(arrHash[i])){
                    // Convertir a valor numerico para compararlo
                    int num = Character.getNumericValue(arrHash[i]);
                    // Verificar el rango indicado
                    if(num>0 && num<=9){
                        //Asignar el valor
                        S=num;
                        // Terminar el bucle
                        break;
                    }
                }    
            }
        return S;     
    }
    public static ArrayList getArr(int S){
        ArrayList<Integer> arr = new ArrayList<>();
            while (S>arr.size()){
               arr.add((int)(Math.random()*100));
            }
        Collections.sort(arr);
        return arr;    
    }

}
