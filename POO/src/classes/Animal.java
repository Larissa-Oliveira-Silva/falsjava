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
public class Animal {
    
    String nome;
    boolean temPata;
    boolean peixe;
    int qtdPatas;
    String cor;
    String raca;
    String machoFemea;
    
    public Animal(){}
    public Animal(String nome, boolean temPata, boolean peixe, int qtdPatas, String cor, String raca, String machoFemea){
    this.temPata = temPata;
    this.peixe = peixe;
    this.qtdPatas = qtdPatas;
    this.cor = cor;
    this.raca = raca;
    this.machoFemea = machoFemea;
    
    }
    
    
    public String andar(){
    if (this.temPata ==true){
        return "Andando";
    }else if (this.peixe == true)
    {
    return "Nadando";
    }else {
        return "Rastejando";
    }
    }
    public String descansar(){
    return "Descansando";
    }
    
    public String correr(){
    if (this.temPata ==true){
        return "Correndo";
    }else if (this.peixe == true)
    {
    return "Nadando rapido";
    }else {
        return "Rastejando rapido";
    }
    }
   
}
