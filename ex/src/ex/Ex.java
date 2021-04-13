/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

import java.util.Scanner;

/**
 *
 * @author Lara
 */
public class Ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int divisao = 0;
//        try{
//         divisao = 10/0;
//        System.out.println(divisao);
//        }catch(ArithmeticException e)
//        {
//        System.out.println("Não se divide por zero");
//        }
//        
//        System.out.println("Resultado "+divisao);
        
        
//        
//        int[] vetor = {1,2,3,4};
//        vetor[4] = 5;
////        
//        String nome = null;
//        System.out.println(nome.toLowerCase());
        
//        int number;
//         Scanner ler = new Scanner(System.in);
//         System.out.println("Digite um numero inteiro: ");
//         number = ler.nextInt();
//         System.out.println(number);

int divisao = 0;
        try{
         divisao = 10/5;
        System.out.println(divisao);
        }catch(Exception e)
        {
        System.out.println("ERRO");
        } finally
        {
            System.out.println("Sempre passa por aqui");
        }
        
       


                 
                
    }
    
}
