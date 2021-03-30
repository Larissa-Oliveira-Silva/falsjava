/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor5;

import java.util.Scanner;

/**
 *
 * @author Lara
 */
public class Vetor5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
 Scanner a = new Scanner(System.in);
 float soma =0;
 float media =0;
 int n;
 System.out.println("Digite a quantidade de notas");
 n = a.nextInt();
 float[] vetor = new float [n];

 for (int i =0; i < vetor.length;i++)
 {
 System.out.println("Digite a nota");
  vetor[i]= a.nextInt();
   soma += vetor[i];
 
 }
 

 

 // System.out.println("Resultado:"+soma);
 
  System.out.println("Notas:");
 for (float j: vetor)
{
   System.out.println(j);
           }
 
 media= soma/n;
 System.out.println("Media: "+media);
 
         
    }
    
}
