/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jop1;

import javax.swing.JOptionPane;

/**
 *
 * @author Lara
 */
public class Jop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        System.out.println("Nome: "+nome);
        
        String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome: ");
        System.out.println("Sobrenome: "+sobrenome);
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
        System.out.println("Idade:" +idade+" anos");
    }
    
}
