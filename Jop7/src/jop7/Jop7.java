/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jop7;

import javax.swing.JOptionPane;

/**
 *
 * @author Lara
 */
public class Jop7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] op = {"2,18","3,16","3,14","1,8"};
        int opcao = 0;      
        //int opcao = JOptionPane.showOptionDialog(null,"Selecione a opção que corresponde ao valor de PI","Escolha uma opção",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,op,op[0]);
    while(opcao != 2)
         {
             
             
           opcao = JOptionPane.showOptionDialog(null,"Selecione a opção que corresponde ao valor de PI","Escolha uma opção",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,op,op[0]);
            
          
         }
    
    JOptionPane.showMessageDialog(null, "Acertou");
    }
        
         
         
    }
    

