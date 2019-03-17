
package project_rpg;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Project_RPG {

   
    public static void main(String[] args) {
       JFrame f=new JFrame();
       
       f.setSize(600, 500);

       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Game g=new Game();
       f.add(g);
       f.setVisible(true);
       
       while (true){
           g.move();
           g.repaint();
           try{
               Thread.sleep(10);
           } catch (InterruptedException ex){
               Logger.getLogger(Project_RPG.class.getName()).log(Level.SEVERE, null,ex);
           }
           }
       }
       
        
    }
    

