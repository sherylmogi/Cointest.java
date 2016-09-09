import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
public class Coin
{
   //fields
   private Image heads;
   private Image tails;
   private int currentFace = 0;
   
   //constructor (s)
   public Coin (Image headsImg, Image tailsImg) {
       heads = headsImg;
       tails = tailsImg;
      
}
 //methods (s)
 public void flip()
 {
    if (currentFace == 0){
        currentFace = 1;
    } 
    else {
        currentFace = 0;
    }
        
 }
  public void draw (Graphics g, int x, int y){
     if (currentFace==0)
     {
         //draw heads
         g.drawImage(heads,x,y,null);
        }
        else {
            //drawtails
            g.drawImage(tails,x,y,null);
        }
       
    
    }
   

}
 
