/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectossimples;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class PositivoNegativo {
    
    public static void main(String[] args) {
        int n1=0,n2=0;
         Scanner teclado = new Scanner (System.in);
         System.out.println("Digite el numero 1:");
         n1 = teclado.nextInt();
         
         
         if (n1<0){
             System.out.println("El numero es negativo");
             
         }
         else{
             System.out.println("El numero es positivo");
         }
         
    }
    
}
