/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_pais;

/**
 *
 * @author Lara
 */
public class Pessoa {
    
    private String nome;
    private String cpf;
    private int idade;
    private String sexo;
    
    public Pessoa(){}
    
    public Pessoa(String nome, String cpf, int idade, String sexo){
    this.nome = nome;
    this.cpf = cpf;
    this.idade = idade;
    this.sexo = sexo;
    }
    
    public String comer(){
    return "Comendo........";
    }
    
    public String andar(){
    return "Andando........";
    }
    
    public String dormir(){
    return "Dormindo........";
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
