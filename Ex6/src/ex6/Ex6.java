/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

import java.util.Scanner;

/**
 *
 * @author Lara
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int soma =0;
        int[] vetor = new int [8];
        
        Scanner ler = new Scanner(System.in);
        
      
          
         try{
         for(int i =0; i<8;i++)
              {
                  System.out.println("Digite o valor" );
                  vetor[i]= ler.nextInt();
                  soma+=vetor[i];
              }
      
        }catch(Exception e)
        {
        System.out.println("ERRO");
        soma = 0;
       
        } finally
        {
            System.out.println("Soma: "+soma);
        }
    }
    
}
