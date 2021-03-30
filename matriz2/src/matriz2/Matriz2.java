/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz2;

import java.util.Scanner;

/**
 *
 * @author Lara
 */
public class Matriz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
         
        double matriz [] [] = new double [2][5];
          for (int i =0; i < 2;i++)
        {
        for (int j =0; j < 5;j++)
                {
                System.out.println("Digite um valor");
                    matriz[i][j] = a.nextDouble();
                        {
    }}
        }
           System.out.println("Valores: ");
            for (int k =0; k < 2;k++)
        {
        for (int l =0; l < 5;l++)
                {
                System.out.println(matriz[k][l]);
                        
    }}
        
          
         // vetor[i]= a.nextInt();
         
// System.out.println("Digite um valor");
 //n = a.nextDouble();
    }
    
}
