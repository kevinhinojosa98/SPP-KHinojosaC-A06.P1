/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Kevin Gerardo Hinojosa Castellanos    A01411383  IMT
package spp.khinojosac.a06.p1;
import java.util.Scanner;
/**
 *
 * @author kevinhinojosa
 */
public class SPPKHinojosaCA06P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // TODO code application logic here
       
        int num, mult=1;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Introduce un número entero entre 0 y 10");
        num = teclado.nextInt();
        
        if (num>0 && num<=10){
        for (int i=1; i<=num ; i++){
            
             mult = mult * i;
        }
        
        System.out.println("Su factorial es " +mult);
        }else System.out.println("El número no esta en el rango");
    }  
}
    
