/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11;

/**
 *
 * @author Lara
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       
       String nome;
       String sobrenome;
       
       System.out.println("Digite seu nome: ");
       nome = ler.nextLine();
       
       System.out.println("Digite seu sobrenome: ");
       sobrenome = ler.nextLine();
       
       System.out.println("Nome completo: "+nome + " "+sobrenome);
    }
    
}
