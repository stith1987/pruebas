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
public class Tresnumeros {
    
    public static void main(String[] args) {
        int num1=0, num2=0,num3=0;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingrese los numeros:");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();
        
        if (num1>num2 & num2<num3 ) {
            System.out.println("El orden es;" +num1+" y "+num2+" y "+num3 );
            
        }
        else{
            if (num2>num3 & num3>num1) {
                System.out.println("El orden es;" +num2+" y "+num3+" y "+num1);
                
            }
            
            else{
                if (num3>num1 & num1>num2) {
                    
                    System.out.println("El orden es;" +num3+" y "+num2+" y "+num1);
                }
                
                else{
                    if () {
                        
                    }
                }
            }
        }
        
    }
    
}
