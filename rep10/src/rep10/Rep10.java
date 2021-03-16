/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rep10;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Lara
 */
public class Rep10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Scanner a = new Scanner(System.in);
        char op;
        double saldo = 0;
         
         do{
         System.out.println("(a)Consulta saldo \n(b)Saque\n(c)Deposito\n(d)Sair ");
         op =(char)System.in.read();
         
         switch (op)
        {   
            case 'a':
               
              System.out.println("Saldo: "); 
              System.out.println(saldo); 
                break;
                
            case 'b':
                double qtds; 
                 System.out.println("Saque");  
                 System.out.println("Digite a quantidade:");
                 qtds = a.nextDouble();
                  saldo = saldo - qtds;
                break;
                
            case 'c':
                System.out.println("Deposito");
                double qtdd;
                System.out.println("Digite a quantidade:");
                 qtdd = a.nextDouble();
                 saldo = saldo + qtdd;
                
               
                break;                

         }
         
         } 
         while(op!='d');
         System.out.println("Obrigada por utilizar nossos serviços");
         
    }
    
}
