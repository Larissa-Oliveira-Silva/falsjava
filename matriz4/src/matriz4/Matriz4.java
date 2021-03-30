/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz4;

import java.util.Scanner;

/**
 *
 * @author Lara
 */
public class Matriz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner a = new Scanner(System.in);
        int l =0;
        int c =0;
        int soma = 0;
        System.out.println("Digite a quantidade de linhas");
        l = a.nextInt();
        System.out.println("Digite a quantidade de colunas");
         c = a.nextInt();           
        double matriz [] [] = new double [l][c];
          for (int i =0; i < l;i++)
        {
        for (int j =0; j < c;j++)
                {
                  // int n = (i + j);
                //somatoria[i][j] = i + j;
                    System.out.println("Digite um numero");
                        matriz[i][j] = a.nextDouble();
                        //soma += vetor[i];
                        soma += matriz[i][j];
    }
        }
          
           System.out.println("Resultado:" +soma);
           System.out.println("Matriz:");
           for (int i =0; i < l;i++)
        {
        for (int j =0; j < c;j++)
                {
                System.out.println("[" + i+ "] " + "[" +j+ "] = "+ matriz[i][j]);
                }
        }
    }
}
