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
public class ControleRemoto {
    
    int volume = 5;
    int canal =5;
    
    public void aumentarVolume()
    {
         this.volume ++;
          if (this.volume >10)
       { System.out.println("Limite maximo atingido.");
       this.volume =10;
//       }else{
//       this.velocidade += km;
//       }
       }
    
    }
    
     public void diminuirVolume()
    {
    this.volume --;
    }
    
       public int exibeVolume(){
        return this.volume;
        }
       //aaaaaaaaaaaaa
       
       public void aumentarCanal()
    {
        
         this.canal ++;
          if (this.canal  >10)
       { System.out.println("Limite maximo atingido.");
       this.canal  =10;

       }
    
    }
    
     public void diminuirCanal()
    {
      //  System.out.println("Canal -1");
    this.canal  --;
    }
     
     
        public int exibeCanal(){
        return this.canal;
        }
}
