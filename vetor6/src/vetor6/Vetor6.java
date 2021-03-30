/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor6;

import java.util.Scanner;

/**
 *
 * @author Lara
 */
public class Vetor6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner a = new Scanner(System.in);
         
          int n;
 System.out.println("Digite a quantidade de alunos");
 n = a.nextInt();
 float[] vetor = new float [n];
 float soma =0;
 float media =0;
 String [] vetor2 = new String [n];
 
 for (int i =0; i < vetor.length;i++)
 { 
     System.out.println("Digite o nome do aluno: ");
  vetor2[i]= a.next();   
 System.out.println("Digite a nota: ");
  vetor[i]= a.nextInt();
  soma += vetor[i];
   
 
 }
 
 media= soma/n;
 System.out.println("Media: "+media);
  System.out.println("Alunos:");
 for (String j: vetor2)
{
   System.out.println(j);
           }
 
    
    }}
