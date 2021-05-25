/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import classes.Calculadora;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;

/**
 *
 * @author Lara
 */
public class CalculadoraTeste extends TestCase{
    
    public void testesoma(){
    int valor1=20;
    int valor2=5;
    
    int vlEsperado =25;
    
    int vlRecebido = Calculadora.soma(valor1, valor2);
    
        assertEquals(vlEsperado, vlRecebido);
        
        //Ctrl+f6 pra rodar o teste
    
    }
    
    public void testesubtracao(){
    int valor1=10;
    int valor2=5;
    
    int vlEsperado =5;
    
    int vlRecebido = Calculadora.subtracao(valor1, valor2);
    
        assertEquals(vlEsperado, vlRecebido);
        
        //Ctrl+f6 pra rodar o teste
    
    }
    
    public void testemultiplicacao(){
    int valor1=10;
    int valor2=5;
    
    int vlEsperado =50;
    
    int vlRecebido = Calculadora.multiplicacao(valor1, valor2);
    
        assertEquals(vlEsperado, vlRecebido);
    
    }
    
    public void testedivisao(){
    int valor1=10;
    int valor2=5;
    
    int vlEsperado =2;
    
    int vlRecebido = Calculadora.divisao(valor1, valor2);
    
        assertEquals(vlEsperado, vlRecebido);
        
        //Ctrl+f6 pra rodar o teste
    
    }
    
    
}
