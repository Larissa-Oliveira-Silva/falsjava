/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rep7;

import java.util.Scanner;

/**
 *
 * @author Lara
 */
public class Rep7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner a = new Scanner(System.in);
         int i =1;
         double num;
         double maior ;
                 System.out.println("Digite o "+i+"º numero: ");
           num = a.nextDouble();
           maior = num;
           i++;
           
         while(i<=5)
         {
           System.out.println("Digite o "+i+"º numero: ");
           num = a.nextDouble();
           
           if(num>maior)
           {
           maior=num;
           }
        i++;
         
         }
         
         System.out.println("Maior numero: "+maior);
    }
    
}
