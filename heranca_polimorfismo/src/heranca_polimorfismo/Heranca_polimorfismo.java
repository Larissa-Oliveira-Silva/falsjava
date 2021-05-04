/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca_polimorfismo;

import classes_filhas.Aluno;
import classes_filhas.Cachorro;
import classes_filhas.Carro;
import classes_filhas.Funcionario;
import classes_filhas.Gato;
import classes_filhas.Livro;
import classes_filhas.Moto;
import classes_filhas.Professor;
import classes_filhas.Relogio;

/**
 *
 * @author Lara
 */
public class Heranca_polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cachorro bob = new Cachorro(4,true,"Vira lata","Preto","Macho");
        Gato garfield = new Gato(4,true,5,"Siames","Laranja","Macho");
        
        Professor israel = new Professor(2000, "Linguagem de programação", "Israel", "123456789",26,"Masculino");
        Funcionario maria = new Funcionario(1000,"Funcionario Administrativo","01/01/2021", "Maria","0987654321", 30, "Feminino");
        Aluno rogerio = new Aluno("00000000666","005966",5,"Rogerio","91728302719",40,"Masculino" );       
        
        //Atributos herdados da classe animal
//        bob.setCor("Marrom");
//        bob.setRaca("Vira lata");
//        bob.setMachoFemea("Macho");
        
        //Atributos da propria classe cachorro
        bob.setQtdPatas(4);
        bob.setRabo(true);
        
//        garfield.setIdade(10);
        
        //Mostrar
        
//        System.out.println(bob.getCor());
//        System.out.println(bob.getRaca());
//        System.out.println(bob.getMachoFemea());
//        System.out.println(bob.getQtdPatas());
//        System.out.println(bob.getRabo());
//        
//        System.out.println(bob.comer());
//        System.out.println("GATO");
//        System.out.println(garfield.getIdade());
//        System.out.println(garfield.getCor());
//        System.out.println(garfield.getMachoFemea());
//        System.out.println(garfield.getRaca());  
//            System.out.println("professor");
//            System.out.println(israel.getNome());
//            System.out.println(israel.andar());
//            System.out.println("Funcionario");
//            System.out.println(maria.getDtAdmissao());
//            System.out.println("Aluno");
//            System.out.println(rogerio.getMatricula());

Livro l1 = new Livro("Larissa",250,"SOS aula",120);
//String autor, int paginas, String nome, float preco
Relogio r1 = new Relogio("Digital", "Apple", "Apple watch", "Relogio",1800f);
//String tipo, String marca, String modelo, String nome, float preco
//
//System.out.println(l1.getAutor());
//System.out.println(l1.getNome());
//System.out.println(l1.validaPreco() ? "Caro":"Barato");
//System.out.println(l1.ler());
//System.out.println("------------------");
//System.out.println(r1.getTipo());
//System.out.println(r1.validaPreco()? "Caro":"Barato");
//System.out.println(r1.insereAlarme("21:40"));

//System.out.println(bob.comer());
//System.out.println(garfield.comer());
//
//System.out.println(bob.toString());

Carro gol = new Carro(4,true,100,5,"Volkswagen","Gol","branco");
Carro fusca = new Carro(2,false,47,4,"Volkswagen","Fusca 1968","Azul");
//int qtdPortas, boolean conversivel, int qtdCavalos, int qtdMarchas, String marca, String modelo, String cor
Moto biz = new Moto(50,4,"Honda","Honda Biz 125","Preta");
//int qtdCilindradas, int qtdMarchas, String marca, String modelo, String cor

System.out.println("Moto");
System.out.println(biz.getModelo());
System.out.println(biz.getMarca());
System.out.println(biz.getCor());
System.out.println(biz.toString());
System.out.println(biz.acelerar());
System.out.println("Carro");
System.out.println(fusca.getModelo());
System.out.println(fusca.getMarca());
System.out.println(fusca.getCor());
System.out.println(fusca.toString());
System.out.println(fusca.parar());

System.out.println(gol.getModelo());



        
        
    }
    
}
