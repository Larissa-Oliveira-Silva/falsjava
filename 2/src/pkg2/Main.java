/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

/**
 *
 * @author Lara
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a = 1.75f;
        float b =1.8f;
        float c =3.5f;
        
        float result;
         result = a + b;
         
         if (result > c)
         {
         System.out.print("A soma de A + B é maior que C");
         }
         
         else if (result<c)
             
         {
         System.out.print("A soma de A + B é menor que C");
         }
         
         else if (result==c )       
         {
         System.out.print("A soma de A + B é igual a C");
         }
         
       
         
        
        
    }
    
}
