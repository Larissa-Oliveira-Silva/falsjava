/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rep5;

/**
 *
 * @author Lara
 */
import java.util.Scanner;
public class Rep5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
       
        System.out.println("Digite um numero: ");
       int num = a.nextInt();
       int i =1;
       int par=0;
       int impar=0;
       
       
       while(i<=num)
           {
              
           if ((i%2)==0 )
    {
       par++;
               //System.out.println(i);
    }
           else if ((i%2)!=0)
           {
           impar++;
           }
           
            i++;
           
           }
       System.out.println("Numeros pares:" +par);
       System.out.println("Numeros impares:" +impar);
    }
    
}
