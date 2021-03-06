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
public class Numeros { 
    private int numero;

    public Numeros(int numero) {
        this.numero = numero;
    }
    
     public Numeros() {}

    @Override
    public String toString() {
        return "Numeros{" + "numero=" + numero + '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
     
    public List<Integer> ordenaNumeros(List<Numeros> numeros){
        ArrayList<Integer> auxiliar = new ArrayList<>();
        
        numeros.forEach(numero -> {
            auxiliar.add(numero.getNumero());
        });
        
        Collections.sort(auxiliar);
        return auxiliar;
    }
    
    public int somaNumeros(List<Numeros> numeros){
        ArrayList<Integer> auxiliar = new ArrayList<>();
        numeros.forEach(numero -> {
            auxiliar.add(numero.getNumero());
        });
        
        return auxiliar.stream().reduce(0, (anterior, atual) -> anterior + atual);
        
    }
     
    
    
    
}
