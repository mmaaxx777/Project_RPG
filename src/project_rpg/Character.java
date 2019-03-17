
package project_rpg;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public class Character {
   int X=290;
   int dy=0;
   int dx=0;
   int Y=50;
   int W=50;
   int H=70;
   
   
    public void move() {
       X+=dx;
       dx=0;
       Y+=dy;
       dy=0;
    }
   

   public void paint(Graphics gr) {
        
        gr.setColor(Color.red );
        gr.fillRect(X, Y, W, H);
        
}
public Rectangle getbounds(){
       return new Rectangle(X, Y, W, H);
    
}

}