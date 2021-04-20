/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Lara
 */
public class Carro {
    
    int qtdPortas;
    String cor, marca, modelo;
    int velocidade;
    
    public Carro (int qtdPortas, String cor, String marca, String modelo, int velocidade ){
    this.qtdPortas = qtdPortas;
    this.cor = cor;
    this.marca = marca;
    this.modelo = modelo;
    this.velocidade = velocidade;
    }
    
    public Carro (){}
    
    public String exibeValores(){
    return "Carro: " + this.modelo + "\nMarca: "+ this.marca + "\n Cor: "+ this.cor + "\n Quantidade de portas: "+this.qtdPortas + "\n Velocidade: "+ velocidade;
    }
    
//    public String acelerar (int velocidade){
//        return "Velocidade: "+ velocidade;
//        
//        
//    }
    
//      public void acelerar (int velocidade){
//       // return "Velocidade: "+ velocidade;
//       this.velocidade += velocidade;
//            
//    }
    
          public void acelerar (int km){
       // return "Velocidade: "+ velocidade;
       
       this.velocidade += km;
       
       if (this.velocidade >100)
       { System.out.println("Velocidade maxima atingida.");
       this.velocidade =100;
//       }else{
//       this.velocidade += km;
//       }
       }
            
    }
    public int exibeVelocidade(){
        return this.velocidade;
        }
    
}
