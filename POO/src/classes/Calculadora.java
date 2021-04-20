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
public class Calculadora {
    
   double resultrado;
    public String calc(int vl1, int vl2, String op){
    try {
        
        switch(op){
            
            case "+":
                this.resultrado = (vl1+vl2);
                return "Resultado: " + this.resultrado;
                
                case "-":
                this.resultrado = (vl1-vl2);
                return "Resultado: " + this.resultrado;
                
                case "*":
                this.resultrado = (vl1*vl2);
                return "Resultado: " + this.resultrado;
                
                case "/":
                this.resultrado = (vl1/vl2);
                return "Resultado: " + this.resultrado;
                
                default:
                    return "Nenhuma das opções";
               
        
        }
    }catch(ArithmeticException e){
        return "Não é possivel dividir por zero";
    }
    }
}

      