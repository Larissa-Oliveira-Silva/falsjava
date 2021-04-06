/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jop2;

import javax.swing.JOptionPane;

/**
 *
 * @author Lara
 */
public class Jop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));
        double n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota"));
        //System.out.println("Idade:" +idade+" anos");
        double media = 0;
        media =(n1+n2+n3+n4)/4;
        
        if (media>=7 )
        {
        System.out.println("APROVADO");
        }
        
        else
        {
        System.out.println("EXAME");
        }
    }
    
}
