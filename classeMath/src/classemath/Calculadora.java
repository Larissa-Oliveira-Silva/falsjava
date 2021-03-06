/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classemath;

/**
 *
 * @author Lara
 */
public class Calculadora {
    
    private int vlUm;
    private int vlDois;
    private String operacao;

    public Calculadora(int vlUm, int vlDois, String operacao) {
        this.vlUm = vlUm;
        this.vlDois = vlDois;
        this.operacao = operacao;
    }
    
    public Calculadora() {}
    
    public String calcula(){
        
        try{
        switch(this.operacao){
            case "+":
                return "Resultado:" + Math.addExact(this.vlUm, this.vlDois);
                
                case "-":
                return "Resultado:" + Math.subtractExact(this.vlUm, this.vlDois);
                
                case "*":
                return "Resultado:" + Math.multiplyExact(this.vlUm, this.vlDois);
               
               case "/":
                return "Resultado:" + Math.floorDiv(this.vlUm, this.vlDois);
                default:
                    return "Operação invalida";
                
        }
    
        }catch(ArithmeticException e){
        return "Não é possivel dividir por 0";
        }
        
    }

    public int getVlUm() {
        return vlUm;
    }

    public void setVlUm(int vlUm) {
        this.vlUm = vlUm;
    }

    public int getVlDois() {
        return vlDois;
    }

    public void setVlDois(int vlDois) {
        this.vlDois = vlDois;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
    
    
    
    
    
}
