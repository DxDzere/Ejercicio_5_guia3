/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5_guia3;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_5_guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numLim, num, sum=0;
        
        System.out.println("Ingrese un tope para la suma");
        numLim = leer.nextInt();
        
        do{
            System.out.println("Igrese un numro para sumar");
            num=leer.nextInt();
            
            sum+=num;
        }while(sum<numLim);
        
        
        System.out.println("La suma supero el maximo");
    }
    
}
