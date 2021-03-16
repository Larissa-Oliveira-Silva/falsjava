/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15;

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
        
         Scanner ler = new Scanner(System.in);
         
         Scanner a = new Scanner(System.in);
         
       
       String pag = "a";
       
       System.out.println("Digite o valor total da compra: ");
       float total = a.nextFloat();
       System.out.println("Digite a forma de pagamento: ");
       pag = ler.nextLine();
       
       //float total = 100;
       float desconto;
       
       switch (pag)
        {
            
            case "a vista":
                desconto = total /100 *10;
                total = total + desconto ;
                System.out.println("Valor a pagar: "+total);
              
                break;
                
                case "a prazo":
                  
                    System.out.println("Valor a pagar: "+total);
                    
                break;
                              
                
                default: System.out.println("Opcção invalida");
       }
    }
    
}
