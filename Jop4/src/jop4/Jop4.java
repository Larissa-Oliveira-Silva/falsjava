/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jop4;

import javax.swing.JOptionPane;

/**
 *
 * @author Lara
 */
public class Jop4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
         int resposta =0;
         //JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação",JOptionPane.YES_NO_OPTION);
         int soma = 0;
         
         while(resposta== JOptionPane.YES_OPTION)
         {
             resposta =0;
             int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
             resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação",JOptionPane.YES_NO_OPTION);
          
          soma +=num2;     
          
         }
         
         System.out.println("Resultado: "+soma);
         JOptionPane.showMessageDialog(null, soma);
    }
    
}
