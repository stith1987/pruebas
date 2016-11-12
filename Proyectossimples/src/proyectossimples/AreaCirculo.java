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
public class AreaCirculo {
    
    public static void main(String[] args) {
        int area=0, radio =0;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite el radio del circulo");
        radio = teclado.nextInt();
        area=(int) (Math.PI*(radio*radio));
        System.out.println("El area del circulo es:  "+ area);
        
        
    }
    
}
