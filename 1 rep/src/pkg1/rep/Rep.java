/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.rep;

/**
 *
 * @author Lara
 */

import java.util.Scanner;
public class Rep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner a = new Scanner(System.in);
       // int num = 5;
        System.out.println("Digite um numero: ");
       int num = a.nextInt();
        
       System.out.println("Tabuada");
        for(int i = 1; i <= 10; i++)
        {
            int res = num*i;
             System.out.println(i +"*"+num+"= " +res);
        }
           
            
    }
    
}
