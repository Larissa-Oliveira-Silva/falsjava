/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10;

/**
 *
 * @author Lara
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cliente = "funcionario";
        
        double total = 200;
        double desconto = 0;
        
        switch (cliente)
        {
            
            case "cliente":
               
               System.out.println("Total da compra: R$ "+total);
                break;
                
                case "funcionario":
                    System.out.println("Desconto de 10%");
                    desconto = (total/100)*10;
                    System.out.println("Total da compra: R$ "+(total-desconto));
                    
                break;
                
                case "vip":
                    System.out.println("Desconto de 5%");
                    desconto = (total/100)*5;
                    System.out.println("Total da compra: R$ "+(total-desconto));
               
                break;                
                
                default: System.out.println("Opcção invalida");
                    
  
        }
    }
    
}
