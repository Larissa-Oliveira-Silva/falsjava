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
public class Funcionario {
    
    public String nome;
    public int anoNascimento;
    public int cpf;
    public String endereco;
    public float salario;
    
    public String imprimeDados(){
    return "Nome: "+ this.nome+ "\nAno de nascimento: "+this.anoNascimento+"\nCPF: "+this.cpf+"\nEndereço: "+this.endereco+"Salario: "+this.salario;
    }
    
    public String exibeSalario(){
    return "Salario: "+this.salario;
    }
    
    public void aumentaSalario(float porcentagem){
    this.salario = this.salario + ((salario/100)*porcentagem);
  //  System.out.print(this.salario);
    
    }
}
