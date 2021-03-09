/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8;

/**
 *
 * @author Lara
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        
        String op = "+";
        
        switch (op)
        {
            
            case "+":
                System.out.println("Adição");
                System.out.println(a+"+"+b+"="+(a+b));
                break;
                
                case "-":
                System.out.println("Subtração");
                System.out.println(a+"-"+b+"="+(a-b));
                break;
                
                case "*":
                System.out.println("Multiplicação");
                System.out.println(a+"*"+b+"="+(a*b));
                break;
                
                case "/":
                System.out.println("Divisão");
                System.out.println(a+"/"+b+"="+(a/b));
                break;
                
                default: System.out.println("Operavção invalida");
                    
  
        }
    }
    
}
