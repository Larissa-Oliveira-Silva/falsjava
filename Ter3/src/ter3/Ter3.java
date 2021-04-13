/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ter3;

import javax.swing.JOptionPane;

/**
 *
 * @author Lara
 */
public class Ter3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] op = {"0x10","10x50","100x2"};
        int num = 0;
         int opcao = JOptionPane.showOptionDialog(null,"Escolha um numero pra ver a tabuada","Escolha uma opção",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,op,op[0]);
        String tab = op[opcao].equals("0x10") ? "0": op[opcao].equals("10x50") ? "500":"200";
        System.out.println(tab);
        JOptionPane.showMessageDialog(null, tab);
//        for (int i = 0; i <=10;i++)
//        {
//         System.out.println(num+" * "+i+" = "+(i*num));
//         JOptionPane.showMessageDialog(null, num+" * "+i+" = "+(i*num));
//        }
        
    }
    
}
