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
public class Celular {
    
    private String cor;
    private String marca;
    private String modelo;
    private String dimensao;
    private String quantidadememoria;

    public Celular() {
    }

    public Celular(String cor, String marca, String modelo, String dimensao, String quantidadememoria) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.dimensao = dimensao;
        this.quantidadememoria = quantidadememoria;
    }
    
    public String fazerLigacao(String numero){
    return "Ligando para "+numero;
    }
    
    public String receberLigacao(){
    return "Recebendo ligação";
    }
    
     public String enviarSms(String numero){
    return "Enviando SMS para "+numero;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDimensao() {
        return dimensao;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }

    public String getQuantidadememoria() {
        return quantidadememoria;
    }

    public void setQuantidadememoria(String quantidadememoria) {
        this.quantidadememoria = quantidadememoria;
    }
    
    //botão direito "Inserir codigo" FAZ SOZINHO
    
}
