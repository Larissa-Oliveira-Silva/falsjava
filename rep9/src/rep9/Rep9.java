/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rep9;

import java.util.Scanner;

/**
 *
 * @author Lara
 */
public class Rep9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner a = new Scanner(System.in);
         int num;
         int soma=0;
         
         
         do{
         System.out.println("Digite um numero: ");
         num = a.nextInt();
         soma = soma+num;
         
         } 
         while(num!=0);
         
         System.out.println("Resultado: "+soma);
         
         
    }
    
}
