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
public class RestauranteJapones extends Restaurante{
    
    @Override
    public String fazerPedido (String pedido){
     return "Anotando pedido";
     }
     
    @Override
     public String opcoesPedido (){
     return "Opcoes de pedidos: \nTemaki \nHot roll";
     }
    
}
