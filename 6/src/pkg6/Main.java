/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6;

/**
 *
 * @author Lara
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double p1 = 5;
        double p2 = 5;
        double p3 = 5;
        double p4 = 5;
        double media = (p1+p2+p3+p4)/4;
        
        if (media < 5) 
        {
        System.out.println("REPROVADO");
        System.out.println("Media:"+media);
        }
        
        else if (media >= 5  && media < 7)
        {
        System.out.println("RECUPERAÇÃO");
        System.out.println("Media:"+media);
        }
        else if ( media >= 7)
        {
        System.out.println("APROVADO");
        System.out.println("Media:"+media);
        }
        
    }
    
}
