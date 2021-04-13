/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ternario;

/**
 *
 * @author Lara
 */
public class Ternario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numeroDias =16;
        String quinzena = (numeroDias <0) ? "Inexistente" : numeroDias <= 15 ? "Primeira Quinzena":"Segunda Quinzena";
        System.out.println(quinzena);
    }
    
}
