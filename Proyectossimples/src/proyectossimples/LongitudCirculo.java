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
public class LongitudCirculo {
    public static void main(String[] args) {
        int longitud=0, radio=0;
         Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite el radio de la circuferencia: ");
        radio = teclado.nextInt();
        
        longitud = (int) (2*Math.PI*radio);
        
        System.out.println("La longitud de circuferencia de radio es: "+radio+" es "+ longitud);
    }
}
