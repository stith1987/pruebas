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
public class Ecuacion {
    
    public static void main(String[] args) {
        double a=0,b=0,c=0; //Coeficientes
        double x1=0,x2=0,d=0; //Determinantes
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Introduzca el coeficiente a:");
        a = teclado.nextDouble();
       
        System.out.println("Introduzca el coeficiene b:");
        b = teclado.nextDouble();
        
        System.out.println("Introduzca el coeficiente c:");
        c = teclado.nextDouble();
        
        //Calculamos el determinante
        
        d = ((b*b)-4*a*c);
        if (d<0) {
            System.out.println("No existen soluciones reales");
            
            //Queda confirmar que no se menor que cero
        }
            else {
                    
                     
            x1=(-b + Math.sqrt(d)+(2*a));
            x1=(-b - Math.sqrt(d)+(2*a));
            System.out.println("Solucion: " +  x1);
            System.out.println("Solucion: " +  x2);
                    }
            
        
  
        
        
    }
    
    
}
