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
public class Pessoa {
    String nome;
    int anoNascimeto;
    float altura;
    
    public Pessoa(){}
    public Pessoa(String nome, int anoNascimento, float altura){
    this.nome=nome;
    this.anoNascimeto = anoNascimento;
    this.altura=altura;
    }
    
    
    public int calculaIdade(){
       // int conta = 2021 - this.anoNascimeto;
    return (2021 - this.anoNascimeto);
    }
    
     public String imprimeDados(){
    return "Nome: " +this.nome + "\n Ano de Nascimento: "+ this.anoNascimeto + "\nAltura: "+ altura;
    
    }
    
   
}
