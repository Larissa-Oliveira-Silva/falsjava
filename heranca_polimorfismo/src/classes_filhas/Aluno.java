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
public class Aluno extends Pessoa{
    
    private String ra;
    private String matricula;
    private int semestre;

    public Aluno() {}

    public Aluno(String ra, String matricula, int semestre, String nome, String cpf, int idade, String sexo) {
        super(nome, cpf, idade, sexo);
        this.ra = ra;
        this.matricula = matricula;
        this.semestre = semestre;
    }
    
    public String estudar(){
    return "Estudando.........";
    }
    
    public String fazerProva(){
    return "Fazendo prova.........";
    }

    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getSemestre() {
        return this.semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    
}
