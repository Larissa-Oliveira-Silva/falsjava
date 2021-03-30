/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor2;

import java.util.Scanner;

/**
 *
 * @author Lara
 */
public class Vetor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vetor = new int [5];
 Scanner a = new Scanner(System.in);
 
 for (int i =0; i < 5;i++)
 {
 System.out.println("Digite um numero");
  vetor[i]= a.nextInt();
   
 
 }
 
  for (int j =0; j < 5;j++)
 {
 System.out.println(vetor[j]);
  
 
   
 
 }
    }
}