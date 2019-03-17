package project_rpg;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class Game extends JPanel implements KeyListener{
    
    Character chara = new Character();
    Wallup1 Panel1 = new Wallup1();
    Wallup2 Panel2 = new Wallup2();
    Wallup3 Panel3 = new Wallup3();
    Wallup4 Panel4 = new Wallup4();
    public Game() {
        
        addKeyListener( this);
        setFocusable(true);
    }
    
    public void move() {
        chara.move();
        
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        chara.paint(gr);
        Wallup1.paint(gr);
        Wallup2.paint(gr);
        Wallup3.paint(gr);
        Wallup4.paint(gr);
        
    }
    

    
    @Override
    public void keyTyped(KeyEvent ke) {
       
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            chara.Y -= 10;
        }
        if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            chara.Y +=10;
        }
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            chara.X -=10;
        }
        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            chara.X +=10;
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
}
