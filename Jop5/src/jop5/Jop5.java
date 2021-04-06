/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jop5;

import javax.swing.JOptionPane;

/**
 *
 * @author Lara
 */
public class Jop5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int prod;
        int soma = 0;
        int cont=0;
        int resposta =0;
        do{
            cont++;
         prod = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do produto"));
         soma+=prod;
         
         resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação",JOptionPane.YES_NO_OPTION);
         } 
         while(resposta!=1);
        
        JOptionPane.showMessageDialog(null, "Valor total: "+soma);
        JOptionPane.showMessageDialog(null, "Quantidade de produtos: "+cont);
    }
    
}
