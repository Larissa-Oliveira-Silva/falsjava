/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_filhas;

import classes_pais.Pessoa;

/**
 *
 * @author Lara
 */
public class Professor extends Pessoa{
    
    private double salario;
    private String disciplina;

    public Professor() {}

    public Professor(double salario, String disciplina, String nome, String cpf, int idade, String sexo) {
        super(nome, cpf, idade, sexo);
        this.salario = salario;
        this.disciplina = disciplina;
    }
    
    public String darAula(){
    return "Dando aula.........";
    }
    
    public String disciplina(){
    return "Disciplina";
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    
    
}
