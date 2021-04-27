/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

/**
 *
 * @author Lara
 */
public class Pessoa {
    
    protected String nome;
    protected int anoNascimento;
    protected float altura;
    
    protected String exibeDados(){
    return "Nome: "+ this.nome +"\nAno de nascimento: "+this.anoNascimento+"\nAltura: "+this.altura;
    }
    
}
