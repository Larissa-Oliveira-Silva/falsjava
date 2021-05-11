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
public class Notas {
    
    private double media;
    
    public Notas() {}
    public Notas(double media) {
        this.media = media;
    }
    
    public void calculaMedia(float p1, float p2, float p3, float p4){
        this.media = (p1+p2+p3+p4)/4; 
    
    }
    
    public String exibeMedia(){
        
         System.out.println(this.media);
      if(this.media > 7)
      {
          return "Media: "+ Math.round(this.media);
                  }
      
      else if(this.media  >5 && this.media <7){
      return "Media: "+Math.floor(this.media);
      }
      
      else if (this.media<5)
      {
      return "Media: "+Math.ceil(this.media);
      }
      else {
      return "Media" + this.media;}
// return this.media; 
    
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    
    
    
    
}
