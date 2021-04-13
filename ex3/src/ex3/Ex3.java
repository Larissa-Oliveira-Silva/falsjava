/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.util.Scanner;

/**
 *
 * @author Lara
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
       
//        int[] vetor = {1,2,3};
//         vetor[0]=1;
//          vetor[1]=2;
//           vetor[2]=3;
//           
//           int num = 0;
//         
//         try{
//         //divisao = n1/n2;
//             System.err.println("Digite um numero");
//              num = ler.nextInt();
//              System.out.println("Conteudo do vetor: "+vetor[num-1]);
//             
//        }catch(ArrayIndexOutOfBoundsException e)
//        {
//        System.out.println("O numero maximo é 3");
//        }

int[] vetor = {1,2,3};
         vetor[0]=1;
          vetor[1]=2;
           vetor[2]=3;
           
           int num = 0;
         
         try{
         
             System.out.println("Digite a quantidade de valores");
              int qtd = ler.nextInt();
              System.out.println("***********************");
              
              for(int i =0; i<qtd;i++)
              {
                  System.out.println(vetor[i]);
              }
             
        }catch(ArrayIndexOutOfBoundsException e)
        {
        System.out.println("ERRO. O numero maximo é 3");
        }



    }
    
}
