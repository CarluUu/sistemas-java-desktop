/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacaoobjeto;

/**
 *
 * @author carlos.muller
 */
public class Calculadora {
    
    public int soma(int a, int b) {
        return a + b;
        
    }
    
     public int soma(int a, int b, int c) {
        int resultado = this.soma(a,c) + c;
         return resultado;      
     }
     
     
      public float soma(float a, float b) {
        return a + b;
       
    }

       public long soma(int[]numeros){
        long resultado = 0;
        for (int i = 0; i < numeros.length; i++){
            resultado += numeros[i];
        }
        return resultado;
    }

    
}
