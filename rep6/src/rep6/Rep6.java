/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rep6;

/**
 *
 * @author Lara
 */
import java.util.Scanner;
public class Rep6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
       int i =1;
       double nota;
       double total = 0;
       double media = 0;
        System.out.println("Digite quantos alunos tem na sala: ");
       int alunos = a.nextInt();
       while(i<=alunos)
           {
           System.out.println("Digite a nota do "+i+"º aluno");
           nota = a.nextDouble();
           total = total + nota;
           i++;
           
           }
       
       media = total/(i-1);
       System.out.println("Media da sala: "+media);
       
    }
    
}
