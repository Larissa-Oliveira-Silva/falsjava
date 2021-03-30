/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor3;

import java.util.Scanner;

/**
 *
 * @author Lara
 */
public class Vetor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          int[] vetor = new int [10];
 Scanner a = new Scanner(System.in);
 int i;
 for (i =0; i < vetor.length;i++)
 {
 System.out.println("Digite um numero");
  vetor[i]= a.nextInt();
   
 
 }
 
  for (i = 9; i >= 0 ;i--)
 {
System.out.println(vetor[i]);
     
    // System.out.println("a");
     
  
 
   
 
 }}
    
}
