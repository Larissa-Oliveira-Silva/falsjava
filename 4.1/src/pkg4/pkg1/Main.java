/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg1;

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
        
        
        //int numero = 80;
        Scanner input = new Scanner (System.in);

		System.out.print("Digite um numero: ");
		int numero = input.nextInt();

      if((numero  % 2) == 0)  
         System.out.println("Par");
      else 
         System.out.println("Impar");
    }
    
}
