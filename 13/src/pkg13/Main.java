/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13;

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
        
        Scanner input = new Scanner (System.in);
        
      

		System.out.print("Digite um numero: ");
		int x = input.nextInt();
                System.out.print("Digite um numero: ");
		int y = input.nextInt();
                System.out.print("Digite um numero: ");
		int z = input.nextInt();
                
                if(x<y&&y<z)
  System.out.printf("Ordem decrescente: " +x + y+ z);
else if(x==y&&y<z)
  System.out.printf("Ordem decrescente: " +x + " "+ y+ " "+ z);
else if(z<y&&y==z)
  System.out.printf("Ordem decrescente: " +x + " " + y+ " "+ z);
else if(x==z&&z<y)
  System.out.printf("Ordem decrescente: " +x+ " " +z + " "+ y);
else if(x<z&&z<y)
  System.out.printf("Ordem decrescente: " +x+ " " +z+ " " +y);
else if(y<x&&x<z)
  System.out.printf("Ordem decrescente: " + y+ " " + x+ " "+ z);
else if(y<z&&z<x)
  System.out.printf("Ordem decrescente: " + y+ " " + z+ " "+ x);
else if(z<x&&x<y)
  System.out.printf("Ordem decrescente: " + z+ " " +x+ " " + y);
else
  System.out.printf("Ordem decrescente: " +z+ " " +y + " "+x);
                
                
                
                
    }
    
}
