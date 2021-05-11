/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classemath;

import java.util.Scanner;

/**
 *
 * @author Lara
 */
public class ClasseMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println(Math.PI); //PI
//        System.out.println(Math.pow(2, 4)); //POTENCIA
//        System.out.println("Raiz quadrada " + Math.sqrt(25));//RAIZ
//        System.out.println("Numero maior "+Math.max(10, 2));//MAIOR
//        System.out.println("Menor numero " +Math.min(10, 2)); //MENOR
//        System.out.println("Retorna positivo "+Math.abs(-50));//DEIXA O NUMERO POSITIVO
//        System.out.println("Retorna o resto da divisão "+ Math.floorMod(10, 3));//MOSTRA O RESTO

//  Utilis teste = new Utilis(10, 2,49 , -200);
//
//  System.out.println("Raiz: "+teste.calculaRaizQuadrada());
//  System.out.println("Potencia: "+teste.calculaPotencia());
//  System.out.println("Positivo: "+teste.retornaPositivo());
//  System.out.println("Maior: "+teste.verificaMaior());
//  System.out.println("Menor: "+teste.verificaMenor());
//  System.out.println("Par ou impar: "+teste.parImpar(5));
    // De .5 acima arredonta pra cima, abaixo de .5 arredonda pra baixo
//    System.out.println(Math.round(22.6));//Arredondamento pra cima
//    System.out.println(Math.round(22.4));//Arredondamento pra baixo
//    //Força
//    System.out.println(Math.ceil(22.1));//Arredondamento pra cima
//    System.out.println(Math.floor(22.6));//Arredondamento pra baixo
   
//    Notas media = new Notas();
//    media.calculaMedia(7.5f, 6.9f, 8.0f, 10.0f);
//    System.out.println(media.exibeMedia());

//OPERAÇÕES MATEMATICAS COMUNS

//System.out.println("Soma: "+ Math.addExact(10, 2));
//System.out.println("Subtração: "+ Math.subtractExact(10, 2));
//System.out.println("Divisão: "+ Math.floorDiv(10, 2));
//System.out.println("Multiplicação: "+ Math.multiplyExact(10, 2));

//Calculadora op = new Calculadora(10,5,"*");
//
////op.setOperacao("-");
//
//System.out.println(op.calcula());
    
//RANDOM
//        System.out.println("Randon: "+ Math.random());//Numero randon entre 0 e 1
//        
//        double randon=Math.random();
//        int numero=(int)(1+randon * (100-1));
//        System.out.println("Numero aleatorio de 1 a 100: "+numero);
        
        int number[] = new int[5];
        Scanner ler = new Scanner(System.in);
        
        for(int i= 0; i<5;i++){
         System.out.println("Digite um numero");
         number[i] = ler.nextInt();
        }
        
        JogoAzar jogo = new JogoAzar();
        System.out.println(jogo.jogar(number));
    
    }
    
}
