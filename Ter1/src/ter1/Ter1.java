/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ter1;

import java.util.Scanner;

/**
 *
 * @author Lara
 */
public class Ter1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         
          int num =0;
          Scanner ler = new Scanner(System.in);
          System.out.println("Digite um numero");
          num = ler.nextInt();
        String semestre = (num >=13 || num <=0) ? "Não existe mes correspondente" : num <= 6 ? "Primeiro Semestre":"Segundo Semestre";
        System.out.println(semestre);
    }
    
}
