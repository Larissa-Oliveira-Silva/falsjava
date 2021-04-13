/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

/**
 *
 * @author Lara
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = null;
        try{
            System.out.println(a.toLowerCase());
         
        }catch(NullPointerException e)
        {
            a = "AI KRL";
            System.out.println(a.toLowerCase());
            
        
        }
    }
    
}
