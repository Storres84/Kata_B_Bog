package Retos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Reto_3 {
     
    
    
    public static int puzzleOfChange(ArrayList arr) {
        
        System.out.println("-------- Solucion Reto 3 -----------\n");
        
        int [] Coins = new int [arr.size()];
        for (int i =0; i<Coins.length; i++){
            Coins[i] = (int) arr.get(i);
        }
        ordenamientoBurbuja(Coins);
         // `n` almacena el número total de subconjuntos
        int n = (int) Math.pow(2, Coins.length);
        List<Integer> pwCoin = new ArrayList<>();

        // generar cada subconjunto uno por uno
        for (int i = 0; i < n; i++)
        {
            List<Integer> pwSet = new ArrayList<>();
            // revisa cada bit de `i`
            for (int j = 0; j < Coins.length; j++)
            {
                // si se establece el j-ésimo bit de `i`, imprime `Coins[j]`
                if ((i & (1 << j)) != 0) {
                    pwSet.add(Coins[j]);
                }
            }
            int sum = pwSet.stream().mapToInt(k -> k).sum();
            //System.out.println(pwSet);
            if (sum > 0){
            pwCoin.add(sum);
            }
        }
        //System.out.println("Valores posibles de cambio " + pwCoin );
        Set<Integer> hashSet = new HashSet<Integer>(pwCoin);
        pwCoin.clear();
        pwCoin.addAll(hashSet);
        //System.out.println("Array sin repetidos" + pwCoin);
        int salida=0;

        if(pwCoin.get(0)!=1){
            salida = pwCoin.get(0)-1; 
        }else{
            for (int i = 1; i < pwCoin.size(); i++) {
             if (pwCoin.get(i-1) + 1 != pwCoin.get(i)) {
                 salida += (pwCoin.get(i-1) + 1);
                 break;
                }
            }  
             if(salida==0){
                 salida = (pwCoin.get(pwCoin.size()-1))+1;
             }
        }
        System.out.println("Lista de monedas: " + arr);
        System.out.println("El minimo valor de cambio que no se puede dar sería : " + salida);
        return salida;
    }
    public static void ordenamientoBurbuja(int[] Coins) {
        for (int i = Coins.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (j + 1 <= i && Coins[j] > Coins[j + 1]) {
                    int aux = Coins[j];
                    Coins[j] = Coins[j + 1];
                    Coins[j + 1] = aux;
                }
            }
        }
    }    
}