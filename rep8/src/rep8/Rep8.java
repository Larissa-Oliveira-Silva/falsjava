/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rep8;

import java.util.Scanner;

/**
 *
 * @author Lara
 */
public class Rep8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner a = new Scanner(System.in);
         int num;
         
         
         do{
         System.out.println("Digite um numero: ");
         num = a.nextInt();
         
         } 
         while(num!=1);
    }
    
}
