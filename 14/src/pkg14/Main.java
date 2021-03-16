/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14;

/**
 *
 * @author Lara
 */
import java.io.IOException;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        Scanner again = new Scanner (System.in);
        
        char sexo;

                System.out.print("Digite F para feminino e M para masculino: ");
		sexo = (char)System.in.read();
		System.out.print("Digite sua altura: ");
		float altura = input.nextFloat();
                
                float peso;
            
            if (sexo == 'F'  || sexo == 'f' )
            {
               
              // (62.1 * h) – 44.7.
                peso = (62.1f * altura) - 44.7f;
                System.out.println("Peso ideal: "+peso);
    }
                
               else if (sexo == 'M' || sexo == 'm')
                    
                {
                    
               //(72.7 * h) – 58;
                     
                     peso = (72.7f * altura) - 58;
                     System.out.println("Peso ideal: "+peso);
                     
                     
                }
           
               else 
               {
               System.out.println("Opção invalida");
               }
               
                
               
                
                
                
                
    }
    
}
