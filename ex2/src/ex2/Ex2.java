/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author Lara
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int divisao = 0;
         int n1;
         int n2;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o dividendo: ");
         n1 = ler.nextInt();
         
         System.out.println("Digite o divisor: ");
         n2 = ler.nextInt();
        try{
         divisao = n1/n2;
      System.out.println("Resultado: "+divisao);
        }catch(ArithmeticException e)
        {
        System.out.println("Não se divide por zero");
        }
        
        //System.out.println("Resultado: "+divisao);
    }
    
}
