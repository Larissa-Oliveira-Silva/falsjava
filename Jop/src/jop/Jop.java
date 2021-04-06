/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jop;

import javax.swing.JOptionPane;

/**
 *
 * @author Lara
 */
public class Jop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
//        System.out.println("Ola "+nome+"!");
//        JOptionPane.showMessageDialog(null, nome);
//        
//        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
//        System.out.println("Idade:" +idade);
//        
//        float nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua nota"));
//        System.out.println("Nota:" +nota);
//        
//        int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair", "Confirmação",JOptionPane.YES_NO_OPTION);
//        JOptionPane.showMessageDialog(null, resposta);
        
        String[] op = {"Correto","Incorreto"};
        
        int opcao = JOptionPane.showOptionDialog(null,"A soma de 1+1=2?","Escolha uma opção",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,op,op[0]);
        //JOptionPane
        JOptionPane.showMessageDialog(null, op[opcao]);
        System.out.println(op[opcao]);              
        
    }
    
}
