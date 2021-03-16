/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rep.pkg2;

/**
 *
 * @author Lara
 */
public class Rep2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int soma = 0;
        
        for (int i=1; i<=500;i++)
        
{
    if ((i%2)!=0 && (i%3)==0)
    {
        soma+=i;
        // if((numero  % 2) == 0) 
    }
}
         System.out.println("Resultado: " +soma);
}
        
    
}
