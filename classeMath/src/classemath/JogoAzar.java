/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classemath;

/**
 *
 * @author Lara
 */
public class JogoAzar {

    public JogoAzar() {}
    
//    public void jogar(int v1, int v1, int v3,int v4, int v5){
//      //  int[] a = new int[4];
//    return 5;
//    }
//    public void calculaMedia(int v1, int v2, int v3, int v4, int v5){
//       int cont=0;
//        double randon=Math.random();
//       int[] b = new int[4];
//       b [0] = v1;
//       b [1] = v2;
//       b [2] = v3;
//       b [3] = v4;
//       b [4] = v5;
//        int[] a = new int[4];
//       for (int i = 0; i < 5; i++) {
//       a[i] = (int)(1+randon * (5-1));
//       System.out.println(a[i]);
//       }
//       
//       for (int j = 0; j < 5; j++) {
//       if (a[j]==b[j]){
//       cont++;
//       }
    
    public String jogar(int[] numeros){
    int cont=0;
    for(int n: numeros)
    { 
    double randon = Math.random();
    int i = (int)(1+randon * (10-1));
    System.out.println("Aleatorio: "+i);
            System.out.println("Digitado: "+ n);
    if(i==n){
    cont++;
    }
    }
    return "Quantidade de acertos: "+cont;
    }
       }
       
      
    
    
    

