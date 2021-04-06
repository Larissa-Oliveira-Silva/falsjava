/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jop8;

import javax.swing.JOptionPane;

/**
 *
 * @author Lara
 */
public class Jop8 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
        //1
        String[] op = {"Sim","Não"};
        int pontos = 0;
        int qtd =0;
        
        int opcao = JOptionPane.showOptionDialog(null,"O mar é molhado?","Escolha uma opção",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,op,op[0]);
        //JOptionPane
        
        if(op[opcao].equals("Sim"))
        {
        pontos+=8;
         qtd+=1;
        }
        
        else 
        {
        pontos+=0;
        }
        
        //2
        String[] op1 = {"Sim","Não"};
        
        int opcao1 = JOptionPane.showOptionDialog(null,"O céu é verde?","Escolha uma opção",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,op,op[0]);
        //JOptionPane
        
        if(op1[opcao1].equals("Sim"))
        {
        pontos+=0;
        }
        
        else 
        {
        pontos+=7;
         qtd+=1;
        }
        
        //3
        
        String[] op2 = {"Sim","Não"};
        
        int opcao2 = JOptionPane.showOptionDialog(null,"Cachorros são fofos?","Escolha uma opção",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,op,op[0]);
        //JOptionPane
        
        if(op[opcao].equals("Sim"))
        {
        pontos+=15;
        qtd+=1;
        }
        
        else 
        {
        pontos+=0;
        }
        
        JOptionPane.showMessageDialog(null, "Pontuação: "+pontos);
        JOptionPane.showMessageDialog(null, "Quantidade de acertos: "+qtd);
         
        
    }
    
}
