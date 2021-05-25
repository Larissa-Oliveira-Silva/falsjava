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
public class Restaurante implements ICardapio {
    
    private String lanche;
    private String pratoComida;
    private String sobremesa;
    private String bebida;

    public Restaurante(String lanche, String pratoComida, String sobremesa, String bebida) {
        this.lanche = lanche;
        this.pratoComida = pratoComida;
        this.sobremesa = sobremesa;
        this.bebida = bebida;
    }
    
     public Restaurante() {}
     
     public String fazerPedido (String pedido){
     return "Anotando pedido";
     }
     
     public String opcoesPedido (){
     return "Opcoes de pedido";
     }

    @Override
    public String toString() {
        return "Pedido:" + "\nLanche: " + lanche + "\nPrato: " + pratoComida + "\nSobremesa: " + sobremesa + "\nBebida: " + bebida;
    }
     
     

    @Override
    public String lanche(String lanche) {
        this.lanche =lanche;
    return "Preparando lanche "+lanche;    
    }

    @Override
    public String pratoComida(String tpPratoComida) {
        this.pratoComida = tpPratoComida;
        return "Preparando prato "+tpPratoComida;
    }

    @Override
    public String sobreMesa(String tpSobremesa) {
        this.sobremesa = tpSobremesa;
     return "Preparando a sobremesa "+tpSobremesa;   
    }

    @Override
    public String bebida(String tpBebida) {
        this.bebida = tpBebida;
     return "Preparando a bebida "+tpBebida;    
    }
    
}
