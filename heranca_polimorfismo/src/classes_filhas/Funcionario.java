/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_filhas;

import classes_pais.Pessoa;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

/**
 *
 * @author Lara
 */
public class Funcionario extends Pessoa {
    
    private double salario;
    private String cargo;
    private String dtAdmissao;

    public Funcionario() {
    }

    public Funcionario(double salario, String cargo, String daAdmissao, String nome, String cpf, int idade, String sexo) {
        super(nome, cpf, idade, sexo);
        this.cargo = cargo;
        this.salario=salario;
        this.dtAdmissao=daAdmissao;
    }
    
     public String trabalhar(){
    return "Trabalhando.........";
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDtAdmissao() {
        return this.dtAdmissao;
    }

    public void setDtAdmissao(String dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }
     
     
    
}
