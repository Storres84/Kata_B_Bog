/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Retos;

import java.util.ArrayList;

/**
 *
 * @author Steven Torres
 */
public class Reto_2 {

    public static void solucion(ArrayList arr, int S){
    
        String conc = String.valueOf(S);
        int SS = Integer.parseInt(conc + conc);
        double exponente = 2;
        ArrayList<Integer> arrPow = new ArrayList<>();
        ArrayList<Integer> arrOut = new ArrayList<>();
        System.out.println("-------- Solucion Reto 2 -----------\n");
        System.out.println("Valor de SS: " + SS);
        for(int i = 0; i<arr.size(); i++){
            
            int temp = Integer.parseInt(arr.get(i).toString());
            double base = temp;
            int numPow = (int)Math.pow(base, exponente);
            arrPow.add(numPow);
        }
        System.out.println("Array de cuadrados " + arrPow);
        
        for (int i = 0; i<arrPow.size(); i ++){
            int temp = Integer.parseInt(arrPow.get(i).toString());
            if (temp<SS){
                arrOut.add(temp);
            }
        }
        System.out.println("Array de cuadrados filtrado por menor a SS " + arrOut);
    }   
}
