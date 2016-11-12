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
public class MayorMenor {

    public static void main(String[] args) {
        int num1=0,num2=0;
         Scanner teclado = new Scanner (System.in);
         
         System.out.println("Ingrese el numero 1");
         num1 = teclado.nextInt();
         System.out.println("Ingrese el numero 2");
         num2 = teclado.nextInt();
         
         if (num1>num2) {
             System.out.println("El numero 1 es mayor que el numero 2");
            
        }
         
         else {
             System.out.println("El numero 2 es mayor que el numero 1");
         }
    }
}
