/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz3;

/**
 *
 * @author Lara
 */
public class Matriz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double somatoria [] [] = new double [10][10];
          for (int i =0; i < somatoria.length;i++)
        {
        for (int j =0; j < somatoria.length;j++)
                {
                   // int n = (i + j);
                somatoria[i][j] = i + j;
                        
    }
        }
           for (int k =0; k < 10;k++)
        {
        for (int l =0; l < 10;l++)
                {
                System.out.println(somatoria[k][l]);
                        
    }}
    }
    
}
