/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Lara
 */
public class Pessoa2 {
    
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa2(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public Pessoa2() {}

    @Override
    public String toString() {
        return "Pessoa2{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}'+"\n";
    }
    
   public void filtro(List<Pessoa> pessoas, String tpFiltro, String nome){
        
        if(tpFiltro.equals("nome")){
            pessoas.stream().filter(pessoa -> pessoa.getNome().equals(nome))
            .forEach(p -> {
                System.out.println(p.toString());
            });
        }else if (tpFiltro.equals("idade")){
            pessoas.stream().filter(pessoa -> pessoa.getIdade() > 18).forEach(p ->{
                System.out.println(p.toString());
            });
        }
    }
    
//    public List<String> retornaNome(List<Pessoa> pessoas){
//        
//        ArrayList<String> auxiliar = new ArrayList<>();
//        pessoas.stream().map(pessoa -> pessoa.getNome()).forEach(p -> {
//               auxiliar.add(p);
//        });
//        
//        Collections.sort(auxiliar);
//        return auxiliar;
//    } 
        
   
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<String> retornaNome(ArrayList<Pessoa2> pessoas) {
          ArrayList<String> auxiliar = new ArrayList<>();
        pessoas.stream().map(pessoa -> pessoa.getNome()).forEach(p -> {
               auxiliar.add(p);
        });
        
        Collections.sort(auxiliar);
        return auxiliar;
    }
    
    
    
}
