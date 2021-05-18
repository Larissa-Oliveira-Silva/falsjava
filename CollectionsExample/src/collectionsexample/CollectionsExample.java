/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsexample;

import java.time.Clock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Lara
 */
public class CollectionsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        
//        String p1= "Joao";
//        String p2= "Maria";
//        String p3= "Andre";
//        
//        ArrayList<String> pessoas = new ArrayList();
//        
//        pessoas.add(p1);
//        pessoas.add(p2);
//        pessoas.add(p3);
//        pessoas.add("Vitor");
        
//        System.out.print(pessoas);
//        pessoas.remove(0);
//        
//        pessoas.remove("Vitor");
//        System.out.print(pessoas);
//        
//        List<String> nomes = Arrays.asList("Teste 1","Teste 2","Teste 3");
//        System.out.print(nomes);

//        for(String pessoa: pessoas)
//        {
//            if(pessoa.equals("Joao")){
//                pessoa = "Teste";
//                        }
//            System.out.print(pessoas);
//        }
//        
//        System.out.print("Nome: "+pessoas.get(0)+" ");
//        
//        for(int i=0; i<pessoas.size();i++){System.out.print("Nome: "+pessoas.get(i)+" ");}
//        Collections.sort(pessoas);
//    System.out.print(pessoas);

// ArrayList<String> animais = new ArrayList();
//    String a1= "Cachorro";
//    String a2= "Gato";
//    String a3= "Passaro";
//    String a4= "Peixe";
//    String a5= "Javali";
//    
//    animais.add(a1);
//    animais.add(a2);
//    animais.add(a3);
//    animais.add(a4);
//    animais.add(a5);
//    
//    //System.out.print(animais);
//    
//    for(String animal: animais)
//        {
//            System.out.print(animal+" ");
//        }
//    
//    System.out.print(animais.get(0));
//    
//    for(int i=0; i <animais.size();i++)
//    {
//    System.out.print("\nAnimal: "+animais.get(i)+" ");
//    
//    }
//    
//    Collections.sort(animais);
//    System.out.print("\n"+animais);
//    
//    animais.remove(a1);
//    animais.remove(a2);
//    animais.remove(a3);
//    animais.remove(a4);
//    animais.remove(a5);
//    System.out.print("\n"+animais);

//        Pessoa p1 = new Pessoa("Joao",1994,1.74f);
//        Pessoa p2 = new Pessoa("Maria",1992,1.64f);
//        Pessoa p3 = new Pessoa("Pedro",1985,1.80f);
//        
//     //   System.out.print(p1.exibeDados());
//        
//        ArrayList<Pessoa> pessoas = new ArrayList<>();
//        
//        pessoas.add(p1);
//        pessoas.add(p2);
//        pessoas.add(p3);
//    
//       // System.out.print(pessoas);
//        
////        for(Pessoa pessoa:pessoas){
////        if(pessoa.getNome().equals("Joao")){
////        pessoa.setNome("Teste");
////        }
////        
////        System.out.print(pessoa.exibeDados());
////        
////        }
//        
//        //pessoas.forEach(pessoa ->{System.out.print(pessoa.exibeDados());});
//        //pessoas.stream().limit(2).forEach(pessoa->{System.out.print(pessoa.exibeDados());});
//        pessoas.stream().skip(1).forEach(pessoa->{System.out.print(pessoa.exibeDados());});

        
        
//        Animal a1 = new Animal("Cachorro","Preto","Nyx");
//        Animal a2 = new Animal("Gato","Cinza","Happy");
//        Animal a3 = new Animal("Peixe","Azul","Dori");
//        Animal a4 = new Animal("Cobra","Amarela","Kisa");
//        Animal a5 = new Animal("Passaro","Branco","Khan");
//        
//        ArrayList<Animal> animais = new ArrayList<>();
//        
//        animais.add(a1);
//        animais.add(a2);
//        animais.add(a3);
//        animais.add(a4);
//        animais.add(a5);
        
//        animais.stream().limit(3).forEach(animal->{System.out.print(animal.toString());});
//        animais.stream().skip(2).forEach(animal->{System.out.print(animal.toString());});
        
//        animais.stream().filter(animal -> animal.getNome().equals("Kisa")).forEach(a ->{System.out.print(a.toString());});
        
//           animais.stream().map(Animal::getNome).forEach(a ->{System.out.print(a+" ");});
//           animais.stream().map(animal->animal.getNome()).forEach(a ->{System.out.print("\n"+a+" ");});
           
//            Pessoa2 p1 = new Pessoa2("Pedro",25,"M");
//            Pessoa2 p2 = new Pessoa2("Pedro",18,"M");
//            Pessoa2 p3 = new Pessoa2("Marcos",16,"M");
//            Pessoa2 p4 = new Pessoa2("Maria",25,"F");
//            Pessoa2 p5 = new Pessoa2("Juliana",25,"F");
//            
//            ArrayList<Pessoa2> pessoas = new ArrayList<>();
//            
//            pessoas.add(p1);
//            pessoas.add(p2);
//            pessoas.add(p3);
//            pessoas.add(p4);
//            pessoas.add(p5);
//            
//            //p1.filtro(pessoas, "nome", "Pedro");
//            System.out.print(p1.retornaNome(pessoas));
//            
//            List<Integer> numbers = Arrays.asList(10,10,10,10,10);
//            Collections.sort(numbers);
//            
//            System.out.print(numbers);
//            
//            int resultado = numbers.stream().reduce(0, (anterior, atual) -> anterior + atual);
//        
//        System.out.println("\nResultado: " + resultado);


    Numeros n1 = new Numeros(1);
        Numeros n2 = new Numeros(1);
        Numeros n3 = new Numeros(1);
        Numeros n4 = new Numeros(1);
        Numeros n5 = new Numeros(1);
        Numeros n6 = new Numeros(1);
        Numeros n7 = new Numeros(1);
        Numeros n8 = new Numeros(1);
        Numeros n9 = new Numeros(1);
        
        ArrayList<Numeros> numeros = new ArrayList<>();
        
        numeros.add(n1);
        numeros.add(n2);
        numeros.add(n3);
        numeros.add(n4);
        numeros.add(n5);
        numeros.add(n6);
        numeros.add(n7);
        numeros.add(n8);
        numeros.add(n9);
        
//        System.out.println(n1.ordenaNumeros(numeros));
        System.out.println("Resultado: " + n1.somaNumeros(numeros));
    
    
    }
    
    
}
