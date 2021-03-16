/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rep11;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Lara
 */
public class Rep11 {

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
         
         if(op == 'a')
         {System.out.println("Saldo: "); 
          System.out.println(saldo);};
         
           else if(op =='b')
                   {}
         }
         
        
                 
             while(op!='d');
         
         System.out.println("Obrigada por utilizar nossos serviços");
    }
    
}
