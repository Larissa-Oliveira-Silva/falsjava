/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lara
 */
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner ler = new Scanner(System.in);
        
      int prod;
        int soma = 0;
        int cont=0;
        int resposta =0;
          
         try{
             
              do{
        
               cont++;
         prod = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do produto"));
         soma+=prod;
         
         resposta = JOptionPane.showConfirmDialog(null, "Deseja incluir mais um produto?", "Confirmação",JOptionPane.YES_NO_OPTION);
         } 
         while(resposta!=1);              
      
        }catch(Exception e)
        {
        
    JOptionPane.showMessageDialog(null, "ERRO");
       
        } finally
        {
             JOptionPane.showMessageDialog(null, "Valor total: "+soma);
         JOptionPane.showMessageDialog(null, "Obrigada por utilizar nosso sistema"); 
        
            
        }
    }
}


    

