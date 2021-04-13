/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ter2;

import java.util.Scanner;

/**
 *
 * @author Lara
 */
public class Ter2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          int num =0;
          Scanner ler = new Scanner(System.in);
          System.out.println("Digite a quantidade de erros");
          num = ler.nextInt();
          
           String erro = (num <=0) ? "Nenhum erro detectado" : num <= 1 ? "1 erro detectado":num+" erros detectados";
        System.out.println(erro);
    }
    
}
