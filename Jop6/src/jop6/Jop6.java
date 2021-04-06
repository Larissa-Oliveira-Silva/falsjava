/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jop6;

import javax.swing.JOptionPane;

/**
 *
 * @author Lara
 */
public class Jop6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] op = {"Java Enterprise Edition","Java Standard Edition","Java Micro Edition", "Java FX"};
        
        int opcao = JOptionPane.showOptionDialog(null,"A plataforma Java é composta por 4 edições para segmentos especificos de aplicações, assinale a alternativa que corresponde a edição utilizada em aula aula","Escolha uma opção",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,op,op[0]);
        //JOptionPane
        
        if(opcao == 1)
        {
        JOptionPane.showMessageDialog(null, "Acertou");
        }
        
        else 
        {
        JOptionPane.showMessageDialog(null, "Errou\n A opcão correta é: Java Standard Edition");
        }
//        JOptionPane.showMessageDialog(null, op[opcao]);
//        System.out.println(op[opcao]);  
    }
    
}
