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
public class MayorIguales {
    public static void main(String[] args) {
        int num1=0,num2=0;
         Scanner teclado = new Scanner (System.in);
         System.out.println("Ingrese el primer numero");
         num1 = teclado.nextInt();
         System.out.println("Ingrese el segundo numero");
         num2 = teclado.nextInt();
         
         if (num1==num2) {
            System.out.println("Los numeros son iguales");
         }
             else {
                     if (num1>num2) {
                     System.out.println("numero uno es mayor que numero 2");
   
}
                     else {
                         System.out.println("numero dos es mayor que numero uno");
                     }
         }
    }
}

    
    

