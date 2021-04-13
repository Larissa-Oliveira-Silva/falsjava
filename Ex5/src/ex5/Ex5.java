/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Lara
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner(System.in);
        
        int n;
        System.out.println("Digite o tamanho do vetor");
        n = ler.nextInt();
        int[] vetor = new int [n];
        
        try{
          for(int i =0; i<n;i++)
              {
                  System.out.println("Digite o valor");
                  vetor[i]= ler.nextInt();
              }
         
        }catch(InputMismatchException e)
        {
          System.out.println("Somente valores inteiros");
            
        
        }
        
//         for(int j =0; j<n;j++)
//              {
//                  System.out.println(vetor[j]);
//                  
//              }
    }
    
}
