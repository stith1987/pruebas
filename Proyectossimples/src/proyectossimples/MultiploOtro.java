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
public class MultiploOtro {
    
    public static void main(String[] args) {
        float num1=0,num2=0,resultado=0;
         Scanner teclado = new Scanner (System.in);
         
         System.out.println("Digite el primero numero");
         num1=teclado.nextFloat();
         System.out.println("Digite el segundo numero");
         num2=teclado.nextFloat();
         
         resultado= num1%num2;
         
         if (resultado == 0){
             System.out.println("Son multiplos");
             
         }
         else  {
             
             System.out.println("No son multiplos");
         }
    }
    
    
}
