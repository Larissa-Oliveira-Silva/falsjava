/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12;

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
        // TODO code application logic here
        
         Scanner input = new Scanner (System.in);

		System.out.print("Digite um numero: ");
		int numero = input.nextInt();

      if((numero  % 2) == 0)  
      {
         //System.out.println("Par");
          numero = numero+5;
      System.out.println("Resultado: "+numero);
      }
      else 
         
      {
      //System.out.println("Impar");
          numero = numero+8;
      System.out.println("Resultado: "+numero);
          
      }
    }
    
}
