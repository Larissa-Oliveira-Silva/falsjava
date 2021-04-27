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
public class Paciente {
    
    private String nome;
    private int rg;
    private String endereco;
    private String telefone;
    private String dtNascimento;
    private String profissao;
    
    public Paciente(){}
     public Paciente(String nome, int rg, String endereco, String telefone, String dtNascimento, String profissao)
     {
     this.nome=nome;
     this.rg=rg;
     this.endereco=endereco;
     this.telefone=telefone;
     this.dtNascimento=dtNascimento;
     this.profissao=profissao;
             
     }
     
     public String adicionarConsulta(){ 
         return "Consulta adicionada";
     }
     
     public String cadastrarPaciente(){
     return "Paciente cadastrado";
     }
     
     public String verificaPaciente(){
     return "Nome: "+this.nome+"\nRG: "+this.rg+"\nEndereco: "+this.endereco+"\nTelefone: "+this.telefone+"\nData de nascimento: "+ this.dtNascimento+"\nProfissão: "+ this.profissao;
     }
     
     public void setNome(String nome){
     this.nome=nome;
     }
     
     public void setRg(int rg){
     this.rg=rg;
     }
     
    public void setEndereco(String endereco){
     this.endereco=endereco;
     }
    
     public void setTelefone(String telefone){
     this.telefone=telefone;
     }
     
      public void setdtNascimento(String dtNascimento){
     this.dtNascimento=dtNascimento;
     }
      
      public void setProfissao(String profissao){
          this.profissao=profissao;
      }
      
      public String getNome(){
    return this.nome;
            
    }
      
      public int getRg(){
    return this.rg;
            
    }
      
       public String getEndereco(){
    return this.endereco;
            
    }
       
        public String getTelefone(){
    return this.telefone;
            
    }
        
         public String getdtNascimento(){
    return this.dtNascimento;
            
    }
         
          public String getProfissao(){
    return this.profissao;
            
    }
      
      
}
