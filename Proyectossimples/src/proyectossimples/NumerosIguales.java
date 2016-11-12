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
public class NumerosIguales {
    
    public static void main(String[] args) {
        int n1=0,n2=0;
         Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce el numero 1");
        n1=teclado.nextInt();
        System.out.println("Introduce el numero 2");
        n2=teclado.nextInt();
         if (n1==n2){
             System.out.println("Los numeros son iguales");
             
         }
         else {
             System.out.println("Los numeros no son iguales");
         }
    }
    
}
