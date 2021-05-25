/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexemplo;

/**
 *
 * @author Lara
 */
public class Pessoa implements IPessoa {
    
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    
    public Pessoa() {}
    
    
    @Override
    public String adicionar() {
    return "Adicionando pessoa";    
    }

    @Override
    public String excluir() {
     return "Excluindo pessoa";      
    }

    @Override
    public String pesquisar() {
     return "Pesquisando pessoa";      
    }
    
    public String comer() {
    return "Comendo..."; 
    }
     public String andar() {
    return "Andando..."; 
    }
      public String dormir() {
    return "Dormindo..."; 
    }
    
}
