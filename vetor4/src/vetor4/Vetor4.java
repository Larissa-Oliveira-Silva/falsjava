/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor4;

import java.util.Scanner;

/**
 *
 * @author Lara
 */
public class Vetor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int[] vetor = new int [5];
 Scanner a = new Scanner(System.in);
 int soma =0;
 for (int i =0; i < 5;i++)
 {
 System.out.println("Digite um numero");
  vetor[i]= a.nextInt();
   soma += vetor[i];
 
 }
 

 

  System.out.println("Resultado:"+soma);
 
   
 
 
    }
    
}
